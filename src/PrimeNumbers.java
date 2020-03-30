import java.util.Arrays;

public class PrimeNumbers<array2> {
    static int counter;
    static int[] arrayOfPrimeNumbers;

    public static void main(String[] args) {
        int start = -10;
        int end = 25;
        int[] array = new int[end + 1];
        int number;
        System.out.println(Arrays.toString(array));
        int[] arrayOfPrimeNumbers = findPrimeNumbers(start, end, array);
        System.out.println(Arrays.toString(arrayOfPrimeNumbers));
        biggestAndSmallestNumber(arrayOfPrimeNumbers);
    }

    public static int[] findPrimeNumbers(int start, int end, int[] array) {
        counter = 0;
        for (int i = start; i <= end; i++) {
            if (isPrimeNumber(i)) {
                counter++;
            }
        }
        int[] arrayOfPrimeNumbers = new int[counter];
        counter = 0;
        for (int i = start; i <= end; i++) {
            if (isPrimeNumber(i)) {
                arrayOfPrimeNumbers[counter] = i;
                counter++;
            }
        }
        return arrayOfPrimeNumbers;
    }

    private static boolean isPrimeNumber(int number) {
        if (number <= 1) {
            return false;
        }
        if (number == 2 | number == 3) {
            return true;
        }
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    //private static void biggestAndSmallestNumber(int[] arrayOfPrimeNumbers) {
    //    System.out.println(arrayOfPrimeNumbers[0]);
    //    System.out.println(arrayOfPrimeNumbers[arrayOfPrimeNumbers.length - 1]);
    //}

    private static void biggestAndSmallestNumber(int[] arrayOfPrimeNumbers) {
        for (int i = 1; i < arrayOfPrimeNumbers.length - 1; i++) {
            System.out.println(Math.max(arrayOfPrimeNumbers[i], arrayOfPrimeNumbers[i - 1]));
            System.out.println(Math.min(arrayOfPrimeNumbers[i], arrayOfPrimeNumbers[i + 1]));
        }
    }
}