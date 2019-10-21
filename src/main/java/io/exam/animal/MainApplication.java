package io.exam.animal;

import io.exam.animal.model.impl.BirdImpl;

public class MainApplication {

    public static void main(String[] args) {
        BirdImpl bird = new BirdImpl();
        bird.walk();
        bird.fly();
        bird.sing();
    }
}
