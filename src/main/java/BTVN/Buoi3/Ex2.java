package BTVN.Buoi3;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);
                System.out.print("Enter your percentage: ");
                int percen = sc.nextInt();
                int gradeCategory = percen / 10;
                String grade;
                switch (gradeCategory) {
                    case 10:
                    case 9:
                        grade = "A";
                        break;
                    case 8:
                        grade = "B";
                        break;
                    case 7:
                        grade = "C";
                        break;
                    case 6:
                        grade = "D";
                        break;
                    default:
                        grade = "F";
                }
                System.out.println("Your grade is " + grade);
                sc.close();
            }
        }


