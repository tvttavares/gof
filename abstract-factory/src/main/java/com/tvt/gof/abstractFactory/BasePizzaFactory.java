package com.tvt.gof.abstractFactory;

import com.tvt.gof.abstractFactory.product.Pizza;

public abstract class BasePizzaFactory {

    public abstract Pizza createPizza(String type);
}