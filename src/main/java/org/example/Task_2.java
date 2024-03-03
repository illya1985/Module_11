package org.example;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Task_2 {
    public static List<String> sortNames(List<String> strings) {
        return strings.stream()
                .map(String::toUpperCase)
                .sorted(Collections.reverseOrder())
                .collect(Collectors.toList());
    }
}