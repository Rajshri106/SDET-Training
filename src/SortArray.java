
public class SortArray {    
    public static void main(String[] args) {        
        //define original array     
        int [] intArray = new int [] {2,0,1,0,1};     
        int temp = 0;
 
        //print original array    
       System.out.println("Original array: ");    
       for (int i = 0; i <intArray.length; i++) {     
           System.out.print(intArray[i] + " ");    
        }    
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
        System.out.println("\nArray sorted in ascending order: ");    
        for (int i = 0; i <intArray.length; i++) {     
            System.out.print(intArray[i] + " ");    
        }    
    }    
}    

