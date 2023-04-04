import java.util.Arrays;

public class SortArray {
    public void ascendingArray(int[] intArray)
    {
        int temp = 0;

        //Sort the array in ascending order using two for loops
        for (int i = 0; i <intArray.length; i++) {
            for (int j = i+1; j <intArray.length; j++) {
                //swap elements if not in order
                if(intArray[i] >intArray[j]) {
                    temp = intArray[i];
                    intArray[i] = intArray[j];
                    intArray[j] = temp;
                }
            }
        }
        //print sorted array
        System.out.println("\nArray sorted in ascending order: "+ Arrays.toString(intArray));
    }
    public static void main(String[] args) {
        SortArray a = new SortArray();
        //array declaration
        int [] intArray = new int [] {2,0,1,0,1};
        a.ascendingArray(intArray);
    }
}

