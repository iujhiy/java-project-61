package hexlet.code;

import hexlet.code.games.Engine;

import java.util.Scanner;
import java.util.Random;

public class Even {

    public static void Greet() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("May I have your name? ");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println("Answer 'yes' if the number is evenGame, otherwise answer 'no'.");
        scanner.close();
        evenGame(userName);
    }

    public static void evenGame(String userName) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randomNumber = random.nextInt(100);
        String rightAnswer = String.valueOf(randomNumber);
        System.out.println("Question: " + randomNumber);
        String userAnswer = scanner.next();
        System.out.println("Your answer: " + userAnswer);
        scanner.close();
        Engine.theLogicOfTheGame(rightAnswer, userAnswer);
    }
}
