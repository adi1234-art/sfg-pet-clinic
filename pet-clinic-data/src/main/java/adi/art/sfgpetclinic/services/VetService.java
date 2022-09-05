package adi.art.sfgpetclinic.services;

import adi.art.sfgpetclinic.model.Owner;
import adi.art.sfgpetclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
