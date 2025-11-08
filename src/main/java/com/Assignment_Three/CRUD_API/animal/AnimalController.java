package com.Assignment_Three.CRUD_API.animal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.ui.Model;

@Controller
public class AnimalController {

    @Autowired
    private AnimalService animalService;

    @GetMapping({"/animals", "/animals/"})
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
    public Object getAnimalsByGender(@RequestParam String gender, Model model) {
        //return animalService.getAnimalsByGender(gender);
        model.addAttribute("animalList", animalService.getAnimalsByGender(gender));
        model.addAttribute("title", "Animals by gender: " + gender);
        return "index";
    }

    @GetMapping("/animals/weight")
    public Object getAnimalsByWeight(@RequestParam double key, Model model) {
        //return animalService.getAnimalsByWeight(key);
        model.addAttribute("animalList", animalService.getAnimalsByWeight(key));
        model.addAttribute("title", "Animals by weight: " + key);
        return "index";
    }

    /**
     * Endpoint to get old animals with an age >= 100
     * 
     * @param age The age threshold for "old" animals
     * @return list of animals with an age above the threshold
     */
    @GetMapping("/animals/age")
    public Object getAnimalsByAge(@RequestParam(name = "age", defaultValue = "100") int age, Model model) {
        //return new ResponseEntity<>(animalService.getAnimalsByAge(age), HttpStatus.OK);
        model.addAttribute("animalList", animalService.getAnimalsByAge(age));
        model.addAttribute("title", "Animals over 100 years old: " + age);
        return "index";
    }

    @GetMapping("/animals/createForm")
    public Object createForm(Model model) {
        Animal animal = new Animal();
        model.addAttribute("animal", animal);
        model.addAttribute("title", "Add new animal");
        return "animalForm";
    }

    @PostMapping("/animals")
    public Object addAnimal(Animal animal, @RequestParam MultipartFile picture) {
        //return animalService.addAnimal(animal);
        Animal newAnimal = animalService.addAnimal(animal, picture);
        return "redirect:/animals" + newAnimal.getAnimalId();
    }

    @GetMapping("/animals/updateForm/{id}")
    public Object updateForm(@PathVariable Long id, Model model) {
        Animal animal = animalService.getAnimalsById(id);
        model.addAttribute("animal", animal);
        model.addAttribute("title", "Update Animal: ");
        return "update";
    }

    @PostMapping("/animals/update/{id}")
    public Object updateAnimal(@PathVariable Long id, @RequestBody Animal animal, @RequestParam MultipartFile picture) {
        animalService.updateAnimal(id, animal, picture);
        return "redirect:/students" + id;
    }

    @DeleteMapping("/animals/delete/{id}")
    public Object deleteAnimal(@PathVariable Long id) {
        animalService.deleteAnimal(id);
        return "redirect:/animals";
    }
}
