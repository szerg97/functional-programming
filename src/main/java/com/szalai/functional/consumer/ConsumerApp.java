package com.szalai.functional.consumer;

import com.sun.tools.javac.Main;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerApp {
    public static void main(String[] args) {
        List.of("mike@mail.com", "dave@mail.com", "emily@mail.com", "lucy@mail.com")
                .forEach(emailSender.andThen(smsSender));
    }

    static Consumer<String> emailSender = to -> System.out.printf("Sending email to %s...%n", to);
    static Consumer<String> smsSender = to -> System.out.printf("Sending sms to %s...%n", to);
}
