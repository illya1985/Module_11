package org.example;

import java.util.stream.Stream;
public class Task_4 {

        public static Stream<Long> generator( long seed, long a, long c, long m) {
            return Stream.iterate(seed, x -> (a * x + c) % m);
        }

}
