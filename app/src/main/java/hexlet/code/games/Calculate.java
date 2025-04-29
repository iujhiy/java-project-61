package hexlet.code.games;

import hexlet.code.Utils;

public class Calculate {
    public static String[][] calculateGame() {
        System.out.println("What is the result of the expression?");
        final int maxNumber = 100;
        final int maxSign = 3;
        String[][] taskAndAnswers = new String[Utils.countOfRounds()][2];
        for (var i = 0; i < Utils.countOfRounds(); i++) {
            var j = 0;
            int randomNumber1 = Utils.randomNumber(0, maxNumber);
            int randomNumber2 = Utils.randomNumber(0, maxNumber);
            int randomSign = Utils.randomNumber(0, maxSign);
            if (randomSign == 0) {
                String sumString = String.valueOf(randomNumber1 + randomNumber2);
                taskAndAnswers[i][j] = randomNumber1 + " + " + randomNumber2;
                taskAndAnswers[i][j + 1] = sumString;
            } else if (randomSign == 1) {
                String diffString = String.valueOf(randomNumber1 - randomNumber2);
                taskAndAnswers[i][j] = randomNumber1 + " - " + randomNumber2;
                taskAndAnswers[i][j + 1] = diffString;
            } else {
                String compositionString = String.valueOf(randomNumber1 * randomNumber2);
                taskAndAnswers[i][j] = randomNumber1 + " * " + randomNumber2;
                taskAndAnswers[i][j + 1] = compositionString;
            }
        }
        return taskAndAnswers;
    }
}
