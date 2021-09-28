package com.example.superheroes.repository;

import com.example.superheroes.model.SuperHeroDTO;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface  SuperheroRepo extends  CrudRepository<SuperHeroDTO, Long> {

    List<SuperHeroDTO> findByName(String name);

}
