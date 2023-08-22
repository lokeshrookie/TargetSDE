package ProgrammingBasics;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Calculator2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int answer = 0;
        while(true){
            System.out.println("Enter a number from 1 to 5.");
            System.out.println("1.Additoin \n2.Subtraction \n3.Multiplication \n4.Division \n5.Exit");
            int operator = s.nextInt();
            if(operator == 5){
                System.out.println("Exiting....");
                System.exit(0);
            }
            if(operator>=1 && operator<=4){
                System.out.print("Enter first number: ");
                int first =s.nextInt();
                System.out.print("Enter second number: ");
                int second = s.nextInt();
                if(operator == 1){
                    answer = first+second;
                }
                if(operator == 2 ){
                    answer = first - second;
                }
                if(operator == 3){
                    answer = first*second;
                }
                if(operator == 4){
                    if(second != 0){
                        answer = first/second;
                    }
                }
            }
            System.out.println(answer);
        }
    }
}
