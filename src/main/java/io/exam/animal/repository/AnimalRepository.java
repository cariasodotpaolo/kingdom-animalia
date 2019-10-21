package io.exam.animal.repository;

import io.exam.animal.model.Animal;
import io.exam.animal.model.impl.*;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Repository
public class AnimalRepository {

    private List<Animal> animals;

    public AnimalRepository() {
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(List<Animal> animals) {
        this.animals = animals;
    }

    @PostConstruct
    public void loadAnimals() {

        animals = new ArrayList<>();

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
    }
}
