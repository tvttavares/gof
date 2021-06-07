package com.tvt.gof.singleton;

public class EagerSingleton {

    private static final EagerSingleton instance = new EagerSingleton();

    // private constructor
    private EagerSingleton() {
    }

    public static EagerSingleton getInstance() {
        return instance;
    }
}
