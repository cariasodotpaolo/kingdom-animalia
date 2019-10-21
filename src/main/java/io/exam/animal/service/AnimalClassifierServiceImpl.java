package io.exam.animal.service;

import io.exam.animal.model.*;
import io.exam.animal.repository.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AnimalClassifierServiceImpl implements AnimalClassifierService {

    private AnimalRepository animalRepository;

    @Autowired
    public AnimalClassifierServiceImpl(AnimalRepository animalRepository) {
        this.animalRepository = animalRepository;
    }

    @Override
    public int countFlyingAnimals() {

        int count = 0;

        for (Animal animal: animalRepository.getAnimals()) {

            if(animal instanceof FlyingAnimal) {
                count++;
            }
        }

        return count;

    }

    @Override
    public int countSingingAnimals() {

        int count = 0;

        for (Animal animal: animalRepository.getAnimals()) {

            if(animal instanceof Bird) {
                count++;
            }
        }

        return count;
    }

    @Override
    public int countWalkingAnimals() {

        int count = 0;

        for (Animal animal: animalRepository.getAnimals()) {

            if(animal instanceof WalkingAnimal) {
                count++;
            }
        }

        return count;
    }

    @Override
    public int countSwimmingAnimals() {

        int count = 0;

        for (Animal animal: animalRepository.getAnimals()) {

            if(animal instanceof SwimmingAnimal) {
                count++;
            }
        }

        return count;
    }
}
