package sv.edu.udb.repository;

import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;
import sv.edu.udb.entity.Post;

public interface PostRepository extends CrudRepository<Post, Long>{
}
