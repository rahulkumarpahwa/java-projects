package typing_speed_master;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Leaderboard {

    // Inner class to represent a score entry
    static class ScoreEntry {
        String name;
        int wpm;
        double accuracy;

        ScoreEntry(String name, int wpm, double accuracy) {
            this.name = name;
            this.wpm = wpm;
            this.accuracy = accuracy;
        }

        @Override
        public String toString() {
            return name + ": " + wpm + " WPM, " + String.format("%.2f", accuracy) + "% Accuracy";
        }
    }

    // List to store the score entries
    private List<ScoreEntry> scores = new ArrayList<>();

    // Constructor to load the previous leaderboard from the file
    public Leaderboard() {
        loadLeaderboard();
    }

    // Method to add a new score entry
    public void addScore(String name, int wpm, double accuracy) {
        scores.add(new ScoreEntry(name, wpm, accuracy));
        // Sort the scores in descending order of WPM and accuracy
        Collections.sort(scores, Comparator.comparingInt((ScoreEntry entry) -> entry.wpm)
                .thenComparingDouble(entry -> entry.accuracy).reversed());
        // Log the leaderboard to a file
        logLeaderboard();
    }

    // Method to display the leaderboard
    public void displayLeaderboard() {
        System.out.println("Leaderboard:");
        for (int i = 0; i < scores.size(); i++) {
            System.out.println((i + 1) + ". " + scores.get(i));
        }
    }

    // Method to log the leaderboard to a file
    private void logLeaderboard() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("./leaderboard.log", false))) {
            writer.write("Leaderboard:\n");
            for (ScoreEntry score : scores) {
                writer.write(score + "\n");
            }
            writer.write("\n");
        } catch (IOException e) {
            System.err.println("Error writing to leaderboard log file: " + e.getMessage());
        }
    }

    // Method to load the leaderboard from a file
    private void loadLeaderboard() {
        try (BufferedReader reader = new BufferedReader(new FileReader("./leaderboard.log"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.startsWith("Leaderboard:") || line.trim().isEmpty()) {
                    continue;
                }
                String[] details = line.split(": ");
                String name = details[0].trim();
                String[] stats = details[1].split(" ");
                int wpm = Integer.parseInt(stats[0]);
                double accuracy = Double.parseDouble(stats[2].replace("%", ""));
                scores.add(new ScoreEntry(name, wpm, accuracy));
            }
            // Sort the scores in descending order of WPM and accuracy
            Collections.sort(scores, Comparator.comparingInt((ScoreEntry entry) -> entry.wpm)
                    .thenComparingDouble(entry -> entry.accuracy).reversed());
        } catch (IOException e) {
            System.err.println("Error reading from leaderboard log file: " + e.getMessage());
        }
    }
}