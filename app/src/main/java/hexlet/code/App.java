package hexlet.code;

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
        Engine.gameSelection(choiceOfGame);
        scanner.close();
    }
}
