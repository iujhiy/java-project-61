package hexlet.code.games;

import hexlet.code.Engine;

public class Prime {
    public static void primeGame() {
        Engine.greet();
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        final int minNumber = 2;
        final int maxNumber = 100;
        for (int j = 0; j < Engine.countOfRoundsOfTheGame(); j++) {
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
        Engine.congratulations();
        System.exit(0);
    }
}
