package hexlet.code;

import hexlet.code.games.Calculate;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

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
        switch (choiceOfGame) {
            case("1"):
                Cli.welcome();
            case("2"):
                Even.evenGame();
            case("3"):
                Calculate.calculateGame();
            case("4"):
                GCD.gcdGame();
            case("5"):
                Progression.progressionGame();
            case("6"):
                Prime.primeGame();
            default:
                System.out.println("Error! There is no such game.");
        }
        scanner.close();
    }
}
