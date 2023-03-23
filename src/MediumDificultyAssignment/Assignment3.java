
/*Q3. Given an array of ints, swap the first and last elements in the array. Return the modified array.
If the last array value is prime no.  
swapEnds([1, 2, 3, 7]) → [7, 2, 3, 1] 
swapEnds([1, 2, 3]) → [3, 2, 1] 
swapEnds([1, 6, 7, 9, 8]) → [1, 6, 7, 9, 8]   */

package MediumDificultyAssignment;

<<<<<<< HEAD
import java.util.Arrays;
=======
>>>>>>> 8ed27e44666326cdc8742fcbedd3e6fd92001408
import java.util.LinkedList;

public class Assignment3 {

<<<<<<< HEAD
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
=======
    public void calculatePrimeNum() {
        //create linked list
        LinkedList<Integer> array = new LinkedList<>();

        // Add elements to LinkedList
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(7);
        //print array
        System.out.println("LinkedList : " + array);
        //get 1st index value
        int first = array.get(0);
        //calculate size of array
        int len = array.size();
        //get last index value
        int last = array.get(len - 1);
        //remove first value from array
        int removeFirst = array.removeFirst();
        //remove last value from array
        int removeLast = array.removeLast();

        //add element to 1st index
        array.addFirst(last);
        //add element to last index
        array.addLast(first);

        System.out.println("Swap first and last element : " + array);
        //get last value from array
        int lastNum = array.get(len - 1);

        //check the last value is prime or not
        if (lastNum % 2 == 0) {
            System.out.println("The last number of array is not prime number: " + lastNum);
        } else
            System.out.println("The last number of array is  prime number: " + lastNum);

>>>>>>> 8ed27e44666326cdc8742fcbedd3e6fd92001408
    }

    public static void main(String[] args) {
        Assignment3 a = new Assignment3();
<<<<<<< HEAD
        int[] intArray = new int[]{1, 2, 3, 7};
        int[] intArray1 = new int[]{1, 2, 3};
        int[] intArray2 = new int[]{1, 6, 7, 9, 8};
        a.calculatePrimeNum(intArray);
        a.calculatePrimeNum(intArray1);
        a.calculatePrimeNum(intArray2);
=======
        a.calculatePrimeNum();
>>>>>>> 8ed27e44666326cdc8742fcbedd3e6fd92001408
    }


}
