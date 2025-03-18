package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

public class Prime {
    public static void primeGame() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        Engine.greet();
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        final int countOfRoundsOfTheGame = 3;
        final int minNumber = 2;
        final int maxNumber = 100;
        for (int j = 0; j < countOfRoundsOfTheGame; j++) {
            var randomNumber = random.nextInt(minNumber, maxNumber);
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(randomNumber); i++) {
                if (randomNumber % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            String task = String.valueOf(randomNumber);
            if (isPrime) {
                Engine.theLogicOfTheGame("yes", task);
            } else {
                Engine.theLogicOfTheGame("no", task);
            }
        }
        Engine.congratulations();
        scanner.close();
        System.exit(0);
    }
}
