package io.exam.animal.model.impl;

import io.exam.animal.model.Bird;

public class BirdImpl extends AnimalImpl implements Bird {

    @Override
    public String fly() {
        String message = "I am flying";
        System.out.println(message);

        return message;
    }

    @Override
    public String sing() {
        String message = "I am singing";
        System.out.println("I am singing");
        return message;
    }
}
