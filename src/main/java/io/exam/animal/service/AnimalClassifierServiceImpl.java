package io.exam.animal.service;

import io.exam.animal.model.*;

import java.util.List;

public class AnimalClassifierServiceImpl implements AnimalClassifierService {

    @Override
    public int countFlyingAnimals(List<Animal> animals) {

        int count = 0;

        for (Animal animal: animals) {

            if(animal instanceof FlyingAnimal) {
                count++;
            }
        }

        return count;

    }

    @Override
    public int countSingingAnimals(List<Animal> animals) {

        int count = 0;

        for (Animal animal: animals) {

            if(animal instanceof Bird) {
                count++;
            }
        }

        return count;
    }

    @Override
    public int countWalkingAnimals(List<Animal> animals) {

        int count = 0;

        for (Animal animal: animals) {

            if(animal instanceof WalkingAnimal) {
                count++;
            }
        }

        return count;
    }

    @Override
    public int countSwimmingAnimals(List<Animal> animals) {

        int count = 0;

        for (Animal animal: animals) {

            if(animal instanceof SwimmingAnimal) {
                count++;
            }
        }

        return count;
    }
}
