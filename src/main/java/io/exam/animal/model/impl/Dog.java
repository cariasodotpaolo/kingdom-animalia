package io.exam.animal.model.impl;

import io.exam.animal.model.WalkingAnimal;

public class Dog implements WalkingAnimal {

    @Override
    public String walk() {
        return "I am walking";
    }
}
