package com.szalai.functional.base;

import java.util.List;

public class BaseApp {
    public static void main(String[] args) {

        MessageHandler handler1 = consumer -> {
            System.out.println("Handler 1 handling X message...");
            consumer.accept("Hi there! ...");
        };

        MessageHandler handler2 = consumer -> {
            System.out.println("Handler 2 handling Y message...");
            consumer.accept("Hey there! ...");
        };

        CallCenter center = (handlers, numbers) -> {
            System.out.println("Initiated call center...");
            handlers.forEach(h -> h.handle(msg -> System.out.println("Actual message: " + msg)));
            numbers.forEach(NumberHandler::handle);
        };
        center.manage(List.of(handler1, handler2), List.of(2,3));
    }
}
