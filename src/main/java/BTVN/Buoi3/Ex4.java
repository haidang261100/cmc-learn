package BTVN.Buoi3;

import java.util.Random;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int randomNumber;
        int count = 0;
        int guess = 0;
        int level;
        boolean result = false;

        System.out.println("Welcome to the Number Guessing Game! ");
        System.out.println("Choose a difficulty level: ");
        System.out.println("1. Easy (1-50) ");
        System.out.println("2. Medium (1-100) ");
        System.out.println("3. Hard (1-1000) ");
        System.out.println("Enter your choice (1/2/3): ");
        level = sc.nextInt();
        while (result == true){
        switch (level){
            case 1:
               randomNumber =  random.nextInt(50) + 1;
                while (guess != randomNumber) {
                    System.out.print("Enter your guess: ");
                    guess = sc.nextInt();
                    count++;

                    if (guess < randomNumber) {
                        System.out.println("Too low! Try again.");
                    } else if (guess > randomNumber) {
                        System.out.println("Too high! Try again.");
                    } else {
                        result = true;
                        System.out.println("Correct! The number was " + randomNumber + ".");
                        System.out.println("It took you " + count + " attempts.");
                    }
                }

                break;

            case 2:
                randomNumber =  random.nextInt(100) + 1;
                while (guess != randomNumber) {
                    System.out.print("Enter your guess: ");
                    guess = sc.nextInt();
                    count++;
                    if (guess < randomNumber) {
                        System.out.println("Too low! Try again.");
                    } else if (guess > randomNumber) {
                        System.out.println("Too high! Try again.");
                    } else {
                        result = true;
                        System.out.println("Correct! The number was " + randomNumber + ".");
                        System.out.println("It took you " + count + " attempts.");
                    }
                }

                break;

            case 3:
                randomNumber =  random.nextInt(1000) + 1;
                while (guess != randomNumber) {
                    System.out.print("Enter your guess: ");
                    guess = sc.nextInt();
                    count++;

                    if (guess < randomNumber) {
                        System.out.println("Too low! Try again.");
                    } else if (guess > randomNumber) {
                        System.out.println("Too high! Try again.");
                    } else {
                        result = true;
                        System.out.println("Correct! The number was " + randomNumber + ".");
                        System.out.println("It took you " + count + " attempts.");
                    }
                }
                break;


            default:
                System.out.println("Error! Please choose from 1 to 3.");
                level = sc.nextInt();
                continue;
        }


        }
        sc.close();




    }
}
