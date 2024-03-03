package org.example;

import java.util.List;
import java.util.stream.Stream;

import static org.example.Task_1.oddIndexNames;
import static org.example.Task_2.sortNames;
import static org.example.Task_3.sortNumbers;
import static org.example.Task_4.generator;
import static org.example.Task_5.zip;

public class Main {
    public static void main(String[] args) {
        List<String> namesList = List.of("Illya", "Peter", "Nik", "Kay", "Gerda","Anton", "Zina");
        String resultString = oddIndexNames(namesList);
        System.out.println("task_1-result \n "+resultString);
        List<String> result = sortNames(namesList);
        System.out.println("task_2-result ");
        result.forEach(System.out::println);


        String[] array = {"1, 2, 0", "4, 3, 5"};
        System.out.println("task_3-result \n"+sortNumbers(array));

        long a = 25214903917L;
        long c = 11;
        long m = (long) Math.pow(2, 48);
        long seed =0;
        Stream<Long> randomStream = generator(seed, a, c, m);

        System.out.println("task_4-result ");
        randomStream.limit(100).forEach(System.out::print);

        Stream<Integer> stream1 = Stream.of(1, 11, 12, 13, 14);
        Stream<Integer> stream2 = Stream.of(2, 21, 22, 23, 24, 25, 26);
        System.out.println("task_5-result ");
        zip(stream1, stream2).forEach(System.out::println);
        }
    }
