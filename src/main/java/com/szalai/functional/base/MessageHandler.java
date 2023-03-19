package com.szalai.functional.base;

import java.util.function.Consumer;

public interface MessageHandler {
    void handle(Consumer<String> msg);
}
