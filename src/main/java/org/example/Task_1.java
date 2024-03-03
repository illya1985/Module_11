package org.example;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


        public class Task_1 {
        public static String oddIndexNames(List<String> names) {
            return IntStream.range(0, names.size())
                    .filter(i -> i % 2 == 0)
                    .mapToObj(i -> (i + 1) + ". " + names.get(i))
                    .collect(Collectors.joining(", "));
        }


    }
