package adi.art.sfgpetclinic.services.map;

import adi.art.sfgpetclinic.model.Vet;
import adi.art.sfgpetclinic.services.CrudService;

import java.util.Set;

public class VetServiceMap extends AbstractMapService<Vet,Long> implements CrudService<Vet,Long> {
    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void deleteById(Long ID) {
        super.deleteById(ID);
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }
}
