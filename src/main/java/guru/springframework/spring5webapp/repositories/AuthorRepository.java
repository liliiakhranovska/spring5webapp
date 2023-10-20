package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.domain.Author;
import org.springframework.data.repository.CrudRepository;


// We are providing an interface
// Spring is going to provide implementation for it
public interface AuthorRepository extends CrudRepository<Author, Long> {
}
