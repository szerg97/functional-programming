package com.szalai.functional.supplier;

import java.util.function.Supplier;

public class SupplierApp {
    public static void main(String[] args) {
        String url = urlSupplier.get();
        System.out.println(url);
    }

    static Supplier<String> urlSupplier = () -> "http://localhost:8080";
}
