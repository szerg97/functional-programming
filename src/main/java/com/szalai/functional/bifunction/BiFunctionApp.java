package com.szalai.functional.bifunction;

import java.util.Map;
import java.util.function.BiFunction;

public class BiFunctionApp {
    public static void main(String[] args) {
        Map.of("Lisa", 23,
                "Peter", 34,
                "Robert", 27).forEach((k, v) -> System.out.println(converter.apply(k, v)));
    }

    static BiFunction<String, Integer, Person> converter = Person::new;

    static class Person{
        private final String name;
        private final int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }
}
