package com.szalai.functional.extentions;

import java.util.List;
import java.util.stream.Stream;

public class EmailValidatorApp {
    public static void main(String[] args) {
        EmailValidator emailValidator = new EmailValidator();
        List<String> validEmails = Stream.of("hello@mail.com", "bymail.com").filter(emailValidator::apply).toList();
        System.out.println(validEmails);
    }
}
