package BTVN.Buoi2;

import java.util.Scanner;

public class Buoi2 {

   static Scanner sc = new Scanner(System.in);

    public static void simpleCalculator(){
        System.out.println("Enter the first integer: ");
        int firstNo = sc.nextInt();
        System.out.println("Enter the second integer: ");
        int secondNo = sc.nextInt();
        int  addition = firstNo + secondNo;
        int subtraction = firstNo - secondNo;
        int multiplication = firstNo * secondNo;
        int division = firstNo / secondNo;
        System.out.println("Addition: " + addition);
        System.out.println("subtraction: " + subtraction);
        System.out.println("multiplication: " + multiplication);
        System.out.println("division: " + division);
        sc.close();

    }
    public static  void temperatureConverter(){
        System.out.print("Enter temperature in Celsius: ");
        double celsius = sc.nextDouble();
        double fahrenheit = (celsius * 9/5) + 32;
        System.out.println("Temperature in Fahrenheit: " + fahrenheit);
        sc.close();

    }

    public static  void BMICalculator(){
        System.out.print("Enter your weight in kilograms: ");
        double weight = sc.nextDouble();
        System.out.print("Enter your height in meters: ");
        double height = sc.nextDouble();
        double bmi = weight / (height * height);
        System.out.println("Your BMI is: " + bmi);
        sc.close();

    }

    public static  void counterProgram(){
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();
        number++;
        System.out.println("After incrementing: " + number);
        number--;
        System.out.println("After decrementing: " + number);
        sc.close();

    }

    public static  void leapYearChecker(){

        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println(year + " is a leap year.");
                } else {
                    System.out.println(year + " is not a leap year.");
                }
            } else {
                System.out.println(year + " is a leap year.");
            }
        } else {
            System.out.println(year + " is not a leap year.");
        }

        sc.close();

    }

    public static void main(String[] args) {
//        simpleCalculator();
//        temperatureConverter();
//        BMICalculator();
//        counterProgram();
        leapYearChecker();
    }
}
