package com.example.superheroes.controller;

import com.example.superheroes.model.SuperHeroDTO;
import com.example.superheroes.service.SuperheroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class SuperheroController {

    @Autowired
    SuperheroService superheroService;

    @PostMapping("/superhero")
    public  ResponseEntity<String> createTestCase(@Valid @RequestBody SuperHeroDTO superHeroDTO) {

        superheroService.saveSuperhero(superHeroDTO);

        return new ResponseEntity<String>("Successful", HttpStatus.CREATED);
    }

    @GetMapping("/superHero/{name}")
    public ResponseEntity<SuperHeroDTO> getSuperhero(@PathVariable("name") String name) {

        List<SuperHeroDTO> superHeroDTO = superheroService.getSuperhero(name);

        if (superHeroDTO.isEmpty()) {
            return new ResponseEntity<SuperHeroDTO>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<SuperHeroDTO>(superHeroDTO.get(0), HttpStatus.OK);
    }
}
