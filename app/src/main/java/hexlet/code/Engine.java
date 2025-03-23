package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Engine {
    private static String userName;

    public static void greet() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Welcome to the Brain Games!\n" + "May I have your name? ");
        userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
    }

    public static int randomNumber(int min, int max) {
        Random random = new Random();
        return random.nextInt(min, max);
    }

    public static int countOfRoundsOfTheGame() {
        final int countOfRounds = 3;
        return countOfRounds;
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
