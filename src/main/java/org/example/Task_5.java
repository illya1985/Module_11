package org.example;

import java.util.stream.*;
import java.util.List;
import java.util.stream.Stream;

    public class Task_5 {
        public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
            List<T> firstList = first.collect(Collectors.toList());
            List<T> secondList = second.collect(Collectors.toList());
           int minSize = Math.min(firstList.size(), secondList.size());
            Stream<Object> combinedStream = IntStream.range(0, Math.min(firstList.size(), secondList.size()))
                    .boxed()
                    .flatMap(i -> Stream.of(firstList.get(i), secondList.get(i)));
           return (Stream<T>) combinedStream;
        }
    }