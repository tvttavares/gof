package com.tvt.gof.facade.controller;

import com.tvt.gof.facade.serviceFacade.OrderServiceFacadeImpl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class OrderFulfillmentControllerTest {

    @Test
    public void testOrderProduct() throws Exception {

        OrderFulfillmentController controller = new OrderFulfillmentController();
        controller.facade = new OrderServiceFacadeImpl();
        controller.orderProduct(9);
        boolean result = controller.orderFulfilled;
        assertTrue(result);
    }
}