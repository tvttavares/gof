package com.tvt.gof.chainOfResponsability;

import com.tvt.gof.chainOfResponsability.handlers.AbstractSupportHandler;
import com.tvt.gof.chainOfResponsability.handlers.BillingSupportHandler;
import com.tvt.gof.chainOfResponsability.handlers.GeneralSupportHandler;
import com.tvt.gof.chainOfResponsability.handlers.TechnicalSupportHandler;

public class RequesterClient {

    public static AbstractSupportHandler getHandlerChain() {
        AbstractSupportHandler technicalSupportHandler = new TechnicalSupportHandler(AbstractSupportHandler.TECHNICAL);
        AbstractSupportHandler billingSupportHandler = new BillingSupportHandler(AbstractSupportHandler.BILLING);
        AbstractSupportHandler generalSupportHandler = new GeneralSupportHandler(AbstractSupportHandler.GENERAL);

        technicalSupportHandler.setNextHandler(billingSupportHandler);
        billingSupportHandler.setNextHandler(generalSupportHandler);

        return technicalSupportHandler;
    }
}
