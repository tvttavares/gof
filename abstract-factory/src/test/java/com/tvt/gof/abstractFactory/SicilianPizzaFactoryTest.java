package com.tvt.gof.abstractFactory;

import com.tvt.gof.abstractFactory.product.Pizza;
import org.junit.jupiter.api.Test;

public class SicilianPizzaFactoryTest {

    @Test
    public void testCreatePizza() throws Exception {
        BasePizzaFactory pizzaFactory = new SicilianPizzaFactory();
        Pizza cheesePizza = pizzaFactory.createPizza("cheese");
        Pizza pepperoniPizza = pizzaFactory.createPizza("pepperoni");
    }
}