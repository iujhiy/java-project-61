package hexlet.code.games;

import hexlet.code.Engine;

public class Prime {
    public static void primeGame() {
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        final int minNumber = 2;
        final int maxNumber = 100;
        var randomNumber = Engine.randomNumber(minNumber, maxNumber);
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
}
