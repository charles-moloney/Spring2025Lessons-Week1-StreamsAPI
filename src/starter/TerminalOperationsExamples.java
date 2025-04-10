package starter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TerminalOperationsExamples {
    
    public static void forEachCollectionsExample() {
	    List<String> list = new ArrayList<>(Arrays.asList("a", "aa"));
		list.forEach(System.out::println);
    }
    
    public static void collectExample() {
        List<String> list = Stream.of("a", "aa").collect(Collectors.toList());
		System.out.println(list);
    }
    
    public static void collectorsJoiningExample() {
		String joined = Stream.of("a", "aa").collect(Collectors.joining(", "));
		System.out.println(joined);
	}
    
    public static void collectionsToCollectionExample() {
	    ArrayList<String> list = Stream.of("a", "aa").collect(Collectors.toCollection(ArrayList::new));
		System.out.println(list);
    }
    
    public static void collectionsGroupingByExample() {
        Map<Character, List<String>> map = Stream.of("Amy", "Aaron", "Bob", "Charles", "Chuck", "Zoe")
                .collect(Collectors.groupingBy(s -> s.charAt(0)));
		System.out.println(map);
    }
    
    public static void collectionsGroupingByWithMappingExample() { // better example in lab
        Map<Character, List<Integer>> map = Stream.of("Amy", "Aaron", "Bob", "Charles", "Chuck", "Zoe")
                .collect(Collectors.groupingBy(s -> s.charAt(0), Collectors.mapping(String::length, Collectors.toList())));
        System.out.println(map);
    }
    
    public static void findFirstExample() {
		String first = Stream.of("a", "aa").findFirst().orElse("No such element");
		System.out.println(first);
	}
    
    public static void findFirstNullSafetyExample() {
        String first = Stream.of("a", "aa").filter(x -> x.startsWith("b")).findFirst().orElse("No such element");
		System.out.println(first);
    }
    
    public static void reduceExample() {
		int sum = Stream.of(1, 2, 3).reduce(0, Integer::sum);
		System.out.println(sum);
	}
    
	public static void reduceExample2() {
		String sum = Stream.of("a", "b", "c").reduce("a", (a, b) -> a + b);
		System.out.println(sum);
	}
    
    

    public static void main(String[] args) {
        
    }
}
