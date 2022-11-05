package guru.springframework.introduction.repositories;

import guru.springframework.introduction.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
