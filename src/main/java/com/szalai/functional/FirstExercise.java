package com.szalai.functional;

import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;

public class FirstExercise {
    public static void main(String[] args) {
        Map.of(
                "Candy", "Martin",
                "Bob", "Mike",
                "Peter", "Elisa"
        )
                .forEach(emailSender.andThen(smsSender));
    }

    static BiConsumer<String, String> emailSender = (from, to) -> System.out.printf("Sending email from %s to %s%n", from, to);
    static BiConsumer<String, String> smsSender = (from, to) -> System.out.printf("Sending sms from %s to %s%n", from, to);
}
