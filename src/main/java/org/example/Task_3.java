package org.example;


import java.util.stream.Collectors;
import java.util.Arrays;
public class Task_3 {


            public static String sortNumbers(String[] arr) {
                return Arrays.stream(arr)
                        .flatMap(s -> Arrays.stream(s.split(", ")))
                        .map(Integer::parseInt)
                        .sorted()
                        .map(Object::toString)
                        .collect(Collectors.joining(", "));
            }

}
