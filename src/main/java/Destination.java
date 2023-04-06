import java.util.*;

public class Destination {
    public static void main(String[] args) {
        List<List<String>> paths = new ArrayList<>();
        paths.add(Arrays.asList("B", "C"));
        paths.add(Arrays.asList("D", "B"));
        paths.add(Arrays.asList("C", "A"));
        System.out.println(paths);
        String destination = findDestination(paths);
        System.out.println(destination);
    }

    public static String findDestination(List<List<String>> paths) {
        Set<String> startCities = new HashSet<>();
        Set<String> endCities = new HashSet<>();
        for (List<String> path : paths) {
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