package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

public class GCD {
    public static void gcdGame() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        Engine.greet();
        System.out.println("Find the greatest common divisor of given numbers.");
        int countOfRoundsOfTheGame = 3;
        int minNumber = 1;
        int maxNumber = 100;
        for (int i = 0; i < countOfRoundsOfTheGame; i++) {
            int gcd = 1;
            int randomNumber1 = random.nextInt(minNumber, maxNumber);
            int randomNumber2 = random.nextInt(minNumber, maxNumber);
            for (int j = 1; i <= randomNumber1 && j <= randomNumber2; j++) {
                if (randomNumber1 % j == 0 && randomNumber2 % j == 0) {
                    gcd = j;
                }
            }
            String gcdString = String.valueOf(gcd);
            Engine.theLogicOfTheGame(gcdString, randomNumber1 + " " + randomNumber2);
        }
        Engine.congratulations();
        scanner.close();
        System.exit(0);
    }
}
