package io.exam.animal.service;

import io.exam.animal.model.Animal;

import java.util.List;

public interface AnimalClassifierService {
    int countFlyingAnimals(List<Animal> animals);

    int countSingingAnimals(List<Animal> animals);

    int countWalkingAnimals(List<Animal> animals);

    int countSwimmingAnimals(List<Animal> animals);
}
