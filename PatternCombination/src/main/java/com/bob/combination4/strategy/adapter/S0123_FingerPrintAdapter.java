package com.bob.combination4.strategy.adapter;

import com.bob.combination4.strategy.S0123_AuthenticationStrategy;
import com.bob.combination4.strategy.S0123_FingerPrintValidator;

// 适配器模式-指纹识别适配器，它作为一个识别策略，实现了识别策略接口
public class S0123_FingerPrintAdapter implements S0123_AuthenticationStrategy {
    private S0123_FingerPrintValidator fingerPrintValidator;

    public S0123_FingerPrintAdapter(S0123_FingerPrintValidator fingerPrintReader) {
        this.fingerPrintValidator = fingerPrintReader;
    }

    @Override
    public boolean authenticate() {
        return fingerPrintValidator.process();
    }
}
