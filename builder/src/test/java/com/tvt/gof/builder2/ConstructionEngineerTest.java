package com.tvt.gof.builder2;

import com.tvt.gof.builder2.builders.ConcreteHouseBuilder;
import com.tvt.gof.builder2.builders.ConstructionEngineer;
import com.tvt.gof.builder2.builders.HouseBuilder;
import com.tvt.gof.builder2.builders.PrefabricatedHouseBuilder;
import com.tvt.gof.builder2.product.House;
import org.junit.jupiter.api.Test;

public class ConstructionEngineerTest {

    @Test
    public void testConstructHouse() throws Exception {
        HouseBuilder concreteHouseBuilder = new ConcreteHouseBuilder();
        ConstructionEngineer engineerA = new ConstructionEngineer(concreteHouseBuilder);
        House houseA = engineerA.constructHouse();
        System.out.println("House is: " + houseA);

        PrefabricatedHouseBuilder prefabricatedHouseBuilder = new PrefabricatedHouseBuilder();
        ConstructionEngineer engineerB = new ConstructionEngineer(prefabricatedHouseBuilder);
        House houseB = engineerB.constructHouse();
        System.out.println("House is: " + houseB);
    }
}