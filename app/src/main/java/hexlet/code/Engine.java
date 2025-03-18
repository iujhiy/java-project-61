package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static String userName;
    public static void greet() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Welcome to the Brain Games!\n" + "May I have your name? ");
        userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
    }
    public static void theLogicOfTheGame(String rightAnswer, String task) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Question: " + task);
        System.out.print("Your answer: ");
        String userAnswer = scanner.next();
        if (rightAnswer.equals(userAnswer)) {
            System.out.println("Correct!");
        } else {
            System.out.println("'" + userAnswer + "'" + "is wrong answer ;(. Correct answer was "
                    + "'" + rightAnswer + "'.");
            System.out.println("Let's try again, " + userName + "!");
            scanner.close();
            System.exit(0);
        }
    }
    public static void congratulations() {
        System.out.println("Congratulations, " + userName + "!");
    }
}
