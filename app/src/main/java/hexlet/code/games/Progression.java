package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

public class Progression {
    public static void progressionGame() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        Engine.greet();
        System.out.println("What number is missing in the progression?");
        int countOfRoundsOfTheGame = 3;
        int minLengthOfProgression = 5;
        int maxLengthOfProgression = 10;
        int minStepOfProgression = 1;
        int maxStepOfProgression = 15;
        int maxElementOfProgression = 15;
        for (int i = 0; i < countOfRoundsOfTheGame; i++) {
            int lengthOfProgression = random.nextInt(minLengthOfProgression, maxLengthOfProgression);
            int stepOfProgression = random.nextInt(minStepOfProgression, maxStepOfProgression);
            int elementOfProgression = random.nextInt(maxElementOfProgression);
            StringBuilder progressionStringBuilder = new StringBuilder();
            for (int j = 0; j < lengthOfProgression; j++) {
                progressionStringBuilder.append(elementOfProgression).append(" ");
                elementOfProgression += stepOfProgression;
            }
            int randomElement = random.nextInt(0, lengthOfProgression);
            String[] progressionString = progressionStringBuilder.toString().split(" ");
            var rightAnswer = progressionString[randomElement];
            progressionString[randomElement] = "..";
            String task = String.join(" ", progressionString);
            Engine.theLogicOfTheGame(rightAnswer, task);
        }
        Engine.congratulations();
        scanner.close();
        System.exit(0);
    }
}
