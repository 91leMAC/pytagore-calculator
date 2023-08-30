package com.example.pytagorecalculator;
import java.util.Scanner;


public class PythagoreExecution
{
        public static void main(String[] args)
        {

            // Programm explainations

            // To user explainations
            System.out.println("This program will calculate the hypotenuse of a right triangle.");
            System.out.println("A will be the hypotenuse of the rectangle, so B and C are the variable that we \"know\"");


            // Set the variables
            int ac;
            int cb;
            String acInput = "";
            String cbInput = "";
            Scanner scanner = new Scanner(System.in);
            String error = "Error you must answer something.";
            int answerToAC = 0;
            int answerToCB = 0;

            // Request AC Lenght

            while (acInput.isEmpty())
            {
                System.out.println("Please reffer the value off the two \"know\" line in the triangle rectangle, rectangle in C");

                System.out.println("Mesure for ac lenght?");
                acInput = scanner.nextLine();
                if (acInput.isEmpty())
                {
                    System.out.println(error);
                }
                else
                {

                    ac = Integer.parseInt(acInput);
                    System.out.println("AC length are " + ac + " right now !");

                    answerToAC = ac * ac;

                }
            }


            // Request CB lenght
            while (cbInput.isEmpty())
            {
                System.out.println("Mesure for CB lenght?");
                cbInput = scanner.nextLine();
                if (cbInput.isEmpty())
                {
                    System.out.println(error);
                }
                else
                {

                    cb = Integer.parseInt(cbInput);
                    System.out.println("AC lenght are " + cb + " right now !");

                    answerToCB = cb * cb;

                }
            }


            int TheoremExecution = answerToAC + answerToCB;

            // Convert the result with the square root method
            short result = (short) Math.sqrt(TheoremExecution);
            System.out.print("The value for AB is: " + result + "!");

        }
}
