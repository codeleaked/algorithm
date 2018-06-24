package com.codeleaked.algorithm.tinyurl;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

public class Solution {

    private static String TINY_URL = "http://tinyurl.com/";

    private static String ALPHANUMERIC = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

    private Map<String, String> urlMap = new HashMap<>();

    String encode(String longUrl) {
        String url = TINY_URL + randomString();
        urlMap.put(url, longUrl);
        return url;
    }

    String decode(String shortUrl) {
        return urlMap.get(shortUrl);
    }

    private String randomString() {
        StringBuilder builder = new StringBuilder(6);

        for (int i = 0; i < 6; ++i) {
            char c = ALPHANUMERIC.charAt(ThreadLocalRandom.current().nextInt(0, ALPHANUMERIC.length()));
            builder.append(c);
        }

        return builder.toString();
    }

}
