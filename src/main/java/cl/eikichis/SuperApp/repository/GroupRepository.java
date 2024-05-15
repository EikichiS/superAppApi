package cl.eikichis.SuperApp.repository;

import cl.eikichis.SuperApp.models.Group;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface GroupRepository extends MongoRepository<Group,String> {
}
