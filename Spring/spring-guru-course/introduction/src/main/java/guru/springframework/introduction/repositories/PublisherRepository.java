package guru.springframework.introduction.repositories;

import guru.springframework.introduction.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}