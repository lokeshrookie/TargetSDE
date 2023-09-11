package Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SortColors {
    public static void main(String[] args) {
        int[] arr = {0,1,2,2,1,0};
        sort012(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    // bruteforce approach
    public static void sort012(int[] a, int n)
    {
        int zeros = 0;
        int ones = 0;
        int twos = 0;
        for(int i = 0; i<a.length; i++){
            if(a[i] == 0){
                zeros++;
            }
            else if(a[i] == 1){
                ones++;
            }
            else{
                twos++;
            }
        }

        int i = 0;
        while(zeros > 0|| ones > 0 || twos > 0){
            while(zeros > 0){
                a[i] = 0;
                i++;
                zeros--;
            }
            while(ones > 0){
                a[i] = 1;
                i++;
                ones--;
            }
            while(twos > 0){
                a[i] = 2;
                i++;
                twos--;
            }
        }
    }


    //optimised approach
    public static void optimisedSort012(int[] a, int n){

    }
}


