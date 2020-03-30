import java.util.Arrays;

public class DoingWithArrays {
    public static void main(String[] args) {
        int [] array = {2, 5, 18, 26, 45};
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(reverseArray(array)));
        int newValue = 38;
        System.out.println(Arrays.toString(addingElementToArray(array, newValue)));
    }

    public static int[] reverseArray(int[] array) {
        int [] secondArray = new int [array.length];
        for (int i = 0; i < array.length; i++) {
            secondArray[array.length - 1 - i] = array[i];
            System.out.println(secondArray[array.length - 1 - i]);
        }
    return secondArray;
    }

    public static int[] addingElementToArray(int[] array, int newValue) {
        int[] biggerArray = new int[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            biggerArray[i] = array[i];
        }
        biggerArray[array.length] = newValue;
    return biggerArray;
    }
}