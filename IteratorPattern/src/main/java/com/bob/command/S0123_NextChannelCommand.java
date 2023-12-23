package com.bob.command;

import com.bob.Iterators.S0123_Iterator;
import com.bob.S0123_Channel;
import com.bob.S0123_Television;

public class S0123_NextChannelCommand implements S0123_Command {
    private final S0123_Television television;
    private final S0123_Iterator iterator;

    public S0123_NextChannelCommand(S0123_Television television) {
        this.television = television;
        iterator = television.getIterator();
    }

    @Override
    public void execute() {
        if (iterator.hasNext()) {
            S0123_Channel nextChannel = iterator.next();
            // 在这里实现切换到下一个频道的逻辑
            System.out.println(television.getBrand() + "电视机切换到下一个频道: " + nextChannel.getName() + "。");
        } else {
            System.out.println("没有下一个频道了");
        }
    }
}