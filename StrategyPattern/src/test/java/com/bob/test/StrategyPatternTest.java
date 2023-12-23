package com.bob.test;

import com.bob.S0123_OrderProcessingStrategy;
import com.bob.S0123_OrderProcessor;
import com.bob.strategies.S0123_DefaultOrderProcessingStrategy;
import com.bob.strategies.S0123_DigitalProductOrderProcessingStrategy;
import com.bob.strategies.S0123_PerishableOrderProcessingStrategy;

// 测试代码
public class StrategyPatternTest {
    public static void main(String[] args) {
        // 创建订单处理类
        S0123_OrderProcessor orderProcessor = new S0123_OrderProcessor();

        // 创建不同类型的订单处理策略
        S0123_OrderProcessingStrategy defaultStrategy = new S0123_DefaultOrderProcessingStrategy();
        S0123_OrderProcessingStrategy perishableStrategy = new S0123_PerishableOrderProcessingStrategy();
        S0123_OrderProcessingStrategy digitalProductStrategy = new S0123_DigitalProductOrderProcessingStrategy();

        // 设置订单处理策略为默认策略并处理订单
        orderProcessor.setStrategy(defaultStrategy);
        System.out.println("Processing default order:");
        orderProcessor.processOrder();
        System.out.println();

        // 设置订单处理策略为易腐货物策略并处理订单
        orderProcessor.setStrategy(perishableStrategy);
        System.out.println("Processing perishable goods order:");
        orderProcessor.processOrder();
        System.out.println();

        // 设置订单处理策略为数字商品策略并处理订单
        orderProcessor.setStrategy(digitalProductStrategy);
        System.out.println("Processing digital products order:");
        orderProcessor.processOrder();
    }
}