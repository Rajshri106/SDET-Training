import java.util.*;

public class Destination {
    public static void main(String[] args) {
        LinkedList list1 = new LinkedList();
        list1.add("B");
        list1.add("C");
        LinkedList list2 = new LinkedList();
        list2.add("D");
        list2.add("B");
        LinkedList list3 = new LinkedList();
        list3.add("C");
        list3.add("A");
        ArrayList<LinkedList> aList = new ArrayList<LinkedList>();
        aList.add(list1);
        aList.add(list2);
        aList.add(list3);
        System.out.println(aList);
        String destination = findDestination(aList);
        System.out.println(destination);
    }

    public static String findDestination(ArrayList<LinkedList> aList) {
        Set<String> startCities = new HashSet<>();
        Set<String> endCities = new HashSet<>();
        for (List<String> path : aList) {
            startCities.add(path.get(0));
            endCities.add(path.get(1));
        }
        for (String endCity : endCities) {
            if (!startCities.contains(endCity)) {
                return endCity;
            }
        }
        return null;
    }
}