package hexlet.code;

import hexlet.code.games.*;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                3 - Calculate
                4 - GCD
                5 - Progression
                6 - Prime
                0 - Exit
                """);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Your choice: ");
        String choiceOfGame = scanner.nextLine();

        switch (choiceOfGame) {
            case("1"):
                Cli.welcome();
            case("2"):
                Even.evenGame();
            case("3"):
                Calculate.calculateGame();
            case("4"):
                GCD.GCDGame();
            case("5"):
                Progression.progressionGame();
            case("6"):
                Prime.primeGame();
            case("0"):
                scanner.close();
                System.exit(0);
            default:
                System.out.println("Error! Enter the correct value!");
                main(null);
        }
    }
}
