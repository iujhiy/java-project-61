package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {
    public static void progressionGame() {
        String rules = "What number is missing in the progression?";
        final int minLengthOfProgression = 5;
        final int maxLengthOfProgression = 10;
        final int minStepOfProgression = 1;
        final int maxStepOfProgression = 15;
        final int maxElementOfProgression = 15;
        String[][] taskAndAnswers = new String[Utils.countOfRounds()][2];
        for (var i = 0; i < Utils.countOfRounds(); i++) {
            var j = 0;
            int lengthOfProgression = Utils.randomNumber(minLengthOfProgression, maxLengthOfProgression);
            int stepOfProgression = Utils.randomNumber(minStepOfProgression, maxStepOfProgression);
            int elementOfProgression = Utils.randomNumber(0, maxElementOfProgression);
            StringBuilder progressionStringBuilder = new StringBuilder();
            for (int iterator = 0; iterator < lengthOfProgression; iterator++) {
                progressionStringBuilder.append(elementOfProgression).append(" ");
                elementOfProgression += stepOfProgression;
            }
            int randomElement = Utils.randomNumber(0, lengthOfProgression);
            String[] progressionString = progressionStringBuilder.toString().split(" ");
            var rightAnswer = progressionString[randomElement];
            progressionString[randomElement] = "..";
            String task = String.join(" ", progressionString);
            taskAndAnswers[i][j]  = task;
            taskAndAnswers[i][j + 1] = rightAnswer;
        }
        Engine.run(taskAndAnswers, rules);
    }
}
