package io.exam.animal.model.impl;

import io.exam.animal.model.FlyingBird;

public class Parrot extends AbstractBird implements FlyingBird {

    private String livingWith;
    private String mimickedSound;

    public Parrot() {
    }


    public Parrot(String livingWith, String mimickedSound) {
        this.livingWith = livingWith;
        this.mimickedSound = mimickedSound;
    }

    @Override
    public String sing() {
        return mimickedSound;
    }

    @Override
    public String fly() {
        return "I am flying";
    }

    public String getLivingWith() {
        return livingWith;
    }

    public void setLivingWith(String livingWith) {
        this.livingWith = livingWith;
    }

    public void setMimickedSound(String mimickedSound) {
        this.mimickedSound = mimickedSound;
    }

}
