package hexlet.code.games;

import hexlet.code.Engine;

public class GCD {
    public static void gcdGame() {
        System.out.println("Find the greatest common divisor of given numbers.");
        final int minNumber = 1;
        final int maxNumber = 100;
        int gcd = 1;
        int randomNumber1 = Engine.randomNumber(minNumber, maxNumber);
        int randomNumber2 = Engine.randomNumber(minNumber, maxNumber);
        for (int j = 1; j <= randomNumber1 && j <= randomNumber2; j++) {
            if (randomNumber1 % j == 0 && randomNumber2 % j == 0) {
                gcd = j;
            }
        }
        String gcdString = String.valueOf(gcd);
        Engine.theLogicOfTheGame(gcdString, randomNumber1 + " " + randomNumber2);
    }
}
