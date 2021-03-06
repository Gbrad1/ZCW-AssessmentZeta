package com.zipcodewilmington.assessment1.part3;

/**
 * Created by leon on 2/16/18.
 */
public class Dog extends Pet {
    String name;
    Integer age;
    PetOwner owner;
    /**
     * @param name name of this Dog
     * @param age age of this dog
     */
    public Dog(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    /**
     * @param age age of this dog
     */
    public Dog(Integer age) {
        this.age = age;
        this.name = "Dog name";
    }

    /**
     * @param name name of this dog
     */
    public Dog(String name) {
        this.name = name;
        this.age = 0;
    }

    /**
     * nullary constructor
     * by default, a dog's
     * name is DogName
     * age is 0
     */
    public Dog() {
        name = "Dog name";
        age = 0;
    }

    /**
     * @return bark as a string
     */
    public String speak() {
        return "Bark";
    }

    public void setName(String newValue) {
        this.name = newValue;
    }

    public void setAge(Integer newValue) {
        this.age = newValue;
    }

    public Integer getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setPetOwner(PetOwner newPetOwner) {
        this.owner = newPetOwner;
    }

    /*public PetOwner getOwner() {
        return petOwner;
    }*/
}
