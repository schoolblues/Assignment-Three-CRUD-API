package com.Assignment_Three.CRUD_API.animal;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface AnimalRepository extends JpaRepository<Animal, Long> {
    List<Animal> getAnimalsByName(String name);

    @Query(value = "select * from animals a where a.age >= ?1", 
    nativeQuery = true)
    List<Animal> getAnimalsByAge(double age);

    List<Animal> getAnimalsByWeight(double age);

    List<Animal> getAnimalsByDescription(String description);

    List<Animal> getAnimalsByGender(String gender);
}
