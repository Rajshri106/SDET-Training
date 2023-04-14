package JavaTutorial;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<Integer>(5);
        for (int varOne = 0; varOne <= 5; varOne++) {
            arrayList.add(varOne);
        }
        //printing elements
        System.out.println(arrayList);
        //remove element from index
        System.out.println(arrayList.remove(3));
        //check element is removed or not
        System.out.println(arrayList.contains(3));
        //printing element one by one
        for (int element = 0; element < arrayList.size(); element++) {
            System.out.println(arrayList.get(element));
        }
    }
}
