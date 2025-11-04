package com.Assignment_Three.CRUD_API.animal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;


import org.springframework.ui.Model;

@Controller
public class AnimalController {

    @Autowired
    private AnimalService animalService;

    @GetMapping("/animals")
    public Object getAllAnimals(Model model) {
        // return animalService.getAllAnimals();
        model.addAttribute("animalsList",animalService.getAllAnimals());
        model.addAttribute("title", "All Animals");
        return "index";

    }


    @GetMapping("/animals/{id}")
    public String getAnimalsById(@PathVariable long id, Model model) {
        // return animalService.getAnimalsById(id);
        model.addAttribute("animal", animalService.getAnimalsById(id));
        model.addAttribute("title", "Animal #: " + id);
        return "details";
    }

    @GetMapping("/animals/name")
    public Object getAnimalsByName(@RequestParam String key, Model model) {
        if (key != null) {
            // return animalService.getAnimalsByName(key);
            model.addAttribute("animalsList", animalService.getAnimalsByName(key));
            model.addAttribute("title", "Animals by name: " + key);
            return "index";
        } else {
            // return animalService.getAllAnimals();
            return "redirect:/animals/";
        }
    }

    @GetMapping("/animals/gender/{gender}")
    public Object getAnimalsByGender(@RequestParam String gender) {
        return animalService.getAnimalsByGender(gender);
    }

    @GetMapping("/animals/weight")
    public Object getAnimalsByWeight(@RequestParam double key) {
        return animalService.getAnimalsByWeight(key);
    }

    /**
     * Endpoint to get old animals with an age >= 100
     * 
     * @param age The age threshold for "old" animals
     * @return list of animals with an age above the threshold
     */
    @GetMapping("/animals/age")
    public Object getAnimalsByAge(@RequestParam(name = "age", defaultValue = "100") int age) {
        return new ResponseEntity<>(animalService.getAnimalsByAge(age), HttpStatus.OK);
    }

    @PostMapping("/animals")
    public Object addAnimal(@RequestBody Animal animal) {
        return animalService.addAnimal(animal);
    }

    @PutMapping("/animals/{id}")
    public Animal updateAnimal(@PathVariable Long id, @RequestBody Animal animal) {
        animalService.updateAnimal(id, animal);
        return animalService.getAnimalsById(id);
    }

    @DeleteMapping("/animals/{id}")
    public Object deleteAnimal(@PathVariable Long id) {
        animalService.deleteAnimal(id);
        return animalService.getAllAnimals();
    }
}
