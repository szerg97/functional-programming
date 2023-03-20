package com.szalai.functional.streams;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsApp {
    public static void main(String[] args) {
        try {
            DataLoader.init();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        List<Person> people = DataLoader.getPeople();

        //Find people aged less or equal 21
        int size = people.stream().filter(p -> p.getAge() <= 21).toList().size();
        System.out.println(size);

        //Find first 10 people's names aged less or equal 21
        List<Person> limitedList = people.stream().filter(p -> p.getAge() <= 21).limit(10L).toList();
        System.out.println(limitedList.stream().map(Person::getName).collect(Collectors.toList()));
    }
}
