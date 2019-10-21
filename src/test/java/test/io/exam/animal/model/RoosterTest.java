package test.io.exam.animal.model;

import io.exam.animal.model.Animal;
import io.exam.animal.model.Bird;
import io.exam.animal.model.impl.Rooster;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class RoosterTest {

    @Test
    public void whenRoosterSingsThenPrint() {

        Rooster rooster = new Rooster();
        String message = rooster.sing();

        assertEquals("Cock-a-doodle-doo", message);
        assertFalse("Cluck, cluck".equals(message));
        System.out.println(message);
    }

    @Test
    public void testRoosterIsABird() {

        Bird bird = new Rooster();
        String message = bird.sing();

        assertEquals("Cock-a-doodle-doo", message);
        assertFalse("Cluck, cluck".equals(message));
        System.out.println(message);
    }

    @Test
    public void whenRoosterWalksThenPrint() {

        Rooster rooster = new Rooster();
        String message = rooster.walk();

        assertEquals("I am walking", message);
        System.out.println(message);
    }

    @Test
    public void testRoosterIsAnAnimal() {

        Animal rooster = new Rooster();
        String message = rooster.walk();

        assertEquals("I am walking", message);
        System.out.println(message);
    }
}
