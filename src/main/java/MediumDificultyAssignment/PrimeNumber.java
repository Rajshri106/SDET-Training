package MediumDificultyAssignment;

import java.util.Arrays;

public class PrimeNumber {
    public void calculatePrimeNum(int[] inputArray) {
        boolean flag = false;
        int lastNum = inputArray[inputArray.length - 1];
        if (lastNum <= 1)
            System.out.println("The last number of array is not prime number: " + lastNum);
        for (int index = 2; index <= lastNum / 2; index++) {
            if (lastNum % index == 0) {
                System.out.println("The last number of array is not prime number: " + lastNum);
                flag = true;
                break;
            }
        }
        if (!flag) {
            swapArray(inputArray);
            System.out.println("The last number of array is  prime number: " + lastNum);
            System.out.println("The swap array is: " + Arrays.toString(inputArray));
        }
    }

    public void swapArray(int[] inputArray) {
        int temp = 0;
        temp = inputArray[0];
        inputArray[0] = inputArray[inputArray.length - 1];
        inputArray[inputArray.length - 1] = temp;
    }

    public static void main(String[] args) {
        PrimeNumber primeNumber = new PrimeNumber();
        int[] inputArray = new int[]{1, 2, 3, 9};
        int[] inputArray1 = new int[]{1, 2, 3};
        int[] inputArray2 = new int[]{1, 6, 7, 9, 8};
        primeNumber.calculatePrimeNum(inputArray);
        primeNumber.calculatePrimeNum(inputArray1);
        primeNumber.calculatePrimeNum(inputArray2);
    }
}