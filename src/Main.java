import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 4, 7, 8, 10, 15, 18);
        System.out.println(StreamEx.getEvenList(numbers));
        List<String> words = Arrays.asList("apple", "banana", "pear", "cherry", "plum", "watermelon");
        System.out.println(StreamEx.getOverLengthFiveString(words));
        System.out.println(StreamEx.getStartWithA(Arrays.asList("Alice", "Bob", "Anna", "Alex", "Brian")));
        System.out.println(StreamEx.getSqaredInteger(Arrays.asList(2, 3, 4, 5)));
        System.out.println(StreamEx.getAgeSum(Arrays.asList(
                new Person("Alice", 30),
                new Person("Bob", 20),
                new Person("Charlie", 25)
        )));
        System.out.println(StreamEx.sortAscDistinct(Arrays.asList(5, 3, 8, 3, 9, 1, 5, 7)));
        System.out.println(StreamEx.getMostFrequent(Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple")));
        System.out.println(StreamEx.intersectionOfList(Arrays.asList(1, 2, 3, 4, 5),Arrays.asList(4, 5, 6, 7, 8)));


        List<Map<String, Integer>> maps = Arrays.asList(
                Map.of("A", 3, "B", 5),
                Map.of("A", 2, "C", 4),
                Map.of("B", 3, "C", 7)
        );
        
    }
}