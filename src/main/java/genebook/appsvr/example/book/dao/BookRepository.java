package genebook.appsvr.example.book.dao;

import genebook.appsvr.example.domain.TBook;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<TBook,String>{
			
}
