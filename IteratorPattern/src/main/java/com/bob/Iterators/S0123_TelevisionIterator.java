package com.bob.Iterators;

import com.bob.S0123_Channel;

import java.util.List;

public class S0123_TelevisionIterator implements S0123_Iterator {
    int index = 0;
    private final List<S0123_Channel> channels;

    public S0123_TelevisionIterator(List<S0123_Channel> channels) {
        this.channels = channels;
    }

    @Override
    public boolean hasNext() {
        return index < channels.size();
    }

    @Override
    public S0123_Channel next() {
        if (hasNext()) {
            return channels.get(index++);
        }
        return null;
    }

    @Override
    public boolean hasPrev() {
        return index > 1;
    }

    @Override
    public S0123_Channel prev() {
        if (hasPrev()) {
            index -= 2;
            return channels.get(index);
        }
        return null;
    }

    @Override
    public void remove() {
        channels.remove(channels.size() - 1);
    }
}
