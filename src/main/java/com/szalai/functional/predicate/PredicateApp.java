package com.szalai.functional.predicate;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class PredicateApp {
    public static void main(String[] args) {
        List.of(
                new Person("bob@mail.com"),
                new Person("lisamail.com"),
                new Person("betty@mailcom"),
                new Person("billy@mail.hu"),
                new Person("pete@mail.en"),
                new Person("igormail.en"),
                new Person("suse@mailen")
        )
                .forEach(p -> {
                    String text = containsAt.and(containsDomain).test(p.email) ? "%s is valid%n" : "%s is invalid%n";
                    System.out.printf(text, p.email);
                });
        System.out.println("\nValid emails:");
        Stream.of(
                        new Person("bob@mail.com"),
                        new Person("lisamail.com"),
                        new Person("betty@mailcom"),
                        new Person("billy@mail.hu"),
                        new Person("pete@mail.en"),
                        new Person("igormail.en"),
                        new Person("suse@mailen")
                )
                .map(p -> p.email)
                .filter(containsAt.and(containsDomain)).forEach(System.out::println);
    }

    static Predicate<String> containsAt = email -> email.contains("@");
    static Predicate<String> containsCom = email -> email.endsWith(".com");
    static Predicate<String> containsEn = email -> email.endsWith(".en");
    static Predicate<String> containsHu = email -> email.endsWith(".hu");
    static Predicate<String> containsDomain = domain -> containsCom.or(containsHu).or(containsEn).test(domain);

    record Person(String email){}
}
