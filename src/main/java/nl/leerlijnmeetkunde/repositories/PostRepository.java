package nl.leerlijnmeetkunde.repositories;

import nl.leerlijnmeetkunde.domain.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {
    Iterable<Post> findAllByOrderByDateDesc();
}