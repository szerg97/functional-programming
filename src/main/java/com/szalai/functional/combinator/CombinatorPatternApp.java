package com.szalai.functional.combinator;

public class CombinatorPatternApp {
    public static void main(String[] args) {
        Person jamila = new Person("Jamila", "+36676789", "jamila@gmail.com");
        Person alex = new Person("Alex", "000000", "alex@gmail.com");
        PersonRegistrationValidator validator = PersonRegistrationValidator
                .isEmailTaken()
                .and(PersonRegistrationValidator.isEmailValid())
                .and(PersonRegistrationValidator.isPhoneNumberValid());
        System.out.println(validator.apply(jamila));
        System.out.println(validator.apply(alex));
    }
}
