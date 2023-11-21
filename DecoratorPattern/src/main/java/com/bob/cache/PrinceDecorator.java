package com.bob.cache;

public abstract class PrinceDecorator extends Prince {
    protected Prince prince;

    public PrinceDecorator(Prince prince) {
        this.prince = prince;
    }

    public abstract String getDescription();
}