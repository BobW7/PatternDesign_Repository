package com.bob;

// 订单处理策略接口
public interface S0123_OrderProcessingStrategy {
    // 验证付款细节
    void validatePaymentDetails();
    // 扣除付款
    void deductPayment();
    // 确认库存可用性
    void checkInventoryAvailability();
    // 开始包装
    void startPackaging();
    // 发货
    void ship();
}