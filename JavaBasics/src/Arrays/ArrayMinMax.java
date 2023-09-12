package Arrays;

public class ArrayMinMax {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < min){
                min = arr[i];
            }
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("Min = " + min + " & Max = " + max);
    }

}
