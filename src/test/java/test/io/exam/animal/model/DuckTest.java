package test.io.exam.animal.model;

import io.exam.animal.model.Animal;
import io.exam.animal.model.Bird;
import io.exam.animal.model.impl.Duck;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DuckTest {

    @Test
    public void whenDuckSingsThenPrint() {

        Bird duck = new Duck();
        String message = duck.sing();

        assertEquals("Quack, quack", message);
        System.out.println(message);
    }

    @Test
    public void whenDuckWalksThenPrint() {

        Animal duck = new Duck();
        String message = duck.walk();

        assertEquals("I am walking", message);
        System.out.println(message);
    }

    @Test
    public void whenDuckFliesThenPrint() {

        Duck duck = new Duck();
        String message = duck.fly();

        assertEquals("I am flying", message);
        System.out.println(message);
    }
}
