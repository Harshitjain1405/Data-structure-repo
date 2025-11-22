package interview;

import java.util.List;
import java.util.stream.IntStream;

/*
List of integer and print prime no. using stream API
2, 3, 4, 5, 6, 7, 8, 9, 10, 11

 */
public class StreamProgram {
    public static void main(String[] args) {
        IntStream.rangeClosed(2,11)
                .filter(n -> IntStream.rangeClosed(2, (int) Math.sqrt(n))
                .noneMatch(div -> n % div == 0 && div != n))
                .forEach(System.out::println);
    }
}
