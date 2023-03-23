
/*Q3. Given an array of ints, swap the first and last elements in the array. Return the modified array.
If the last array value is prime no.  
swapEnds([1, 2, 3, 7]) → [7, 2, 3, 1] 
swapEnds([1, 2, 3]) → [3, 2, 1] 
swapEnds([1, 6, 7, 9, 8]) → [1, 6, 7, 9, 8]   */

package MediumDificultyAssignment;

import java.util.Arrays;
import java.util.LinkedList;

public class Assignment3 {

    public void calculatePrimeNum(int[] intArray) {
        int temp = 0;
        int lastNum = intArray[intArray.length - 1];
        if (lastNum % 2 == 0) {
            System.out.println("The last number of array is not prime number: " + lastNum);
        }
        else {
            temp = intArray[0];
            intArray[0] = intArray[intArray.length - 1];
            intArray[intArray.length - 1] = temp;
            System.out.println("The last number of array is  prime number: " + lastNum);
            System.out.println("The swap array is: " + Arrays.toString(intArray));
        }
    }

    public static void main(String[] args) {
        Assignment3 a = new Assignment3();
        int[] intArray = new int[]{1, 2, 3, 7};
        int[] intArray1 = new int[]{1, 2, 3};
        int[] intArray2 = new int[]{1, 6, 7, 9, 8};
        a.calculatePrimeNum(intArray);
        a.calculatePrimeNum(intArray1);
        a.calculatePrimeNum(intArray2);
    }


}
