package hexlet.code;

//import hexlet.code.games.Calculate;
//import hexlet.code.games.Even;
//import hexlet.code.games.GCD;
//import hexlet.code.games.Prime;
//import hexlet.code.games.Progression;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("""
                Welcome to the Brain Games!
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                3 - Calculate
                4 - GCD
                5 - Progression
                6 - Prime
                0 - Exit
                """ + "Your choice: ");
        Scanner scanner = new Scanner(System.in);
        String choiceOfGame = scanner.nextLine();
        final int countOfRounds = 3;
        if (choiceOfGame.equals("2")
                || choiceOfGame.equals("3")
                || choiceOfGame.equals("4")
                || choiceOfGame.equals("5")
                || choiceOfGame.equals("6")
        ) {
            Engine.greet();
            for (int i = 0; i < countOfRounds; i++) {
                Engine.choiceOfTheGame(choiceOfGame);
            }
            Engine.congratulations();
            scanner.close();
        } else {
            switch (choiceOfGame) {
                case ("1"):
                    Cli.welcome();
                    break;
                case ("0"):
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Error! Enter the correct value!");
                    main(null);
            }
        }
    }
}
