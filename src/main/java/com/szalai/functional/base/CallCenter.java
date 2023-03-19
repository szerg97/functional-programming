package com.szalai.functional.base;

import java.util.List;

public interface CallCenter {
    void manage(List<MessageHandler> handlers, List<Integer> numbers);
}
