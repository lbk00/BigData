package bigdatasystem.demo.repository;
import bigdatasystem.demo.dto.Art;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ArtRepository extends MongoRepository<Art, String> {

}

