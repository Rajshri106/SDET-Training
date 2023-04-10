package MediumDificultyAssignment;

import java.util.Arrays;

public class PrimeNumber {
    public void calculatePrimeNum(int[] intArray) {
        int lastNum = intArray[intArray.length - 1];
        if (lastNum <= 1)
            System.out.println("The last number of array is not prime number: " + lastNum);
        else if (lastNum == 2) {
            swapArray(intArray);
            System.out.println("The last number of array is  prime number: " + lastNum);
            System.out.println("The swap array is: " + Arrays.toString(intArray));
        } else if (lastNum % 2 == 0) {
            System.out.println("The last number of array is not prime number: " + lastNum);
        } else {
            swapArray(intArray);
            System.out.println("The last number of array is  prime number: " + lastNum);
            System.out.println("The swap array is: " + Arrays.toString(intArray));
        }
    }
    public void swapArray(int intArray[])
    {
        int temp=0;
        temp = intArray[0];
        intArray[0] = intArray[intArray.length - 1];
        intArray[intArray.length - 1] = temp;
    }

    public static void main(String[] args) {
        PrimeNumber primeNumber = new PrimeNumber();
        int[] intArray = new int[]{1, 2, 3, 7};
        int[] intArray1 = new int[]{1, 2, 3};
        int[] intArray2 = new int[]{1, 6, 7, 9, 8};
        primeNumber.calculatePrimeNum(intArray);
        primeNumber.calculatePrimeNum(intArray1);
        primeNumber.calculatePrimeNum(intArray2);
    }
}