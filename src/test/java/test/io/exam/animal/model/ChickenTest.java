package test.io.exam.animal.model;

import io.exam.animal.model.Animal;
import io.exam.animal.model.Bird;
import io.exam.animal.model.impl.Chicken;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ChickenTest {

    @Test
    public void whenChickenSingsThenPrint() {

        Bird chicken = new Chicken();
        String message = chicken.sing();

        assertEquals("Cluck, cluck", message);
        System.out.println(message);
    }

    @Test
    public void whenChickenWalksThenPrint() {

        Animal chicken = new Chicken();
        String message = chicken.walk();

        assertEquals("I am walking", message);
        System.out.println(message);
    }
}
