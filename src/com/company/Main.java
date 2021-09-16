package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//ax2 + bx + c = 0
        Scanner userInput1 = new Scanner(System.in);
        Scanner userInput2 = new Scanner(System.in);
        Scanner userInput3 = new Scanner(System.in);
        System.out.print("Input a value for a: ");

        if (!userInput1.hasNextInt()) {
            String word = userInput1.next();
            System.err.println(word + " is not a number");
            System.exit(0);
        } else {
            int a = userInput1.nextInt();


            System.out.print("Input a value for b: ");
            if (!userInput2.hasNextInt()) {
                String word = userInput2.next();
                System.err.println(word + " is not a number");
                System.exit(0);
            } else {
                int b = userInput2.nextInt();

                System.out.print("Input a value for c: ");
                if (!userInput3.hasNextInt()) {
                    String word = userInput3.next();
                    System.err.println(word + " is not a number");
                    System.exit(0);
                } else {
                    int c = userInput3.nextInt();

                    double d = (Math.pow(b, 2) - (4 * a * c));
                    double x1 = ((-b + Math.sqrt(d)) / 2 * a);
                    double x2 = ((-b - Math.sqrt(d)) / 2 * a);


                    if (x1 > 0 || x2 > 0) {
                        System.out.println("One answer to x is: " + x1);
                        System.out.println("Another answer to x is: " + x2);
                    } else if (x1 || x2 == 0) {
                        System.out.println("The only answer to x is: " + x1);
                    } else if (x1 || x2 < 0) {
                        System.out.println("There is no answers to x.");

                    }
                }
            }
        }
    }
}