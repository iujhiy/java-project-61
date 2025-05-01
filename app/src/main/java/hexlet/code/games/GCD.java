package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GCD {
    public static void gcdGame() {
        String rules = "Find the greatest common divisor of given numbers.";
        final int minNumber = 1;
        final int maxNumber = 100;
        String[][] taskAndAnswers = new String[Utils.countOfRounds()][2];
        for (var i = 0; i < Utils.countOfRounds(); i++) {
            int gcd = 1;
            int randomNumber1 = Utils.randomNumber(minNumber, maxNumber);
            int randomNumber2 = Utils.randomNumber(minNumber, maxNumber);
            for (int j = 1; j <= randomNumber1 && j <= randomNumber2; j++) {
                if (randomNumber1 % j == 0 && randomNumber2 % j == 0) {
                    gcd = j;
                }
            }
            String gcdString = String.valueOf(gcd);
            var j = 0;
            taskAndAnswers[i][j] = randomNumber1 + " " + randomNumber2;
            taskAndAnswers[i][j + 1] = gcdString;
        }
        Engine.run(taskAndAnswers, rules);
    }
}
