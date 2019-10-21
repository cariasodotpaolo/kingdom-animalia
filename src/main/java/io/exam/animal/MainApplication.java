package io.exam.animal;

import io.exam.animal.model.impl.Chicken;
import io.exam.animal.model.impl.Duck;

public class MainApplication {

    public static void main(String[] args) {
        Duck bird = new Duck();
        System.out.println(bird.walk());
        System.out.println(bird.fly());
        System.out.println(bird.sing());

        Chicken chicken = new Chicken();
        System.out.println(chicken.sing());
        System.out.println(chicken.walk());
    }
}
