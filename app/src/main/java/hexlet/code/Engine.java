package hexlet.code;

import hexlet.code.games.Calculate;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

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

    public static void theLogicOfTheGame(String[] taskAndRightAnswer) {
        var task = taskAndRightAnswer[0];
        var rightAnswer = taskAndRightAnswer[1];
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

    public static void choiceOfTheGame(String choice) {
        final int countOfRounds = 3;
        switch (choice) {
            case ("2"):
                Even.rulesOfTheGame();
                for (int i = 0; i < countOfRounds; i++) {
                    Engine.theLogicOfTheGame(Even.evenGame());
                }
                break;
            case ("3"):
                Calculate.rulesOfTheGame();
                for (int i = 0; i < countOfRounds; i++) {
                    Engine.theLogicOfTheGame(Calculate.calculateGame());
                }
                break;
            case ("4"):
                GCD.rulesOfTheGame();
                for (int i = 0; i < countOfRounds; i++) {
                    Engine.theLogicOfTheGame(GCD.gcdGame());
                }
                break;
            case ("5"):
                Progression.rulesOfTheGame();
                for (int i = 0; i < countOfRounds; i++) {
                    Engine.theLogicOfTheGame(Progression.progressionGame());
                }
                break;
            default:
                Prime.rulesOfTheGame();
                for (int i = 0; i < countOfRounds; i++) {
                    Engine.theLogicOfTheGame(Prime.primeGame());
                }
                break;
        }
    }
}
