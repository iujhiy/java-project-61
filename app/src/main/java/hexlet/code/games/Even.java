package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Scanner;
import java.util.Random;

public class Even {
    public static void evenGame() {
        Engine.greet();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        for (int i = 0; i < 3; i++) {
            String randomNumber = String.valueOf(random.nextInt(100));
            int randomNumberToInteger = Integer.parseInt(randomNumber);
            if (randomNumberToInteger % 2 == 0) {
                Engine.theLogicOfTheGame("yes", randomNumber);
            } else {
                Engine.theLogicOfTheGame("no", randomNumber);
            }
        }
        Engine.congratulations();
        scanner.close();
        System.exit(0);
    }
}
