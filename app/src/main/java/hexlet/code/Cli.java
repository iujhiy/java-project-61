package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static void welcome() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Welcome to the Brain Games!\n" + "May I have your name? ");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        scanner.close();
        System.exit(0);
    }
}
