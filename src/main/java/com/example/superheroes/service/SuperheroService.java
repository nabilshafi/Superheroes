package com.example.superheroes.service;

import com.example.superheroes.model.SuperHeroDTO;
import com.example.superheroes.repository.SuperheroRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SuperheroService {

    @Autowired
    SuperheroRepo superheroRepo;

    public void saveSuperhero(SuperHeroDTO superHeroDTO){

        superheroRepo.save(superHeroDTO);

    }

    public List<SuperHeroDTO> getSuperhero(String name){

        return  superheroRepo.findByName(name);

    }

}
