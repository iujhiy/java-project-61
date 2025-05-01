package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static void run(String[][] taskAndRightAnswer, String rules) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Welcome to the Brain Games!\n" + "May I have your name? ");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println(rules);
        for (int row = 0; row < Utils.countOfRounds(); row++) {
            var column = 0;
            var task = taskAndRightAnswer[row][column];
            var rightAnswer = taskAndRightAnswer[row][column + 1];
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
        System.out.println("Congratulations, " + userName + "!");
        System.exit(0);
    }
}
