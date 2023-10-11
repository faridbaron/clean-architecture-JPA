package co.com.crudanimal.jpa;

import co.com.crudanimal.model.animal.Animal;
import co.com.crudanimal.model.animal.gateways.AnimalRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
@AllArgsConstructor
public class JpaAnimalImpl implements AnimalRepository {

    private JPARepositoryAdapter jpaRepositoryAdapter;
    @Override
    public List<Animal> getAll() {
        return jpaRepositoryAdapter.findAll();
    }
    @Override
    public void create(Animal animal) {
        jpaRepositoryAdapter.save(animal);
    }
    @Override
    public Animal read(String name) {return jpaRepositoryAdapter.findById(name);}

    @Override
    public Animal update(String name, Animal animal) throws Exception {
        Animal animalDb = jpaRepositoryAdapter.findById(name);

        if (animalDb == null) throw new Exception("Animal Not Found : " + name);

        animalDb.setGender(animal.getGender());
        animalDb.setLegs(animal.getLegs());
        animalDb.setSpecies(animal.getSpecies());
        animalDb.setHabitat(animal.getHabitat());
        animalDb.setDomestic(animal.getDomestic());

        jpaRepositoryAdapter.save(animalDb);
        return animalDb;
    }

    @Override
    public void delete(String name) {
        jpaRepositoryAdapter.deleteById(name);
    }


}

