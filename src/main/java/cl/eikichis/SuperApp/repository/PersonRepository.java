package cl.eikichis.SuperApp.repository;

import cl.eikichis.SuperApp.models.Person;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PersonRepository extends MongoRepository<Person,String> {
}
