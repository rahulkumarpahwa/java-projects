package Project_1.typing_speed_master;

import java.util.concurrent.TimeUnit;
import java.time.LocalTime;
import java.util.Random;
import java.util.Scanner;

public class TypingSpeed {

    // Predefined list of words
    static String[] words = { "apple", "banana", "cherry", "date", "elderberry", "fig", "grape", "honeydew", "kiwi",
            "lemon" };

    // Leaderboard instance
    static Leaderboard leaderboard = new Leaderboard();

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Welcome to Typing Speed Master!");

        // Display a countdown before starting the typing test
        System.out.println("3");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("2");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("1");
        TimeUnit.SECONDS.sleep(1);

        // Generate and display 10 random words
        Random rand = new Random();
        StringBuilder displayedWords = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            String word = words[rand.nextInt(words.length)];
            displayedWords.append(word).append(" ");
            System.out.print(word + " ");
        }
        System.out.println();

        // Record the start time
        double startTime = LocalTime.now().toNanoOfDay();

        // Capture the user's input
        Scanner sc = new Scanner(System.in);
        String typedWords = sc.nextLine();

        // Record the end time
        double endTime = LocalTime.now().toNanoOfDay();
        double elapsedTime = endTime - startTime;
        double seconds = elapsedTime / 1000000000.0;

        // Calculate words per minute (WPM)
        int numberChars = typedWords.split("\\s+").length * 5;
        int WPM = (int) ((((double) numberChars / 5) / seconds) * 60);
        if (typedWords.trim().isEmpty()) {
            WPM = 0;
        }

        // Highlight errors
        String[] displayedWordsArray = displayedWords.toString().trim().split("\\s+");
        String[] typedWordsArray = typedWords.trim().split("\\s+");
        StringBuilder highlightedErrors = new StringBuilder();
        for (int i = 0; i < displayedWordsArray.length; i++) {
            if (i < typedWordsArray.length && displayedWordsArray[i].equals(typedWordsArray[i])) {
                highlightedErrors.append(typedWordsArray[i]).append(" ");
            } else {
                highlightedErrors.append("[").append(i < typedWordsArray.length ? typedWordsArray[i] : "").append("] ");
            }
        }

        // Calculate accuracy
        double accuracy = AccuracyCalculator.calculateAccuracy(displayedWordsArray, typedWordsArray);

        // Display the results
        System.out.println("Your input with errors highlighted: " + highlightedErrors.toString().trim());
        System.out.println("Your WPM is " + WPM + "!");
        System.out.println("Your accuracy is " + String.format("%.2f", accuracy) + "%");

        // Add the score to the leaderboard
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        leaderboard.addScore(name, WPM, accuracy);

        // Display the leaderboard
        leaderboard.displayLeaderboard();

        sc.close();
    }
}