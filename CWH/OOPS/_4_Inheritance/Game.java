package CWH.OOPS._4_Inheritance;

import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Games g1 = new Games();

        while (g1.noOfGuess() > 0) {
            g1.takeUserInput(sc);

            boolean res = g1.isNumberCorrect();
            if (res) {
                System.out.println("Your Guess is correct!");
                System.out.printf("You did in %d guesses", 10 - g1.noOfGuess());
                break;
            } else {
                System.out.println("Try Again!");
                System.out.format("The no. Of tries left %d", g1.noOfGuess() -1); // either use printf
                System.out.println();

            }
            g1.updateGuess();
            System.out.println("------------------------------------------");
        }
        if (g1.noOfGuess() == 0) {
            System.out.println("You Loose!");
            System.out.println("The Number entered by the computer is " + g1.getRandomNumber());
        }
        sc.close();
    }
}

class Games {
    private int randomNum;
    private int noOfGuesses;
    private int userInput;

    Games() {
        System.out.println("The Game Begins : ");
        Random random = new Random();
        this.randomNum = random.nextInt(100);
        this.noOfGuesses = 10;
    }

    public void takeUserInput(Scanner sc) {
        System.out.println("Enter the Number :");
        this.userInput = Integer.valueOf(sc.nextLine());
    }

    public boolean isNumberCorrect() {
        if (randomNum == userInput) {
            return true;
        } else if (randomNum > userInput) {
            System.out.println("Too Low! ");
        } else {
            System.out.println("Too High! ");
        }
        return false;
    }

    public int noOfGuess() {
        return this.noOfGuesses;
    }

    public void updateGuess() {
        this.noOfGuesses--;
    }

    public int getRandomNumber() {
        return this.randomNum;
    }
}
