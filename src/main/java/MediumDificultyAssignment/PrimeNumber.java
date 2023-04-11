package MediumDificultyAssignment;

import java.util.Arrays;

public class PrimeNumber {
    public void calculatePrimeNum(int[] inputArray) {
        int count = 0, varOne = 1;
        int lastNum = inputArray[inputArray.length - 1];
        int resultNum = lastNum <= 1 ? 1 : 2;
        switch (resultNum) {
            case 1:
                System.out.println(lastNum + " is a Not a prime number ");
                break;
            case 2:
                while (varOne <= lastNum) {
                    if (lastNum % varOne == 0) {
                        count++;
                    }
                    varOne++;
                }
                if (count == 2) {
                    swapArray(inputArray);
                    System.out.println(lastNum + " is a prime number ");
                    System.out.println("The swap array is: " + Arrays.toString(inputArray));
                } else
                    System.out.println(lastNum + " is a Not a prime number ");
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