package com.example.justwrite;

public class Analytic {
    private final String mName;
    private final String mData;

    public Analytic(String name, String data) {
        mName = name;
        mData = data;
    }

    public String getData() {
        return mData;
    }

    public String getName() {
        return mName;
    }
}