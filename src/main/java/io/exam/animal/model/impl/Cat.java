package io.exam.animal.model.impl;

import io.exam.animal.model.WalkingAnimal;

public class Cat implements WalkingAnimal {

    @Override
    public String walk() {
        return "I am walking";
    }
}
