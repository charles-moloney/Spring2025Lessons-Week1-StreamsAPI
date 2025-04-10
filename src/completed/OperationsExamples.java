package completed;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class OperationsExamples {
    
    public static void generateExample() {
        Stream.generate(() -> Math.random()).limit(5)
            .forEach(System.out::println);
    }
    
    public static void iterateExample() {
        Stream.iterate(2, i -> i * 2).limit(5)
			.forEach(System.out::println);
    }
    
    public static void mapExample() {
		Stream.of("a", "aa").map(x -> x.length())
		    .forEach(System.out::println);
	}
    
    public static void filterExample() {
		Stream.of("a", "aa").filter(x -> x.length() > 1)
		    .forEach(System.out::println);
	}
    
    public static void distinctExample() {
        Stream.of("a", "aa", "aa").distinct()
            .forEach(System.out::println);
    }
    
    public static void flatMapExample() {
        List<String> lista = new ArrayList<>(Arrays.asList("a", "b", "c"));
        List<String> listb = new ArrayList<>(Arrays.asList("d", "e", "f"));
        List<String> listc = new ArrayList<>(Arrays.asList("g", "h", "i"));
        Stream.of(lista, listb, listc).flatMap(x -> x.stream())
            .forEach(System.out::println);
	}
    
    public static void peekExample() {
        List<String> lista = new ArrayList<>(Arrays.asList("a", "b", "c"));
        List<String> listb = new ArrayList<>(Arrays.asList("d", "e", "f"));
        List<String> listc = new ArrayList<>(Arrays.asList("g", "h", "i"));
        Stream.of(lista, listb, listc).peek(x -> x.add("x"))
            .forEach(System.out::println);
    }
    
    public static void sortedExample() {
        List<String> lista = new ArrayList<>(Arrays.asList("a", "b", "c"));
        List<String> listb = new ArrayList<>(Arrays.asList("d", "e", "f"));
        List<String> listc = new ArrayList<>(Arrays.asList("g", "h", "i"));
        Stream.of(lista, listb, listc).sorted((x, y) -> y.get(0).compareTo(x.get(0)))
            .forEach(System.out::println);
    }
    
    public static void main(String[] args) {
        
    }
}
