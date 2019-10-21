package test.io.exam.animal.model;

import io.exam.animal.model.Animal;
import io.exam.animal.model.impl.AnimalImpl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AnimalTest {

    @Test
    public void whenAnimalWalksThenPrint() {

        Animal animal = new AnimalImpl();

        String message = animal.walk();

        assertEquals("I am walking", message);
    }
}
