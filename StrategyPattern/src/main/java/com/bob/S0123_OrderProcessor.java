package com.bob;

// 订单处理类
public class S0123_OrderProcessor {
    private S0123_OrderProcessingStrategy strategy;

    public void setStrategy(S0123_OrderProcessingStrategy strategy) {
        this.strategy = strategy;
    }

    public void processOrder() {
        strategy.validatePaymentDetails();
        strategy.deductPayment();
        strategy.checkInventoryAvailability();
        strategy.startPackaging();
        strategy.ship();
    }
}