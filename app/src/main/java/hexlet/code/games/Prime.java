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
        for (int j = 0; j < 3; j++) {
            var randomNumber = random.nextInt(2, 100);
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
