package hexlet.code.games;

import hexlet.code.Engine;

public class Calculate {
    public static void calculateGame() {
        System.out.println("What is the result of the expression?");
        final int maxNumber = 100;
        final int maxSign = 3;
        int randomNumber1 = Engine.randomNumber(0, maxNumber);
        int randomNumber2 = Engine.randomNumber(0, maxNumber);
        int randomSign = Engine.randomNumber(0, maxSign);
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
}
