package CWH.OOPS._3_Constructors.Practice;

import java.util.*;

public class Guess_The_Num {
    public static void main(String[] args) {
        Game g1 = new Game();
        g1.start();
    }
}

class Game {
    int guessedNum;
    int randomNum;
    int noOfGuess;

    Game() {
        Random random = new Random();
        this.randomNum = random.nextInt(100); // we can directly pass the bound here.
        noOfGuess = 10;
    }

    void start() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Total No. Of Guesses : " + noOfGuess);
        while (noOfGuess > 0) {
            System.out.println("Enter the Guess Number : ");
            guessedNum = sc.nextInt();
            if (guessedNum == randomNum) {
                System.out.println("You guess the correct Number!");
                System.out.println("You Win!");
                break;
            } else if (randomNum > guessedNum) {
                noOfGuess--;
                System.out.println(
                        "The Number " + guessedNum + " You guess is small than " + randomNum + " please  try again!");
            } else {
                noOfGuess--;
                System.out.println(
                        "The Number " + guessedNum + " You Guess is larger than " + randomNum + " please try again!");
            }
            System.out.println("No. of Guesses Left : " + noOfGuess);
        }
        if (noOfGuess == 0) {
            System.out.println("You loose!");
        }

        sc.close();
    }
}