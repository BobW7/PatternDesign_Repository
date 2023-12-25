package com.bob.combination4.state;

import com.bob.combination4.S0123_TransactionHandler;
import com.bob.combination4.S0123_TransactionProcessor;

public class S0123_TransactionState implements S0123_TerminalState {
    private final S0123_TransactionHandler handler = new S0123_TransactionHandler();
    @Override
    public void handle(S0123_TransactionProcessor processor) {
        System.out.println("正在进行业务办理,您可以选择：");
        System.out.println("1.取款");
        System.out.println("2.存款");
        System.out.println("3.转账");
        System.out.println("4.查询余额");
        System.out.println("5.退卡");
        System.out.println("模拟选择了存款：");
        //这里可以根据用户的选择进行不同的业务处理，但是为了简单起见，这里只是模拟了存款业务
        handler.deposit();
        // 状态转移为退卡状态
        processor.setCurrentState(new S0123_EjectCardState());
    }
}
