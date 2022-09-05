package adi.art.sfgpetclinic.services;

import adi.art.sfgpetclinic.model.Owner;
import adi.art.sfgpetclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
