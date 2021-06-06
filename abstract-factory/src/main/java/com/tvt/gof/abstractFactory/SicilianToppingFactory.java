package com.tvt.gof.abstractFactory;

import com.tvt.gof.abstractFactory.top.Cheese;
import com.tvt.gof.abstractFactory.top.MozzarellaCheese;
import com.tvt.gof.abstractFactory.top.Sauce;
import com.tvt.gof.abstractFactory.top.TomatoSauce;

public class SicilianToppingFactory extends BaseToppingFactory {

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public Sauce createSauce() {
        return new TomatoSauce();
    }
}
