package MediumDificultyAssignment;

import java.util.Arrays;

public class PrimeNumber {
    public static int count = 0, index = 1;

    public int primeOrNot(int lastNum) {
        if (index <= lastNum) {
            if (lastNum % index == 0) {
                count++;
            }
            index++;
            primeOrNot(lastNum);
        }
        return count;
    }

    public static void main(String arg[]) {
        PrimeNumber prime = new PrimeNumber();
        int[] inputArray = new int[]{1, 2, 3, 29};
        int lastNum = inputArray[inputArray.length - 1];

        int result = prime.primeOrNot(lastNum);
        if (result == 2) {
            System.out.println(lastNum + " : is prime number ");
            int temp = 0;
            temp = inputArray[0];
            inputArray[0] = inputArray[inputArray.length - 1];
            inputArray[inputArray.length - 1] = temp;
            System.out.println("The swap array is: " + Arrays.toString(inputArray));
        } else
            System.out.println("Not a prime number ");
    }
}