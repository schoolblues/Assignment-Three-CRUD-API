package com.Assignment_Three.CRUD_API.animal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "animals")
public class Animal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long    animalId;

    @Column(nullable = false)
    private String  name;
    private String  gender;

    @Column(nullable = false)
    private double  age;
    private double  weight;

    public Animal() {
    }

    public Animal(Long animalId, String name, String gender, double age, double weight) {
        this.animalId       = animalId;
        this.name           = name;
        this.gender         = gender;
        this.age            = age;
        this.weight         = weight;
    }

    public Animal(String name, String gender, double age, double weight) {
        this.name           = name;
        this.gender         = gender;
        this.age            = age;
        this.weight         = weight;
    }

    public Long getAnimalId() {
        return animalId;
    }

    public void setAnimalId(Long Id) {
        this.animalId = Id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
