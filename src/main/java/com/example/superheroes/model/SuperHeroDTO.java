package com.example.superheroes.model;

import java.util.List;

public class SuperHeroDTO {

    String alias;
    String name;
    String origin;
    List<String> powers;
    List<String> weapons;
    List<String> associations;

    public SuperHeroDTO(String alias, String name, String origin, List<String> powers, List<String> weapons, List<String> associations) {
        this.alias = alias;
        this.name = name;
        this.origin = origin;
        this.powers = powers;
        this.weapons = weapons;
        this.associations = associations;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public List<String> getPowers() {
        return powers;
    }

    public void setPowers(List<String> powers) {
        this.powers = powers;
    }

    public List<String> getWeapons() {
        return weapons;
    }

    public void setWeapons(List<String> weapons) {
        this.weapons = weapons;
    }

    public List<String> getAssociations() {
        return associations;
    }

    public void setAssociations(List<String> associations) {
        this.associations = associations;
    }



}
