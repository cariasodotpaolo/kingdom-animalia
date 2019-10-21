package test.io.exam.animal.service;

import io.exam.animal.model.Animal;
import io.exam.animal.model.impl.*;
import io.exam.animal.service.AnimalClassifierService;
import io.exam.animal.service.AnimalClassifierServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class AnimalClassifierServiceTest {

    private AnimalClassifierService unitUnderTest;

    @BeforeEach
    public void before() {
        unitUnderTest = new AnimalClassifierServiceImpl();
    }

    @Test
    void countFlyingAnimals() {

        int count = unitUnderTest.countFlyingAnimals(givenListOfAnimals());
        System.out.println("Flying animals count: " + count);
    }

    @Test
    void countSingingAnimals() {

        int count = unitUnderTest.countSingingAnimals(givenListOfAnimals());
        System.out.println("Singing animals count: " + count);
    }

    @Test
    void countWalkingAnimals() {

        int count = unitUnderTest.countSwimmingAnimals(givenListOfAnimals());
        System.out.println("Swimming animals count: " + count);
    }

    private List<Animal> givenListOfAnimals() {

        List<Animal> animals = new ArrayList<>();

        animals.add(new Duck());
        animals.add(new Chicken());
        animals.add(new Rooster());
        animals.add(new Parrot());
        animals.add(new Shark());
        animals.add(new ClownFish());
        animals.add(new Dolphin());
        animals.add(new Frog());
        animals.add(new Dog());
        animals.add(new Butterfly());
        animals.add(new Cat());

        return animals;
    }
}
