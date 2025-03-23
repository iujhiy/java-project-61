package hexlet.code.games;

import hexlet.code.Engine;

public class Even {
    public static void evenGame() {
        Engine.greet();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        final int maxNumber = 100;
        for (int i = 0; i < Engine.countOfRoundsOfTheGame(); i++) {
            String randomNumber = String.valueOf(Engine.randomNumber(1, maxNumber));
            int randomNumberToInteger = Integer.parseInt(randomNumber);
            if (randomNumberToInteger % 2 == 0) {
                Engine.theLogicOfTheGame("yes", randomNumber);
            } else {
                Engine.theLogicOfTheGame("no", randomNumber);
            }
        }
        Engine.congratulations();
        System.exit(0);
    }
}
