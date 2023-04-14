import java.util.Arrays;

public class SortArray {
    public void ascendingArray(int[] arrayValues) {
        int temp = 0;
        //Sort the array in ascending order using two for loops
        for (int varOne = 0; varOne < arrayValues.length; varOne++) {
            for (int varTwo = varOne + 1; varTwo < arrayValues.length; varTwo++) {
                //swap elements if not in order
                if (arrayValues[varOne] > arrayValues[varTwo]) {
                    temp = arrayValues[varOne];
                    arrayValues[varOne] = arrayValues[varTwo];
                    arrayValues[varTwo] = temp;
                }
            }
        }
        //print sorted array
        System.out.println("\nArray sorted in ascending order: " + Arrays.toString(arrayValues));
    }

    public static void main(String[] args) {
        SortArray sortArray = new SortArray();
        //array declaration
        int[] intArray = new int[]{2, 0, 1, 0, 1};
        sortArray.ascendingArray(intArray);
    }
}