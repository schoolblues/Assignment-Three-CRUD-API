package com.Assignment_Three.CRUD_API.animal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnimalController {

    @Autowired
    private AnimalService animalService;

    @GetMapping("/animals")
    public Object getAllAnimals() {
        return animalService.getAllAnimals();
    }


    @GetMapping("/animals/{id}")
    public Animal getAnimalsById(@PathVariable long id) {
        return animalService.getAnimalsById(id);
    }

    @GetMapping("/animals/name")
    public Object getAnimalsByName(@RequestParam String key) {
        if (key != null) {
            return animalService.getAnimalsByName(key);
        } else {
            return animalService.getAllAnimals();
        }
    }

    @GetMapping("/animals/description")
    public Object getAnimalsByDescription(@RequestParam String description) {
        if (description != null) {
            return animalService.getAnimalsByDescription(description);
        } else {
            return animalService.getAllAnimals();
        }
    }

        @GetMapping("/animals/gender")
    public Object getAnimalsByGender(@RequestParam String gender) {
        if (gender != null) {
            return animalService.getAnimalsByGender(gender);
        } else {
            return animalService.getAllAnimals();
        }
    }

    @GetMapping("/animals/weight")
    public Object getAnimalsByWeight(@RequestParam double weight) {
        return animalService.getAnimalsByWeight(weight);
    }

    @GetMapping("/animals/age")
    public Object getAnimalsByAge(@RequestParam double age) {
        return animalService.getAnimalsByAge(age);
    }

}
