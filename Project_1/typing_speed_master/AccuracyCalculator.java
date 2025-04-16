package Project_1.typing_speed_master;

public class AccuracyCalculator {

    // Method to calculate the accuracy of the user's typing
    public static double calculateAccuracy(String[] displayedWords, String[] typedWords) {
        int correctWords = 0;
        int totalWords = displayedWords.length;

        for (int i = 0; i < totalWords; i++) {
            if (i < typedWords.length && displayedWords[i].equals(typedWords[i])) {
                correctWords++;
            }
        }

        return (double) correctWords / totalWords * 100;
    }
}