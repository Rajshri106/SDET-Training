package MediumDificultyAssignment;

import java.util.Arrays;

public class PrimeNumber {
    public void calculatePrimeNum(int[] inputArray) {
        int lastNum = inputArray[inputArray.length - 1];
        int resultNum = lastNum <= 1 ? 1 : lastNum == 2 ? 2 : 3;
        switch (resultNum) {
            case 1:
                System.out.println("The last number of array is not prime number: " + lastNum);
                break;
            case 2:
                System.out.println("The last number of array is prime number: " + lastNum);
                break;
            case 3:
                if ((lastNum / 2) % 2 == 0) {
                    System.out.println("The last number of array is not prime number: " + lastNum);
                } else {
                    swapArray(inputArray);
                    System.out.println("The last number of array is  prime number: " + lastNum);
                    System.out.println("The swap array is: " + Arrays.toString(inputArray));
                }
                break;
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
        int[] inputArray = new int[]{1, 2, 3, 7};
        int[] inputArrayOne = new int[]{1, 2, 3};
        int[] inputArrayTwo = new int[]{1, 6, 7, 9, 8};
        primeNumber.calculatePrimeNum(inputArray);
        primeNumber.calculatePrimeNum(inputArrayOne);
        primeNumber.calculatePrimeNum(inputArrayTwo);
    }
}