package com.tvt.gof.factoryMethod;

import com.tvt.gof.factoryMethod.product.Pizza;
import org.junit.jupiter.api.Test;

public class PizzaFactoryTest {

    @Test
    public void testMakePizzas() {
        BasePizzaFactory pizzaFactory = new PizzaFactory();
        Pizza cheesePizza = pizzaFactory.createPizza("cheese");
        Pizza veggiePizza = pizzaFactory.createPizza("veggie");
    }
}