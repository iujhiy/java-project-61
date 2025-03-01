package hexlet.code.games;

import java.util.Scanner;

public class Engine {
    public static void Greet() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("May I have your name? ");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        scanner.close();
    }
    public static void theLogicOfTheGame(String rightAnswer, String userAnswer) {

    }
}
