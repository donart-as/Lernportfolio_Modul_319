package ch.tbz;
 
public class TicTacToe {
  private static final char EMPTY = '-';
  private static final char PLAYER_X = 'X';
  private static final char PLAYER_O = 'O';
  private static char[][] board = {
      { EMPTY, EMPTY, EMPTY },
      { EMPTY, EMPTY, EMPTY },
      { EMPTY, EMPTY, EMPTY }
  };
  private static char currentPlayer = PLAYER_X;
 
  public static void main(String[] args) {
    System.out.println("Willkommen zu Tic-Tac-Toe!");
    printBoard();
 
    while (true) {
      String input = inputString("\nSpieler " + currentPlayer + ", gib deine Position (z.B. 1 2): ");
      if (input.matches("\\d \\d")) {
        int row = Character.getNumericValue(input.charAt(0));
        int col = Character.getNumericValue(input.charAt(2));
 
        if (row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == EMPTY) {
          board[row][col] = currentPlayer;
          printBoard();
 
          if (checkWin()) {
            System.out.println("\nSpieler " + currentPlayer + " hat gewonnen!");
            break;
          } else if (isBoardFull()) {
            System.out.println("\nUnentschieden!");
            break;
          }
 
          currentPlayer = (currentPlayer == PLAYER_X) ? PLAYER_O : PLAYER_X;
        } else {
          System.out.println("Ungültiger Zug, versuche es erneut.");
        }
      } else {
        System.out.println("Bitte gib eine gültige Position ein (z.B. 1 2).");
      }
    }
  }
 
  private static void printBoard() {
    System.out.println("\nAktuelles Spielfeld:");
    for (char[] row : board) {
      for (char cell : row) {
        System.out.print(cell + " ");
      }
      System.out.println();
    }
  }
 
  private static boolean checkWin() {
    for (int i = 0; i < 3; i++) {
      if (board[i][0] == currentPlayer && board[i][1] == currentPlayer && board[i][2] == currentPlayer)
        return true;
      if (board[0][i] == currentPlayer && board[1][i] == currentPlayer && board[2][i] == currentPlayer)
        return true;
    }
    return (board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer) ||
        (board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer);
  }
 
  private static boolean isBoardFull() {
    for (char[] row : board) {
      for (char cell : row) {
        if (cell == EMPTY) {
          return false;
        }
      }
    }
    return true;
  }
 
  private static String inputString(String prompt) {
    System.out.print(prompt);
    java.io.Console console = System.console();
    if (console != null) {
      return console.readLine();
    } else {
      try {
        byte[] inputBytes = new byte[100];
        int length = System.in.read(inputBytes);
        return new String(inputBytes, 0, length).trim();
      } catch (Exception e) {
        return "";
      }
    }
  }
}
 
 