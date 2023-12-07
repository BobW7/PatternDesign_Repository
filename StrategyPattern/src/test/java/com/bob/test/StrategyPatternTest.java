package com.bob.test;

import com.bob.OrderProcessingStrategy;
import com.bob.OrderProcessor;
import com.bob.strategies.DefaultOrderProcessingStrategy;
import com.bob.strategies.DigitalProductOrderProcessingStrategy;
import com.bob.strategies.PerishableOrderProcessingStrategy;

// 测试代码
public class StrategyPatternTest {
    public static void main(String[] args) {
        // 创建订单处理类
        OrderProcessor orderProcessor = new OrderProcessor();

        // 创建不同类型的订单处理策略
        OrderProcessingStrategy defaultStrategy = new DefaultOrderProcessingStrategy();
        OrderProcessingStrategy perishableStrategy = new PerishableOrderProcessingStrategy();
        OrderProcessingStrategy digitalProductStrategy = new DigitalProductOrderProcessingStrategy();

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