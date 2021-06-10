package com.tvt.gof.builder2.builders;

import com.tvt.gof.builder2.product.House;

public interface HouseBuilder {

    void buildFoundation();

    void buildStructure();

    void buildRoof();

    void paintHouse();

    void furnishHouse();

    House getHouse();
}