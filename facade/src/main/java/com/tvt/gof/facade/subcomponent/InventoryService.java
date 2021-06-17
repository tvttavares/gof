package com.tvt.gof.facade.subcomponent;

import com.tvt.gof.facade.domain.Product;

public class InventoryService {

    public static boolean isAvailable(Product product) {
        /*Check Warehouse database for product availability*/
        return true;
    }
}