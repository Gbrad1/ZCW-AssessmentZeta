package com.zipcodewilmington.assessment1.part3;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by leon on 2/16/18.
 */
public class PetOwner {
    private ArrayList<Pet> listOfPets = new ArrayList<>();
    private String name;

    /**
     * @param name name of the owner of the Pet
     * @param pets array of Pet object
     */
    public PetOwner(String name, Pet... pets) {
        this.name = name;
        if (pets != null) {
            for (Pet petElement : pets) {
                this.listOfPets.add(petElement);
                petElement.setOwner(this);
            }
        }
    }

    /**
     * @param pet pet to be added to the composite collection of Pets
     */
    public void addPet(Pet pet) {
        pet.setOwner(this);
        listOfPets.add(pet);
    }

    /**
     * @param pet pet to be removed from the composite collection Pets
     */
    public void removePet(Pet pet) {
        listOfPets.remove(pet);
    }

    /**
     * @param pet pet to evaluate ownership of
     * @return true if I own this pet
     */
    public Boolean isOwnerOf(Pet pet) {
        if (listOfPets.contains(pet)) {
            return true;
        } else
            return false;
    }

    /**
     * @return the age of the Pet object whose age field is the lowest amongst all Pets in this class
     */
    public Integer getYoungetPetAge() {
        Integer youngestPet = listOfPets.get(0).getAge();
        for (int i = 0; i < listOfPets.size(); i++) {
            if (listOfPets.get(i).getAge() < youngestPet) {
                youngestPet = listOfPets.get(i).getAge();
            }
        }
        return youngestPet;
    }




    /**
     * @return the age of the Pet object whose age field is the highest amongst all Pets in this class
     */
    public Integer getOldestPetAge() {
        Integer oldestPet = listOfPets.get(0).getAge();
        for (int i = 0; i < listOfPets.size(); i++) {
            if (listOfPets.get(i).getAge() > oldestPet) {
                oldestPet = listOfPets.get(i).getAge();
            }
        }
        return oldestPet;
    }


    /**
     * @return the sum of ages of Pet objects stored in this class divided by the number of Pet object
     */
    public Float getAveragePetAge() {
        double sum = 0;
        for (int i = 0; i < listOfPets.size(); i++) {
            sum += listOfPets.get(i).getAge();
        }
        double averageAge = sum / listOfPets.size();

        return (float)averageAge;
    }

    /**d
     * @return the number of Pet objects stored in this class
     */
    public Integer getNumberOfPets() {
        return listOfPets.size();
    }

    /**
     * @return the name property of the Pet
     */
    public String getName() {
        return name;
    }

    /**
     * @return array representation of animals owned by this PetOwner
     */
    public Pet[] getPets() {
        if (listOfPets.size() == 0) {
            Pet[] newPets = new Pet[1];
            newPets[0] = null;
            return newPets;
        }

        Pet[] twoWayPettingZoo = new Pet[listOfPets.size()];
        for (int i = 0; i < twoWayPettingZoo.length; i++) {
            twoWayPettingZoo[i] = listOfPets.get(i);
        }
        return twoWayPettingZoo;
    }
}
