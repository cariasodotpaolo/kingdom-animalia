package io.exam.animal.model.impl;

import io.exam.animal.model.Animal;

public class AnimalImpl implements Animal {

    @Override
    public String walk(){
        String message = "I am walking";
        System.out.println(message);
        return message;
    }
}
