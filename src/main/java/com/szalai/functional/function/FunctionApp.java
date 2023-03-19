package com.szalai.functional.function;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class FunctionApp {
    public static void main(String[] args) {
        //first
        System.out.println("Simple");
        List<Integer> integersFirst = Stream.of(1, 2, 3).map(n -> incrementByOne.apply(n)).toList();
        System.out.println(integersFirst);
        //second
        System.out.println("\nChained");
        List<Integer> integersSecond = Stream.of(1, 2, 3)
                .map(n -> incrementByOne.andThen(multiplyByTwo).apply(n))
                .toList();
        System.out.println(integersSecond);
    }

    static Function<Integer, Integer> incrementByOne = integer -> integer + 1;
    static Function<Integer, Integer> multiplyByTwo = integer -> integer * 2;
}