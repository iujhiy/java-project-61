package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

public class Calculate {
    public static void calculateGame() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        Engine.greet();
        System.out.println("What is the result of the expression?");
        int countOfRoundsOfTheGame = 3;
        int maxNumber = 100;
        int maxSign = 3;
        for (int i = 0; i < countOfRoundsOfTheGame; i++) {
            int randomNumber1 = random.nextInt(maxNumber);
            int randomNumber2 = random.nextInt(maxNumber);
            int randomSign = random.nextInt(maxSign);
            if (randomSign == 0) {
                String sumString = String.valueOf(randomNumber1 + randomNumber2);
                Engine.theLogicOfTheGame(sumString, randomNumber1 + " + " + randomNumber2);
            } else if (randomSign == 1) {
                String diffString = String.valueOf(randomNumber1 - randomNumber2);
                Engine.theLogicOfTheGame(diffString, randomNumber1 + " - " + randomNumber2);
            } else {
                String compositionString = String.valueOf(randomNumber1 * randomNumber2);
                Engine.theLogicOfTheGame(compositionString, randomNumber1 + " * " + randomNumber2);
            }
        }
        Engine.congratulations();
        scanner.close();
        System.exit(0);
    }
}
