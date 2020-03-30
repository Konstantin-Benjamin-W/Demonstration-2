import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String [] args){
        int[] arr = {1, 2, 3, 4, 5};
        int[]afterReverse = reverseArray(arr.clone());
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(afterReverse));
    }

    public static int[] reverseArray(int[] array){
        for(int i = 0; i < array.length/2; i++){
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        return array;
    }
}