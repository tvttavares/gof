package com.tvt.gof.decorator.decorators;

import com.tvt.gof.decorator.components.FlowerBouquet;

public class PaperWrapper extends FlowerBouquetDecorator {

    FlowerBouquet flowerBouquet;

    public PaperWrapper(FlowerBouquet flowerBouquet) {
        this.flowerBouquet = flowerBouquet;
    }

    public String getDescription() {
        return flowerBouquet.getDescription() + ", paper wrap";
    }

    public double cost() {
        return 3 + flowerBouquet.cost();
    }
}