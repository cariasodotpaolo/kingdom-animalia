package io.exam.animal.model.impl;

import io.exam.animal.model.SwimmingAnimal;

public class Dolphin implements SwimmingAnimal {

    @Override
    public String swim() {
        return "I am swimming";
    }
}
