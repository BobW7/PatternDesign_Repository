package com.bob;

import com.bob.Iterators.S0123_Iterator;
import com.bob.Iterators.S0123_TelevisionIterator;

import java.util.ArrayList;
import java.util.List;

public class S0123_Television {
    private final String brand;
    private final List<S0123_Channel> channels;
    private S0123_Iterator iterator;

    public S0123_Television(String brand) {
        this.brand = brand;
        channels = new ArrayList<>();
    }

    public void addChannel(S0123_Channel channel) {
        channels.add(channel);
        iterator = null;
    }

    public S0123_Iterator getIterator() {
        if (iterator == null) {
            iterator = new S0123_TelevisionIterator(channels);
        }
        return iterator;
    }

    public void turnOn() {
        System.out.println(brand + "电视机已开机");
    }

    public void turnOff() {
        System.out.println(brand + "电视机已关机");
    }

    public String getBrand() {
        return brand;
    }
}

