package sfg1.sfg1.repositories;

import org.springframework.data.repository.CrudRepository;

import sfg1.sfg1.domain.Book;

public interface BookRepository extends CrudRepository<Book,Long>{

}
