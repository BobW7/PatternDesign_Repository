package com.bob.Iterators;

import com.bob.S0123_Channel;

public interface S0123_Iterator {
    boolean hasNext();

    S0123_Channel next();

    boolean hasPrev();

    S0123_Channel prev();

    void remove();
}