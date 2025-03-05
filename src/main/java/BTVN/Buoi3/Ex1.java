package BTVN.Buoi3;

public class Ex1 {
    public static void main(String[] args) {
                for (int i = 1; i <= 100; i++) {
                    String output = "";
                    switch (i % 3) {
                        case 0:
                            output += "Fizz";
                    }
                    switch (i % 5) {
                        case 0:
                            output += "Buzz";
                    }
                    switch (output) {
                        case "":
                            System.out.println(i);
                            break;
                        default:
                            System.out.println(output);
                    }
                }
            }
        }



