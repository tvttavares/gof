package com.tvt.gof.factoryMethod;

import com.tvt.gof.factoryMethod.product.CheesePizza;
import com.tvt.gof.factoryMethod.product.PepperoniPizza;
import com.tvt.gof.factoryMethod.product.Pizza;
import com.tvt.gof.factoryMethod.product.VeggiePizza;

public class PizzaFactory extends BasePizzaFactory {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza;
        switch (type.toLowerCase()) {
            case "cheese":
                pizza = new CheesePizza();
                break;
            case "pepperoni":
                pizza = new PepperoniPizza();
                break;
            case "veggie":
                pizza = new VeggiePizza();
                break;
            default:
                throw new IllegalArgumentException("No such pizza.");
        }
        pizza.addIngredients();
        pizza.bakePizza();
        return pizza;
    }
}
