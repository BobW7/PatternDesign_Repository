package com.bob.strategies;

import com.bob.OrderProcessingStrategy;

// 易腐货物订单处理策略
public class PerishableOrderProcessingStrategy implements OrderProcessingStrategy {
    @Override
    public void validatePaymentDetails() {
        System.out.println("Validating payment details for perishable goods...");
        // 验证付款细节的具体实现，针对易腐货物的特定要求
    }

    @Override
    public void deductPayment() {
        System.out.println("Deducting payment for perishable goods...");
        // 扣除付款的具体实现，针对易腐货物的特定要求
    }

    @Override
    public void checkInventoryAvailability() {
        System.out.println("Checking inventory availability for perishable goods...");
        // 确认库存可用性的具体实现，针对易腐货物的特定要求
    }

    @Override
    public void startPackaging() {
        System.out.println("Starting packaging for perishable goods...");
        // 开始包装的具体实现，针对易腐货物的特定要求
    }

    @Override
    public void ship() {
        System.out.println("Shipping perishable goods...");
        // 发货的具体实现，针对易腐货物的特定要求
    }
}