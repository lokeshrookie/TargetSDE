package ProgrammingBasics;

//public class HelloWorld {
//    public static void main(String[] args) {
//
//    }
//}

import java.util.Scanner;

public class HelloWorld{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Two numbers  ");
        System.out.println("Enter first number: ");
        int a = input.nextInt();
        System.out.println("Enter second number: ");
        int b = input.nextInt();
        int c = a+b;
        System.out.println("The sum = " + c);
    }
}