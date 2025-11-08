package com.Assignment_Three.CRUD_API.animal;

import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.multipart.MultipartFile;

@Service
public class AnimalService {
    
    @Autowired
    private AnimalRepository animalRepository;

    private static final String UPLOAD_DIR = "src/main/resources/static/profile-pictures/";

    public Object getAllAnimals() {
        return animalRepository.findAll();
    }

    public Animal getAnimalsById(@PathVariable long animalId) {
        return animalRepository.findById(animalId).orElse(null);
    }

    public Object getAnimalsByName(String name) {
        return animalRepository.getAnimalsByName(name);
    }

    public Object getAnimalsByGender(String gender) {
        return animalRepository.getAnimalsByGender(gender);
    }

    public Object getAnimalsByWeight(double weight){
        return animalRepository.getAnimalsByWeight(weight);
    }

    public Object getAnimalsByAge(int age) {
        return animalRepository.getAnimalsByAge(age);
    }

    public Animal addAnimal(Animal animal, MultipartFile profilePicture) {
        //return animalRepository.save(animal);
        Animal newAnimal = animalRepository.save(animal);
        String originalFileName = profilePicture.getOriginalFilename();

        try {
            if (originalFileName != null && originalFileName.contains(".")) {
                String fileExtension = originalFileName.substring(originalFileName.lastIndexOf(".") + 1);
                String fileName = String.valueOf(newAnimal.getAnimalId()) + "." + fileExtension;
                Path filePath = Paths.get(UPLOAD_DIR + fileName);

                InputStream inputStream = profilePicture.getInputStream();

                Files.createDirectories(Paths.get(UPLOAD_DIR));
                Files.copy(inputStream, filePath, StandardCopyOption.REPLACE_EXISTING);
                newAnimal.setProfilePicturePath(fileName);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return animalRepository.save(newAnimal);
    }

    public Animal updateAnimal(Long animalId, Animal animal, MultipartFile profilePicture) {
        //return animalRepository.save(animal);
        Animal newAnimal = animalRepository.save(animal);
        String originalFileName = profilePicture.getOriginalFilename();

        try {
            if (originalFileName != null && originalFileName.contains(".")) {
                String fileExtension = originalFileName.substring(originalFileName.lastIndexOf(".") + 1);
                String fileName = String.valueOf(newAnimal.getAnimalId()) + "." + fileExtension;
                Path filePath = Paths.get(UPLOAD_DIR + fileName);

                InputStream inputStream = profilePicture.getInputStream();

                Files.createDirectories(Paths.get(UPLOAD_DIR));
                Files.copy(inputStream, filePath, StandardCopyOption.REPLACE_EXISTING);
                newAnimal.setProfilePicturePath(fileName);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return animalRepository.save(newAnimal);
    }

    public void deleteAnimal(Long animalId) {
        animalRepository.deleteById(animalId);
    }
}
