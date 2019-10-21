package io.exam.animal.model.impl;

import io.exam.animal.model.SwimmingAnimal;

public class Fish implements SwimmingAnimal {

    private String color;
    private String size;

    public Fish(String color, String size) {
        this.color = color;
        this.size = size;
    }

    @Override
    public String swim() {
        return "I am a swimming fish";
    }

    public String getColor() {
        return color;
    }

    public String getSize() {
        return size;
    }
}
