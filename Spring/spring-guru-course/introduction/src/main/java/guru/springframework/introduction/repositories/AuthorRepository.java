package guru.springframework.introduction.repositories;

import guru.springframework.introduction.domain.Author;
import org.springframework.data.repository.CrudRepository;


public interface AuthorRepository extends CrudRepository<Author, Long> {
}
