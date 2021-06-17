package com.tvt.gof.facade.controller;

import com.tvt.gof.facade.serviceFacade.OrderServiceFacade;

public class OrderFulfillmentController {

    OrderServiceFacade facade;
    boolean orderFulfilled = false;

    public void orderProduct(int productId) {
        orderFulfilled = facade.placeOrder(productId);
        System.out.println("OrderFulfillmentController: Order fulfillment completed. ");
    }
}