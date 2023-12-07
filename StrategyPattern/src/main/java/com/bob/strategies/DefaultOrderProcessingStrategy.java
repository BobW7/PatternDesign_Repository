package com.bob.strategies;

import com.bob.OrderProcessingStrategy;

// 默认订单处理策略
public class DefaultOrderProcessingStrategy implements OrderProcessingStrategy {
    @Override
    public void validatePaymentDetails() {
        System.out.println("Validating payment details...");
        // 验证付款细节的具体实现
    }

    @Override
    public void deductPayment() {
        System.out.println("Deducting payment...");
        // 扣除付款的具体实现
    }

    @Override
    public void checkInventoryAvailability() {
        System.out.println("Checking inventory availability...");
        // 确认库存可用性的具体实现
    }

    @Override
    public void startPackaging() {
        System.out.println("Starting packaging...");
        // 开始包装的具体实现
    }

    @Override
    public void ship() {
        System.out.println("Shipping...");
        // 发货的具体实现
    }
}