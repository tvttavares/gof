package com.tvt.gof.facade.serviceFacade;

import com.tvt.gof.facade.domain.Product;
import com.tvt.gof.facade.subcomponent.InventoryService;
import com.tvt.gof.facade.subcomponent.PaymentService;
import com.tvt.gof.facade.subcomponent.ShippingService;

public class OrderServiceFacadeImpl implements OrderServiceFacade {

    public boolean placeOrder(int pId) {
        boolean orderFulfilled = false;
        Product product = new Product();
        product.productId = pId;

        if (InventoryService.isAvailable(product)) {
            System.out.println("Product with ID: " + product.productId + " is available.");
            boolean paymentConfirmed = PaymentService.makePayment();

            if (paymentConfirmed) {
                System.out.println("Payment confirmed...");
                ShippingService.shipProduct(product);
                System.out.println("Product shipped...");
                orderFulfilled = true;
            }
        }
        return orderFulfilled;
    }
}
