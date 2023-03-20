package com.szalai.functional.callbacks;

import java.util.function.Consumer;

public class CallbackApp {
    public static void main(String[] args) {
        String firstName = "Gergo";
        String lastName = "Szalai";
        checkLastName(firstName, lastName, callback);
    }

    private static void checkLastName(
            String firstName,
            String lastName,
            Consumer<String> callback
            ){
        if (lastName != null)
            System.out.println(firstName + " " + lastName);
        else
            callback.accept(firstName);
    }

    static Consumer<String> callback = f -> System.out.printf("%s, you must have a last name!%n", f);
}
