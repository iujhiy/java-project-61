package hexlet.code.games;

import hexlet.code.Engine;

public class Progression {
    public static void progressionGame() {
        Engine.greet();
        System.out.println("What number is missing in the progression?");
        final int minLengthOfProgression = 5;
        final int maxLengthOfProgression = 10;
        final int minStepOfProgression = 1;
        final int maxStepOfProgression = 15;
        final int maxElementOfProgression = 15;
        for (int i = 0; i < Engine.countOfRoundsOfTheGame(); i++) {
            int lengthOfProgression = Engine.randomNumber(minLengthOfProgression, maxLengthOfProgression);
            int stepOfProgression = Engine.randomNumber(minStepOfProgression, maxStepOfProgression);
            int elementOfProgression = Engine.randomNumber(0, maxElementOfProgression);
            StringBuilder progressionStringBuilder = new StringBuilder();
            for (int j = 0; j < lengthOfProgression; j++) {
                progressionStringBuilder.append(elementOfProgression).append(" ");
                elementOfProgression += stepOfProgression;
            }
            int randomElement = Engine.randomNumber(0, lengthOfProgression);
            String[] progressionString = progressionStringBuilder.toString().split(" ");
            var rightAnswer = progressionString[randomElement];
            progressionString[randomElement] = "..";
            String task = String.join(" ", progressionString);
            Engine.theLogicOfTheGame(rightAnswer, task);
        }
        Engine.congratulations();
        System.exit(0);
    }
}
