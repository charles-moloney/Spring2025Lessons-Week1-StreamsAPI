package resources;

import java.util.*;
import java.util.stream.*;
import java.time.Duration;
import java.time.Instant;

public class StreamBenchmark {
    public static void main(String[] args) {
        int size = 200_000_000; // 200 million elements

        System.out.println("Setting up data...");
        List<Integer> data = IntStream.range(0, size).boxed().toList();

        System.out.println("Starting benchmark...");
        
        // Warm up
        System.out.println("Warming up...");
        runSequential(data);
        runParallel(data);
        
        // Sequential
        Instant start1 = Instant.now();
        long sum1 = runSequential(data);
        Instant end1 = Instant.now();
        
        // Parallel
        Instant start2 = Instant.now();
        long sum2 = runParallel(data);
        Instant end2 = Instant.now();

        System.out.printf("Sequential sum: %d (took %d ms)%n", sum1, Duration.between(start1, end1).toMillis());
        System.out.printf("Parallel   sum: %d (took %d ms)%n", sum2, Duration.between(start2, end2).toMillis());
    }

    static long runSequential(List<Integer> list) {
        return list.stream()
                .mapToLong(n -> (long) n * n)
                .sum();
    }

    static long runParallel(List<Integer> list) {
        return list.parallelStream()
                .mapToLong(n -> (long) n * n)
                .sum();
    }
}
