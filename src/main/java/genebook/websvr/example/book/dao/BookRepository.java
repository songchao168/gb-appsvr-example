package genebook.websvr.example.book.dao;

import genebook.websvr.example.domain.TBook;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<TBook,String>{

}
