package MediumDificultyAssignment;//package MediumDificultyAssignment;

import java.util.Arrays;

public class PrimeNumber {
    static int count = 0, i = 1;

    int primeOrNot(int num) {
        if (i <= num) {
            if (num % i == 0) {
                count++;
            }
            i++;
            primeOrNot(num);
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