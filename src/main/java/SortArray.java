import java.util.Arrays;

public class SortArray {
    public void ascendingArray(int[] arrayValues)
    {
        int temp = 0;

        //Sort the array in ascending order using two for loops
        for (int i = 0; i <arrayValues.length; i++) {
            for (int j = i+1; j <arrayValues.length; j++) {
                //swap elements if not in order
                    if (arrayValues[i] > arrayValues[j]) {
                        temp = arrayValues[i];
                        arrayValues[i] = arrayValues[j];
                        arrayValues[j] = temp;
                    }
            }
        }
        //print sorted array
        System.out.println("\nArray sorted in ascending order: "+ Arrays.toString(arrayValues));
    }
    public static void main(String[] args) {
        SortArray sortArray = new SortArray();
        //array declaration
        int [] intArray = new int [] {2,0,1,0,1};
        sortArray.ascendingArray(intArray);
    }
}    

