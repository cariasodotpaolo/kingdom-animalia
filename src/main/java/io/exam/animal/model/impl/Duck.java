package io.exam.animal.model.impl;

import io.exam.animal.model.FlyingBird;

public class Duck extends AbstractBird implements FlyingBird {

    @Override
    public String fly() {
        return "I am flying";
    }

    @Override
    public String sing() {
        return "Quack, quack";
    }
}
