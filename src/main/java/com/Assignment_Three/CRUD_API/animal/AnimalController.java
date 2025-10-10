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
    public Animal getAnimalById(@PathVariable long id) {
        return animalService.getAnimalById(id);
    }

    @GetMapping("/animals/name")
    public Object getAnimalsByName(@RequestParam String key) {
        if (key != null) {
            return animalService.getAnimalsByName(key);
        } else {
            return animalService.getAllStudents();
        }
    }

    @GetMapping("/animals/description")
    public Object getAnimalsByDescription(@RequestParam String description) {
        if (key != null) {
            return animalService.getAnimalsByDescription(description);
        } else {
            return animalService.getAllAnimals();
        }
    }

        @GetMapping("/animals/gender")
    public Object getAnimalsByGender(@RequestParam String gender) {
        if (key != null) {
            return animalService.getAnimalsByGender(gender);
        } else {
            return animalService.getAllAnimals();
        }
    }

    @GetMapping("/animals/weight")
    public Object getAnimalByWeight(@RequestParam double weight) {
        return animalService.getAnimalByWeight(weight);
    }

    @GetMapping("/animals/age")
    public Object getAnimalByAge(@RequestParam double age) {
        return animalService.getAnimalByAge(age);
    }

}
