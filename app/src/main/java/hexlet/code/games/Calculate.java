package hexlet.code.games;

import hexlet.code.Engine;

public class Calculate {
    public static void rulesOfTheGame() {
        System.out.println("What is the result of the expression?");
    }
    public static String[] calculateGame() {
        final int maxNumber = 100;
        final int maxSign = 3;
        int randomNumber1 = Engine.randomNumber(0, maxNumber);
        int randomNumber2 = Engine.randomNumber(0, maxNumber);
        int randomSign = Engine.randomNumber(0, maxSign);
        if (randomSign == 0) {
            String sumString = String.valueOf(randomNumber1 + randomNumber2);
            return new String[] {randomNumber1 + " + " + randomNumber2, sumString};
        } else if (randomSign == 1) {
            String diffString = String.valueOf(randomNumber1 - randomNumber2);
            return new String[] {randomNumber1 + " - " + randomNumber2, diffString};
        } else {
            String compositionString = String.valueOf(randomNumber1 * randomNumber2);
            return new String[] {randomNumber1 + " * " + randomNumber2, compositionString};
        }
    }
}
