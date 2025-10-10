package com.Assignment_Three.CRUD_API.animal;

import java.io.IOException;
import java.io.File;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class AnimalService {
    
    @Autowired
    private AnimalRepository animalRepository;

    public Object getAllAnimals() {
        return animalRepository.findAll();
    }

    public Animal getAnimalsById(@PathVariable long animalId) {
        return animalRepository.findById(animalId).orElse(null);
    }

    public Object getAnimalsByName(String name) {
        return animalRepository.getAnimalsByName(name);
    }

    public Object getAnimalsByDescription(String description) {
        return animalRepository.getAnimalsByDescription(description);
    }

    public Object getAnimalsByGender(String gender) {
        return animalRepository.getAnimalsByGender(gender);
    }

    public Object getAnimalsByWeight(double weight){
        return animalRepository.getAnimalsByWeight(weight);
    }

    public Object getAnimalsByAge(double age) {
        return animalRepository.getAnimalsByAge(age);
    }
}
