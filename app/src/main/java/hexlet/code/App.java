package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                0 - Exit""");

        Scanner scanner = new Scanner(System.in);
        String choiceOfGame = scanner.next();

        switch (choiceOfGame) {
            case("1"):
                Cli.welcome();
            case("2"):
                Even.even();
            case("0"):
                System.exit(0);
            default:
                System.out.println("Error! Enter the correct value!");
                main(null);
        }
    }
}
