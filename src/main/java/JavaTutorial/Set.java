package JavaTutorial;

import java.util.HashSet;

public class Set {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<String>();
        hashSet.add("A");
        hashSet.add("B");
        hashSet.add("C");
        hashSet.add("C");
        System.out.println(hashSet);
        System.out.println(hashSet.contains("C"));
        hashSet.remove("A");
        System.out.println(hashSet);
    }
}
