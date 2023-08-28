package com.example.pytagorecalculator;
import java.util.Scanner;

public class PythagoreExecution {
          public static void main(String[] args) {

            // To user explainations
            System.out.println("This program will calculate the hypotenuse of a right triangle.");
            System.out.println("A will be the hypotenuse of the rectangle, so B and C are the variable that we \"know\"");

            // Set the variables
            int ac;
            int cb;


            Scanner scanner = new Scanner(System.in);
            // Run the code
            System.out.println("Please reffer the value off the two \"know\" line in the triangle rectangle, rectangle in C");


            System.out.println("Mesure for ac lenght?");
            String text = scanner.nextLine();


                System.out.println("Please write an accepted number (without any letter)");

                ac = Integer.parseInt(text);
                System.out.println("AC length are " + ac + " right now !");

            System.out.println("Mesure for CB lenght?");
            text = scanner.nextLine();
            cb = Integer.parseInt(text);
            System.out.println("AC lenght are " +cb+ " right now !");


            int answerToAC = ac * ac;
            int answerToCB = cb * cb;
            int TheoremExecution = answerToAC + answerToCB;

            short result = (short) Math.sqrt(TheoremExecution);
            System.out.print("The value for AB is: " + result + "!");

        }
}
