package cl.eikichis.SuperApp.repository;

import cl.eikichis.SuperApp.models.Activity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ActivityRepository extends MongoRepository<Activity,String> {
}
