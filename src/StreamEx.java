import java.util.*;
import java.util.stream.Collectors;

public class StreamEx {
    public static List<Integer> getEvenList(List<Integer> list) {
        return list.stream().filter(i-> i%2==0).toList();
    }

    public static List<String> getOverLengthFiveString(List<String> list){
        return list.stream().filter(s->s.length()>=5).toList();
    }

    public static List<String> getStartWithA(List<String> list){
        //return list.stream().filter(s->s.indexOf("A")==0).toList();
        return list.stream().filter(s->s.startsWith("A")).toList();
    }

    public static List<Integer> getSqaredInteger (List<Integer> list) {
        return list.stream().map(i -> i*i).toList();
    }

    public static int getAgeSum (List<Person> list){
        return list.stream().map(p->p.getAge()).reduce(0,(a,b)->a+b);
    }

    public static List<Integer> sortAscDistinct(List<Integer> list){
        return list.stream().sorted().distinct().toList();
    }

    public static String getMostFrequent(List<String> list){
        return list.stream().collect(Collectors.groupingBy(s -> s, Collectors.counting()))
                .entrySet().stream().max(Map.Entry.comparingByValue())
                .get().getKey();
    }

    public static Set<Integer> intersectionOfList(List<Integer> list1, List<Integer> list2){
        return list2.stream().filter(i -> list1.stream().collect(Collectors.toSet()).contains(i)).collect(Collectors.toSet());
    }
}

