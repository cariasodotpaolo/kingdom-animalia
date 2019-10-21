package test.io.exam.animal.model;

import io.exam.animal.model.WalkingAnimal;
import io.exam.animal.model.Bird;
import io.exam.animal.model.impl.Chicken;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ChickenTest {

    @Test
    public void whenChickenSingsThenPrint() {

        Chicken chicken = new Chicken();
        String message = chicken.sing();

        assertEquals("Cluck, cluck", message);
        System.out.println(message);
    }

    @Test
    public void testChickenIsABird() {

        Bird bird = new Chicken();
        String message = bird.sing();

        assertEquals("Cluck, cluck", message);
        System.out.println(message);
    }

    @Test
    public void whenChickenWalksThenPrint() {

        Chicken chicken = new Chicken();
        String message = chicken.walk();

        assertEquals("I am walking", message);
        System.out.println(message);
    }

    @Test
    public void testChickenIsAnAnimal() {

        WalkingAnimal walkingAnimal = new Chicken();
        String message = walkingAnimal.walk();

        assertEquals("I am walking", message);
        System.out.println(message);
    }
}
