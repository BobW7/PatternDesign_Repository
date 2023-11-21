package com.bob.decorators;

import com.bob.S20210440123_Prince;

public abstract class S20210440123_PrinceDecorator extends S20210440123_Prince {
    protected S20210440123_Prince prince;

    public S20210440123_PrinceDecorator(S20210440123_Prince prince) {
        this.prince = prince;
    }

    @Override
    public String getDescription() {
        return prince.getDescription();
    }
}