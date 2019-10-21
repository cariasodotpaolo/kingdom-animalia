package io.exam.animal.controller;

import io.exam.animal.service.AnimalClassifierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnimalController {

    private AnimalClassifierService animalClassifierService;

    @Autowired
    public AnimalController(AnimalClassifierService animalClassifierService) {
        this.animalClassifierService = animalClassifierService;
    }

    @GetMapping("/animals/count")
    public ResponseEntity<String> countFlyingAnimals(@RequestParam("classifier") String classifier) {

        int count = 0;

        switch(classifier) {

            case "flying": {
                count = animalClassifierService.countFlyingAnimals();
                break;
            }
            case "singing": {
                count = animalClassifierService.countSingingAnimals();
                break;
            }
            case "swimming": {
                count = animalClassifierService.countSwimmingAnimals();
                break;
            }
            case "walking": {
                count = animalClassifierService.countWalkingAnimals();
                break;
            }
        }

        return new ResponseEntity<String>(String.valueOf(count), HttpStatus.OK);

    }
}
