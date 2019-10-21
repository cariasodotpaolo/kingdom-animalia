package test.io.exam.animal.service;

import io.exam.animal.MainApplication;
import io.exam.animal.model.Animal;
import io.exam.animal.model.impl.*;
import io.exam.animal.repository.AnimalRepository;
import io.exam.animal.service.AnimalClassifierService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.BDDMockito.given;

@ExtendWith(SpringExtension.class)
@SpringBootTest( classes = MainApplication.class, webEnvironment = SpringBootTest.WebEnvironment.NONE)
public class AnimalClassifierServiceTest {

    @Autowired
    private AnimalClassifierService unitUnderTest;

    @Mock
    private AnimalRepository animalRepository;

    @BeforeEach
    public void before() {
        given(animalRepository.getAnimals()).willReturn(givenListOfAnimals());
    }

    @Test
    void countFlyingAnimals() {

        int count = unitUnderTest.countFlyingAnimals();
        System.out.println("Flying animals count: " + count);
    }

    @Test
    void countSingingAnimals() {

        int count = unitUnderTest.countSingingAnimals();
        System.out.println("Singing animals count: " + count);
    }

    @Test
    void countWalkingAnimals() {

        int count = unitUnderTest.countSwimmingAnimals();
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
