package com.bob.strategies;

import com.bob.S0123_OrderProcessingStrategy;

// 数字商品订单处理策略
public class S0123_DigitalProductOrderProcessingStrategy implements S0123_OrderProcessingStrategy {
    @Override
    public void validatePaymentDetails() {
        System.out.println("Validating payment details for digital products...");
        // 验证付款细节的具体实现，针对数字商品的特定要求
    }

    @Override
    public void deductPayment() {
        System.out.println("Deducting payment for digital products...");
        // 扣除付款的具体实现，针对数字商品的特定要求
    }

    @Override
    public void checkInventoryAvailability() {
        // 数字商品不需要检查库存可用性，这里为空实现
    }

    @Override
    public void startPackaging() {
        // 数字商品不需要包装，这里为空实现
    }

    @Override
    public void ship() {
        System.out.println("Delivering digital products...");
        // 数字商品直接进行交付的具体实现
    }
}