
/*Q3. Given an array of ints, swap the first and last elements in the array. Return the modified array.
If the last array value is prime no.  
swapEnds([1, 2, 3, 7]) → [7, 2, 3, 1] 
swapEnds([1, 2, 3]) → [3, 2, 1] 
swapEnds([1, 6, 7, 9, 8]) → [1, 6, 7, 9, 8]   */

package MediumDificultyAssignment;

import java.util.LinkedList;

public class Assignment3 {

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

    }

    public static void main(String[] args) {
        Assignment3 a = new Assignment3();
        a.calculatePrimeNum();
    }


}
