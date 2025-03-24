package typing_speed_master;

import java.util.concurrent.TimeUnit;
import java.time.LocalTime;
import java.util.Random;
import java.util.Scanner;

public class TypingSpeed {

    // words
    static String[] words = { "apple", "banana", "cherry", "date", "elderberry", "fig", "grape", "honeydew", "kiwi",
            "lemon" };

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Welcome to Typing Speed Master!");

        // Display a countdown before starting the typing test
        System.out.println("3");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("2");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("1");
        TimeUnit.SECONDS.sleep(1);

        // generating a random word:
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            System.out.print(words[(rand.nextInt(10))] + " ");
        }
        // adding space
        System.out.println();

        // noting time after the words are printed:
        double startTime = LocalTime.now().toNanoOfDay();

        Scanner sc = new Scanner(System.in);
        // taking whole line with spaces
        String typedWords = sc.nextLine();

        // ending time after user hit enter:
        double endTime = LocalTime.now().toNanoOfDay();
        double elapsedTime = endTime - startTime;
        double seconds = elapsedTime / 1000000000.0;
        // System.out.println(seconds);

        // words per minute :
        // (x characters / 5) / 1 min = y WPM
        int numberChars = typedWords.split("\\s+").length * 5;
        int WPM = (int) ((((double) numberChars / 5) / seconds) * 60);
        if (typedWords.trim().isEmpty()) {
            WPM = 0;
        }
        System.out.println(typedWords);
        System.out.println("Your wpm is " + WPM + "!");
        sc.close();
    }
}