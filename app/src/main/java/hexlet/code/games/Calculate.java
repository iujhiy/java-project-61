package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

public class Calculate {
    public static void calculateGame() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        Engine.Greet();
        System.out.println("What is the result of the expression?");
        for (int i = 0; i < 3; i++) {
            int randomNumber1 = random.nextInt(100);
            int randomNumber2 = random.nextInt(100);
            int randomSign = random.nextInt(3);
            if (randomSign == 0) {
                var sum = randomNumber1 + randomNumber2;
                String sumString = String.valueOf(sum);
                String task = String.valueOf(randomNumber1 + " + " + randomNumber2);
                Engine.theLogicOfTheGame(sumString, task);
            } else if (randomSign == 1) {
                var diff = randomNumber1 - randomNumber2;
                String diffString = String.valueOf(diff);
                String task = String.valueOf(randomNumber1 + " - " + randomNumber2);
                Engine.theLogicOfTheGame(diffString, task);
            } else if (randomSign == 2) {
                var composition = randomNumber1 * randomNumber2;
                String compositionString = String.valueOf(composition);
                String task = String.valueOf(randomNumber1 + " * " + randomNumber2);
                Engine.theLogicOfTheGame(compositionString, task);
            }
        }
        //System.out.println("Congratulations, " + userName);
        scanner.close();
        System.exit(0);
    }
}
