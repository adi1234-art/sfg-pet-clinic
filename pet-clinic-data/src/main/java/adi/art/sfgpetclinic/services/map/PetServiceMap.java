package adi.art.sfgpetclinic.services.map;

import adi.art.sfgpetclinic.model.Owner;
import adi.art.sfgpetclinic.model.Pet;
import adi.art.sfgpetclinic.services.CrudService;

import java.util.Set;

public class PetServiceMap extends AbstractMapService<Pet,Long> implements CrudService<Pet,Long> {
    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void deleteById(Long ID) {
        super.deleteById(ID);
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }
}
