package io.exam.animal.model.impl;

import io.exam.animal.model.Bird;

public abstract class AbstractBird implements Bird {

    @Override
    public String sing() {
        return "I am singing";
    }

    @Override
    public String walk() {
        return "I am walking";
    }
}
