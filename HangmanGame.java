package ch.tbz;

public class HangmanGame {

    public static void main(String[] args) {
        String wordToGuess = "stickman";
        String hiddenWord = "_".repeat(wordToGuess.length());

        int maxTries = 6;
        int wrongTries = 0;
        String guessedLetters = "";

        System.out.println("Willkommen beim Hangman-Spiel!");
        System.out.println("Errate das Wort: " + hiddenWord);

        while (wrongTries < maxTries && hiddenWord.contains("_")) {
            drawStickman(wrongTries);

            System.out.println("\nAktuelles Wort: " + hiddenWord);
            System.out.println("Geratene Buchstaben: " + guessedLetters);

            String input = inputString("Gib einen Buchstaben ein: ").toLowerCase();

            if (input.length() != 1) {
                System.out.println("Bitte gib nur einen Buchstaben ein!");
                continue;
            }

            char guessedLetter = input.charAt(0);

            if (guessedLetters.contains(String.valueOf(guessedLetter))) {
                System.out.println("Diesen Buchstaben hast du schon geraten!");
                continue;
            }

            guessedLetters += guessedLetter;

            if (wordToGuess.contains(String.valueOf(guessedLetter))) {
                StringBuilder newHiddenWord = new StringBuilder(hiddenWord);
                for (int i = 0; i < wordToGuess.length(); i++) {
                    if (wordToGuess.charAt(i) == guessedLetter) {
                        newHiddenWord.setCharAt(i, guessedLetter);
                    }
                }
                hiddenWord = newHiddenWord.toString();
            } else {
                wrongTries++;
            }
        }

        if (hiddenWord.equals(wordToGuess)) {
            System.out.println("\nGlückwunsch! Du hast das Wort erraten: " + wordToGuess);
        } else {
            drawStickman(wrongTries);
            System.out.println("\nGame Over! Das richtige Wort war: " + wordToGuess);
        }
    }

    // Eingabe-Methode ohne Scanner
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

    private static void drawStickman(int wrongTries) {
        System.out.println("\nFehler: " + wrongTries + " von 6");
        switch (wrongTries) {
            case 0 -> {
                System.out.println("  -----");
                System.out.println("  |   |");
                System.out.println("      |");
                System.out.println("      |");
                System.out.println("      |");
                System.out.println("      |");
                System.out.println("=========");
            }
            case 1 -> {
                System.out.println("  -----");
                System.out.println("  |   |");
                System.out.println("  O   |");
                System.out.println("      |");
                System.out.println("      |");
                System.out.println("      |");
                System.out.println("=========");
            }
            case 2 -> {
                System.out.println("  -----");
                System.out.println("  |   |");
                System.out.println("  O   |");
                System.out.println("  |   |");
                System.out.println("      |");
                System.out.println("      |");
                System.out.println("=========");
            }
            case 3 -> {
                System.out.println("  -----");
                System.out.println("  |   |");
                System.out.println("  O   |");
                System.out.println(" /|   |");
                System.out.println("      |");
                System.out.println("      |");
                System.out.println("=========");
            }
            case 4 -> {
                System.out.println("  -----");
                System.out.println("  |   |");
                System.out.println("  O   |");
                System.out.println(" /|\\  |");
                System.out.println("      |");
                System.out.println("      |");
                System.out.println("=========");
            }
            case 5 -> {
                System.out.println("  -----");
                System.out.println("  |   |");
                System.out.println("  O   |");
                System.out.println(" /|\\  |");
                System.out.println(" /    |");
                System.out.println("      |");
                System.out.println("=========");
            }
            case 6 -> {
                System.out.println("  -----");
                System.out.println("  |   |");
                System.out.println("  O   |");
                System.out.println(" /|\\  |");
                System.out.println(" / \\  |");
                System.out.println("      |");
                System.out.println("=========");
            }
        }
    }
}
