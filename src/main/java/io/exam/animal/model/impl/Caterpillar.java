package io.exam.animal.model.impl;

import io.exam.animal.model.Insect;

public class Caterpillar implements Insect {

    @Override
    public String walk() {
        return "I am crawling";
    }
}
