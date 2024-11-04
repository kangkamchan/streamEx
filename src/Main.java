import java.util.*;
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
    }
}