package com.tvt.gof.abstractFactory;

import com.tvt.gof.abstractFactory.top.Cheese;
import com.tvt.gof.abstractFactory.top.Sauce;

public abstract class BaseToppingFactory {
    public abstract Cheese createCheese();

    public abstract Sauce createSauce();
}
