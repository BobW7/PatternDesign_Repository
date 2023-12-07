package com.bob;

// 订单处理类
public class OrderProcessor {
    private OrderProcessingStrategy strategy;

    public void setStrategy(OrderProcessingStrategy strategy) {
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