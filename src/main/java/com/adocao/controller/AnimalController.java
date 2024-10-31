package com.adocao.controller;

import com.adocao.animal.Animal;
import com.adocao.repository.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("animals")
public class AnimalController {

    @Autowired
    private AnimalRepository animalRepository;

    @GetMapping
    public List<Animal> getAllAnimals() {
        return animalRepository.findAll();
    }

    @PostMapping
    public String saveAnimal(@RequestBody Animal animal) {
        animalRepository.save(animal);
        return "Animal saved";
    }
}
