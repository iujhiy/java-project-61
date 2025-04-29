package hexlet.code;

import java.util.Random;

public class Utils {
    public static int randomNumber(int min, int max) {
        Random random = new Random();
        return random.nextInt(min, max);
    }
    public static int countOfRounds() {
        final int countOfRounds = 3;
        return countOfRounds;
    }
}
