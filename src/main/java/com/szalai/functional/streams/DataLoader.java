package com.szalai.functional.streams;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class DataLoader {

    private static List<Person> people;

    public static void init() throws IOException {
        InputStream inputStream = Resources.getResource("people.json");
        ObjectMapper mapper = new ObjectMapper();
        people = mapper.readValue(inputStream.readAllBytes(), new TypeReference<>() {});
    }

    public static List<Person> getPeople(){
        return people;
    }
}
