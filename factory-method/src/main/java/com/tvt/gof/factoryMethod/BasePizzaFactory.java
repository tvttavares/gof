package com.tvt.gof.factoryMethod;

import com.tvt.gof.factoryMethod.product.Pizza;

public abstract class BasePizzaFactory {

    public abstract Pizza createPizza(String type);
}