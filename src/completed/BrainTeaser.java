package completed;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BrainTeaser {
    
    public static String foo(String[] names) {
		return Arrays.stream(names)
				.filter(s -> s.length() > 4)
				.map(String::toUpperCase)
				.sorted()
				.collect(Collectors.joining("-"));
	}
    
    public static void main(String[] args) {
        String[] teaser = {"Ellenna", "Brendan", "Josh", "Charles", "Emma"};
		System.out.println(foo(teaser));
    }

}
