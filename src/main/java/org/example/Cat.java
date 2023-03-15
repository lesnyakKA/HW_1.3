package org.example;

import org.example.Country;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return weight == cat.weight && numbCountry == cat.numbCountry && Objects.equals(name, cat.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, weight, numbCountry);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", numbCountry=" + numbCountry +
                '}';
    }
}
