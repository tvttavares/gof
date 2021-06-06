package com.tvt.gof.abstractFactory;

import com.tvt.gof.abstractFactory.product.Pizza;
import org.junit.jupiter.api.Test;

public class GourmetPizzaFactoryTest {

    @Test
    public void testCreatePizza() throws Exception {
        BasePizzaFactory pizzaFactory = new GourmetPizzaFactory();
        Pizza cheesePizza = pizzaFactory.createPizza("cheese");
        Pizza veggiePizza = pizzaFactory.createPizza("veggie");
    }
}