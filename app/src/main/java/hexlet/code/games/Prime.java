package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {
    public static void primeGame() {
        String rules = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        String[][] taskAndAnswers = new String[Utils.countOfRounds()][2];
        for (var i = 0; i < Utils.countOfRounds(); i++) {
            var j = 0;
            final int minNumber = 2;
            final int maxNumber = 100;
            var randomNumber = Utils.randomNumber(minNumber, maxNumber);
            boolean isPrime = true;
            for (int iterator = 2; iterator <= Math.sqrt(randomNumber); iterator++) {
                if (randomNumber % iterator == 0) {
                    isPrime = false;
                    break;
                }
            }
            String task = String.valueOf(randomNumber);
            if (isPrime) {
                taskAndAnswers[i][j] = task;
                taskAndAnswers[i][j + 1] = "yes";
            } else {
                taskAndAnswers[i][j] = task;
                taskAndAnswers[i][j + 1] = "no";
            }
        }
        Engine.run(taskAndAnswers, rules);
    }
}
