package org.example;

import org.example.Country;

public class Cat {
    private String name;
    private int weight;

    private int numbCountry;

    public Cat(String name, int weight, int numbCountry) {
        this.name = name;
        this.weight = weight;
        this.numbCountry = numbCountry;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getNumbCountry() {
        return Country.getCountryById(numbCountry);
    }

    public void setNumbCountry(int numbCountry) {
        this.numbCountry = numbCountry;
    }

}
