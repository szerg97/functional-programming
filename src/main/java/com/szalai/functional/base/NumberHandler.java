package com.szalai.functional.base;

public interface NumberHandler {
    static void handle(Integer number) {
        System.out.println(number + " by 2 is: " + number * 2);
    }
}
