package com.szalai.functional.streams;

import java.io.InputStream;

public class Resources {

    public static InputStream getResource(String url){
        return Resources.class.getClassLoader().getResourceAsStream(url);
    }
}
