package test.io.exam.animal.model;

import io.exam.animal.model.Animal;
import io.exam.animal.model.Bird;
import io.exam.animal.model.impl.BirdImpl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BirdTest {

    @Test
    public void whenBirdSingsThenPrint() {

        Bird bird = new BirdImpl();

        String message = bird.sing();

        assertEquals("I am singing", message);
    }

    @Test
    public void whenBirdWalksThenPrint() {

        Animal bird = new BirdImpl();

        String message = bird.walk();

        assertEquals("I am walking", message);
    }

    @Test
    public void whenBirdFliesThenPrint() {

        Bird bird = new BirdImpl();

        String message = bird.fly();

        assertEquals("I am flying", message);
    }
}
