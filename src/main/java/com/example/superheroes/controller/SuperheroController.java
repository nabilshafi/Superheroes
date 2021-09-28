package com.example.superheroes.controller;

import com.example.superheroes.model.SuperHeroDTO;
import org.apache.catalina.connector.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class SuperheroController {

    @PostMapping("/testcases")
    public  ResponseEntity<String> createTestCase(@RequestBody SuperHeroDTO superHeroDTO) {
        
        return new ResponseEntity<String>("Successful", HttpStatus.CREATED);
    }

    @GetMapping("/superHero//{name}")
    public ResponseEntity<SuperHeroDTO> listAllCategoriesByName(@PathVariable("name") String name) {

        SuperHeroDTO superHeroDTO = null;

     /*   if (superHeroDTO.isEmpty()) {
            return new ResponseEntity<SuperHeroDTO>(HttpStatus.NO_CONTENT);
        }*/
        return new ResponseEntity<SuperHeroDTO>(superHeroDTO, HttpStatus.OK);
    }
}
