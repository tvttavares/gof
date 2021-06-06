package com.tvt.gof.abstractFactory;

import com.tvt.gof.abstractFactory.top.CaliforniaOilSauce;
import com.tvt.gof.abstractFactory.top.Cheese;
import com.tvt.gof.abstractFactory.top.GoatCheese;
import com.tvt.gof.abstractFactory.top.Sauce;

public class GourmetToppingFactory extends BaseToppingFactory {

    @Override
    public Cheese createCheese() {
        return new GoatCheese();
    }

    @Override
    public Sauce createSauce() {
        return new CaliforniaOilSauce();
    }
}
