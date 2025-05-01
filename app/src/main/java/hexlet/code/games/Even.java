package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    public static void evenGame() {
        String rules = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        final int maxNumber = 100;
        String[][] taskAndAnswers = new String[Utils.countOfRounds()][2];
        for (var i = 0; i < Utils.countOfRounds(); i++) {
            var j = 0;
            String randomNumber = String.valueOf(Utils.randomNumber(1, maxNumber));
            int randomNumberToInteger = Integer.parseInt(randomNumber);
            if (randomNumberToInteger % 2 == 0) {
                taskAndAnswers[i][j] = randomNumber;
                taskAndAnswers[i][j + 1] = "yes";
            } else {
                taskAndAnswers[i][j] = randomNumber;
                taskAndAnswers[i][j + 1] = "no";
            }
        }
        Engine.run(taskAndAnswers, rules);
    }
}
