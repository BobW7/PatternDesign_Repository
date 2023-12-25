package com.bob.combination4;

import java.util.Scanner;

public class S0123_TransactionHandler {
    public void withdraw() {
        // 取款逻辑
        System.out.println("请输入取款金额：");
        Scanner scanner = new Scanner(System.in);
        double amount = scanner.nextDouble();
        // 执行取款操作
        System.out.println("成功取款：" + amount + "元");
    }

    public void deposit() {
        // 存款逻辑
        System.out.println("请输入存款金额：");
        Scanner scanner = new Scanner(System.in);
        double amount = scanner.nextDouble();
        // 执行存款操作
        System.out.println("成功存款：" + amount + "元");
    }

    public void transfer() {
        // 转账逻辑
        System.out.println("请输入转账金额：");
        Scanner scanner = new Scanner(System.in);
        double amount = scanner.nextDouble();
        // 执行转账操作
        System.out.println("成功转账：" + amount + "元");
    }

    public void checkBalance() {
        // 查询余额逻辑
        // 执行查询余额操作
        System.out.println("当前余额：1000元");
    }
}
