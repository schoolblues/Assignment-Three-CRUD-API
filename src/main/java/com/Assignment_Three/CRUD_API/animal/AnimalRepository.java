package com.Assignment_Three.CRUD_API.animal;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface AnimalRepository extends JpaRepository<Animal, Long> {

    @Query(value = "select * from animals a where a.name like %?1% ", nativeQuery = true)
    List<Animal> getAnimalsByName(String name);

    @Query(value = "select * from animals a where a.age >= ?1", 
    nativeQuery = true)
    List<Animal> getAnimalsByAge(int age);

    List<Animal> getAnimalsByWeight(double weight);

    List<Animal> getAnimalsByGender(String gender);
}
