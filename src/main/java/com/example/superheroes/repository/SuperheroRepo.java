package com.example.superheroes.repository;

import com.example.superheroes.model.SuperHeroDTO;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface  SuperheroRepo extends  CrudRepository<SuperHeroDTO, Long> {

    List<SuperHeroDTO> findByName(String name);


}
