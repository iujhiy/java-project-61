package hexlet.code;

import java.util.Scanner;
import java.util.Random;

public class Even {
    public static void even() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int counter = 0;
        System.out.print("May I have your name? ");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        for (int i = 0; i < 3; i++) {
            int randomNumber = random.nextInt(100);

            System.out.println("Question: " + randomNumber);
            String usersAnswer = scanner.next();
            System.out.println("Your answer: " + usersAnswer);
            if (randomNumber % 2 == 0 && usersAnswer.equals("no")) {
                System.out.println("'no' is wrong answer ;(. Correct answer was 'yes'.\nLet's try again, " + userName);
                System.exit(0);
            } else if (randomNumber % 2 != 0 && usersAnswer.equals("yes")) {
                System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.\nLet's try again, " + userName);
                System.exit(0);
            } else {
                System.out.println("Correct!");
                continue;
            }
        }
        System.out.println("Congratulations, " + userName);
        scanner.close();
    }
}
