package com.szalai.functional.extentions;

import java.util.function.Function;

public class EmailValidator implements Function<String, Boolean> {

    private Boolean containsAt;
    private Boolean containsDomain;

    private void init(){
        containsAt = false;
        containsDomain = false;
    }

    @Override
    public Boolean apply(String email) {
        init();
        System.out.println("Checking email: " + email);
        if (email.contains("@")){
            containsAt = true;
        }
        if (email.endsWith(".com") || email.endsWith(".en") || email.endsWith(".hu")){
            containsDomain = true;
        }
        System.out.println("\tContains @:" + (containsAt ? "yes" : "no"));
        System.out.println("\tContains domain:" + (containsDomain ? "yes" : "no"));
        return containsAt && containsDomain;
    }
}
