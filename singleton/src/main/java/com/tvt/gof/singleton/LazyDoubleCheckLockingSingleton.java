package com.tvt.gof.singleton;

public class LazyDoubleCheckLockingSingleton {

    private static LazyDoubleCheckLockingSingleton instance;

    private LazyDoubleCheckLockingSingleton() {
    }

    public static LazyDoubleCheckLockingSingleton getInstanceUsingDoubleLocking() {
        if (instance == null) {
            synchronized (LazyDoubleCheckLockingSingleton.class) {
                if (instance == null) {
                    instance = new LazyDoubleCheckLockingSingleton();
                }
            }
        }
        return instance;
    }
}
