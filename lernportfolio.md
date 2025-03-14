# Modul 319

## Lernportfolio Donart Aslani

### Tag 1 (21.02.2025)

Heute haben wir in der ersten Lektion Informationen über den Ablauf des Moduls kennengelernt. Zudem haben wir uns mit der Website Miro befasst, mit der wir die Aufgaben erledigen können. Anschliessend haben wir mit Niveau 0 begonnen, wobei wir Fragen über SOI (Systematische Orientierung und Information) beantworten mussten.

#### Aufgaben

##### Aufgabe SOL

**Was ist ein Tandem?**

Ein Tandem ist eine Gruppe.

**Aus welchen Kompetenzen bildet sich die Handlungskompetenz?**

Es besteht aus Fach-, Methoden-, Sozial-, Lern- und Selbstkompetenz.

**Was ist der Unterschied zwischen einem Lern- und einem Nachweis-Portfolio?**

Ein Lern-Portfolio enthält Notizen und Fortschritte, während das Nachweis-Portfolio Beweise für erlernte Skills sammelt.

**Was ist ein Beleg und wozu wird er verwendet?**

Ein Beleg ist ein Nachweis, dass du eine Aufgabe erledigt hast.

**Wann ist ein Nachweis abgenommen?**

Ein Nachweis ist abgenommen, wenn dein Berufsbildner oder Lehrer ihn akzeptiert.

**Welche Regeln gelten im Schulzimmer?**

Im Schulzimmer gelten Regeln wie Pünktlichkeit, Respekt, kein Handy und vorbereitet sein.

### Tag 2 (28.02.2025)

Heute habe ich mich mit GitLab und Versionskontrolle beschäftigt. Ich verstehe jetzt besser, wie man Änderungen speichert, verwaltet und wiederherstellen kann. Besonders spannend fand ich GitHub Desktop, weil man dort die Änderungen farblich markiert sieht und alles übersichtlich bleibt.

In Java habe ich mein erstes kleines Programm in IntelliJ IDEA ausgeführt. Außerdem habe ich gelernt, dass der Java-Compiler (javac) den Code in Bytecode umwandelt und die JVM (java) ihn dann ausführt. Am Ende habe ich mein Java-Projekt ins Git-Repo hochgeladen – das fühlte sich ziemlich professionell an!

Insgesamt ein produktiver Tag, und ich merke, dass ich langsam den Durchblick bekomme.

#### Aufgaben

##### Aufgabe GitLab

**Was macht ein Versionskontrollsystem?**

Das Versionskontrollsystem verwendet Werkzeuge, um Änderungen oder Bearbeitungen zu verfolgen, die im Laufe der Zeit am Quellcode vorgenommen wurden.

**Welche GIT Server kennen Sie?**

Github, GitLab, Bitbucket

**Was braucht es auf dem lokalen Rechner, um ein GIT-Repo zu unterhalten?**

Man braucht einen GitLab Konto, ein Code Editor und Gitbash um den SSH Link auf deinem Rechner zu klonen.

**Das Konzept von Git verstehen (Screenccast ab Position 6:38)**

Ein Git-Account (z. B. auf GitHub, GitLab) verwaltet Repositories, die alle Versionen einer Datensammlung enthalten. Ein lokales Tool ermöglicht die Verwaltung dieser Repositories, indem Kopien vom Server (remote) auf den Rechner geladen werden („Fetch Origin“). Änderungen werden zunächst in einem Zwischenspeicher (Stage) markiert und dann ins lokale Repository übernommen. Anschließend kann das lokale Repository zur gemeinsamen Nutzung wieder auf den Server hochgeladen werden.

![GIT](images/Git%20konzept.png)

**Zwei Möglichkeiten, GIT-Kommandos auszuführen?**

Kommandozeile oder GUI-Tools verwenden.

**Bedienung und Funktionsweise von GitHUB-Desktop**

Ein Repository zeigt alte Versionen (History) und aktuelle Änderungen (Changes). Änderungen werden farblich markiert (rot = gelöscht/ersetzt, grün = neu) und können zur Stage hinzugefügt werden. Ein Commit speichert sie mit Name und Kommentar. Wichtige Funktionen: Fetch (Daten holen), Push (hochladen). Der Branch sollte „main“ oder „master“ sein.

**Kann Gitlab-Seite auf Englisch anzeigen lassen.**

Google Chrome: Ein Übersetzungs-Prompt erscheint automatisch. Klicke auf "English" oder rechtsklicke und wähle "Translate to English".

Mozilla Firefox: Installiere eine Übersetzungs-Erweiterung wie "To Google Translate", gehe zur Seite und nutze die Erweiterung, um zu übersetzen.

Microsoft Edge: Der Übersetzungs-Prompt erscheint automatisch. Klicke auf "Translate" oder rechtsklicke und wähle "Translate to English".
Safari (macOS): Klicke auf den "Translate"-Button in der Adressleiste und wähle Englisch.

##### Aufgabe Java IDE

**Wozu wird eine IDE verwendet?**

Eine IDE ist eine Entwicklungsumgebung zum Schreiben, Testen und Debuggen von Code.

**Welches ist die neueste Version der Java JDK?**

JDK 23 (2024) ist aktuell, die neueste LTS-Version ist JDK 21 (2023).

**Die JDK besteht aus einigen Programmen. Nenne die zwei wichtigsten Programme, um ein eigenes Programm entwickeln zu können.**

javac: Compiler, der Quellcode in Bytecode umwandelt.
java: Führt den Bytecode aus.

**Auf welchen Plattformen läuft JAVA?**

Java läuft auf Windows, macOS, Linux und anderen Systemen mit einer JVM.

**Erstes Programm in JAVA zum Laufen gebracht. (→ Einführung in das IDEA-Tutorial: "Hello IDEA" Min 2.00)**

Du hast ein einfaches "test_java"-Programm in Java ausgeführt.

**Nur für APIs und Profis: Mein erstes JAVA Programm (Projekt) in mein Git-Repo (Server) hochgeladen.**

Du hast dein erstes Java-Projekt in ein Git-Repository auf einem Server hochgeladen.

### Tag 3 (07.03.2025)

Heute habe ich mich mit den grundlegenden Konzepten der Programmierung beschäftigt. Ich habe gelernt, dass Variablen als Behälter für Werte dienen und Konstanten einmal festgelegte Werte beibehalten. Die Deklarierung definiert eine Variable, die Initialisierung weist ihr einen Wert zu, und die Verwendung nutzt die Variable im Code.

Der Gültigkeitsbereich (Scope) hängt von der Position der Deklarierung ab: Globale Variablen sind in der gesamten Klasse sichtbar, lokale Variablen nur in ihrer Methode oder ihrem Block. Eine globale Variable wird überdeckt, wenn eine lokale Variable denselben Namen hat und innerhalb ihrer Methode oder ihres Blocks Vorrang hat.

Insgesamt war es ein lehrreicher Tag, der meine Grundlagen in der Programmierung gestärkt hat.

#### Aufgabe JAVA Basics

**Sie kennen den Weg vom Quelltext zum Output in der JAVA-Welt.**

Ein Quellcode wird grundsätzlich entweder kompiliert" oder interpretiert:

Zuerst wird es in der Entwicklungszeit das Programm entwickelt. Danach wird der Gesamte Code bei der Laufzeit ausgeführt.

**Sie kennen die (drei) grundsätzlichen Konzepte der Programmerstellung (Übersetzung).**

Kompilierung – Übersetzung des gesamten Codes vor der Ausführung.
Interpretation – Zeilenweise Ausführung ohne vorherige vollständige Übersetzung.
Hybrid-Ansatz – Mischung aus Kompilierung und Interpretation.

**Was ist ein "Ausdruck", ein "Literal", ein "Operator" und ein "Bezeichner".**

Ausdruck – Eine Kombination aus Variablen, Literalen und Operatoren, die zu einem Wert ausgewertet wird.
Literal – Ein fester Wert direkt im Code (z. B. Zahlen, Zeichenketten).
Operator – Ein Symbol, das eine Operation auf Operanden ausführt (z. B. +, -, *).
Bezeichner – Der Name einer Variablen, Methode oder Klasse im Code.

**Kenne den strukturellen Aufbau eines JAVA Programms.**

![GIT](images/Struktur_einfach.jpg)

**Ein Projekt in der IDE mit "TBZ Template" eröffnet und ausgeführt.**

![Bild konzept GitLAb](images/Bild_Code_laden.png)

Bildbeschreibung: Hier wird der Code ausgeführt.

**Kann ein einfaches Programm nachvollziehen.**

Ein einfaches Prgramm kann durch lesen, Verstehen und Testen des Codes nachvollzogen werden.

**Kann mit eingegebenen Zahlen einfache Berechnungen kalkulieren.**

![GIT](images/Ausführung.png)

Bildbeschreibung: Sobald man dies Ausgeführt hat, kann man den Output sehen.

#### Aufgabe Variables_Constant

**Konzept der Variabeln (Konstanten) ist bekannt.  >> Behälter mit Name, Datentyp, Grösse und (fixem) Inhalt.**

![GIT](images/Screenshot_tabelle_variabeln.png)

**Erkenne Deklarierung, Initialisierung und Verwendung von Variablen (Konstanten).**

Die Deklaration einer Variable bedeutet, dass ihr Name und ihr Datentyp festgelegt werden, jedoch noch kein Wert zugewiesen wird. Erst bei der Initialisierung erhält die Variable ihren ersten Wert, wodurch der entsprechende Speicherplatz belegt wird. Eine Variable kann anschließend in verschiedenen Bereichen des Codes verwendet werden, beispielsweise in Berechnungen, Methoden oder zur Ausgabe von Werten.

**Kann den Gültigkeitbereich "setzen". (Position der Deklarierung im Code!).**

Der Gültigkeitsbereich (Scope) einer Variable hängt von ihrer Deklaration ab. Globale Variablen gelten in der ganzen Klasse, lokale Variablen nur innerhalb einer Methode, und Block-Variablen nur in ihrem {}-Block (z. B. Schleifen, If-Statements).

**Wann wird eine "globale" Variable übderdeckt?**

Eine globale Variable wird überdeckt, wenn innerhalb einer Methode oder eines Blocks eine lokale Variable mit demselben Namen deklariert wird. In diesem Fall hat die lokale Variable Vorrang, und die globale Variable ist innerhalb dieses Bereichs nicht direkt zugänglich. Sie kann jedoch mit this. (bei Instanzvariablen) oder dem Klassennamen (bei statischen Variablen) explizit angesprochen werden.

### Tag 4 (14.03.2025)

Heute hatten wir zuerst die D1 Prüfung gemacht, wobei unser Team 6 bestanden hatte. Als nächstes hatten wir uns mit der Teamarbeit einer Rechenaufgabe befasst, was für mich persönlich am Anfang nicht leicht war. Doch gegen Ende hatte ich es im griff und konnte ein selbstgemachtes Skript bilden.

### Tag 5 (21.03.2025)

### Tag 6 (28.03.2025)

### Tag 7 (04.04.2025)