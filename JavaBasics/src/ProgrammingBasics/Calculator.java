package ProgrammingBasics;

import java.util.Scanner;

/**
Calculator is capable of doing +,-,/,* operations based on input.
 Algorithm:
 1. print the description of calculator and its operations
 2. take input from the user to decide which Arithmetic operation to do.
 3. take two numbers as input from the user.
 4. then print the result.
 */

public class Calculator {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Welcome to calculator app. This app is capable of basic arithmetic operations");
        while(true){

            System.out.println();
            System.out.println();
            System.out.println("Enter a number from  1 to 4 to choose arithmetic operation.");
            System.out.println("1.Addition \n2.Subtraction \n3.Multiplication \n4.Division \n5.Exit");
            System.out.println("Enter a number from 1 to 5:");
            int operation = s.nextInt();
            if(operation == 5 ){
                System.out.println("Exiting............");
                System.exit(0);
            }
            System.out.println("Enter first number: ");
            int first = s.nextInt();
            System.out.println("Enter second number: ");
            int second = s.nextInt();
            if(operation == 1){
                int sum = first + second;
                System.out.println("Addition of " + first + " and " + second + "  =  "  +  sum);
            }
            else if(operation == 2){
                int difference = first - second;
                System.out.println("Subtraction of " + first+ " and " + second + " = " + difference);
            }
            else if(operation == 3){
                int mul = first * second;
                System.out.println("Multiplication of " + first + " and " + second + " = " + mul);
            }
            else if(operation == 4){
                int div = first/second;
                System.out.println("Division of " + first + " and " + second + " = " + div ) ;
            }
            else {
                System.out.println("Enter valid input. ");
            }
        }
    }
}