package io.exam.animal.model.impl;

public class Butterfly extends Caterpillar implements FlyingInsect {

    @Override
    public String fly() {
        return "I am flying";
    }

    @Override
    public String walk() {
        return "I am crawling";
    }

}
