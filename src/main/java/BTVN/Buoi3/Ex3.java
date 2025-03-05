package BTVN.Buoi3;

import java.util.Random;
import java.util.Scanner;

public class Ex3 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Random random = new Random();
            int randomNumber = random.nextInt(10) + 1;
            int count = 0;
            int guess = 0;

            System.out.println("Welcome to the Number Guessing Game!");
            System.out.println("I have selected a number between 1 and 10. Try to guess it!");

            while (guess != randomNumber) {
                System.out.print("Enter your guess: ");
                guess = sc.nextInt();
                count++;

                if (guess < randomNumber) {
                    System.out.println("Too low! Try again.");
                } else if (guess > randomNumber) {
                    System.out.println("Too high! Try again.");
                } else {
                    System.out.println("Correct! The number was " + randomNumber + ".");
                    System.out.println("It took you " + count + " attempts.");
                }
            }

            sc.close();
        }
    }



