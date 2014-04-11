package genebook.websvr.example.book.service;

import genebook.websvr.example.book.dao.BookRepository;
import genebook.websvr.example.domain.TBook;
import genebook.websvr.example.util.CommonInput;
import genebook.websvr.example.util.RequestInput;
import genebook.websvr.example.util.ResponseOutPut;

import java.util.List;

import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;

@WebService(endpointInterface = "genebook.websvr.example.book.service.BookService", 
serviceName = "BookServiceImpl")
public class BookServiceImpl implements BookService {

	 @Autowired
	 private BookRepository bookRepository;

//	 
//	public TBook add(BookDTO bookDTO) {
//
//		 TBook book = new TBook();
//		 book.setId(bookDTO.getId());
//		 book.setCreateTime(bookDTO.getCreateTime());
//		 book.setIsbn(bookDTO.getIsbn());
//		 book.setName(bookDTO.getName());
//		 book.setPrice(bookDTO.getPrice());
//		 book.setState(bookDTO.getState());
//		
//		 return bookRepository.save(book);
//
//		return null;
//	}
//
//	public TBook delete(String id) throws BookNotFoundException {
//		// TBook deleted = this.bookRepository.findOne(id);
//		//
//		// if(deleted==null){
//		// throw new BookNotFoundException();
//		// }
//		// this.bookRepository.delete(id);
//		// return deleted;
//		return null;
//	}
//
//	protected void setBookRepository(BookRepository bookRepository) {
//		// this.bookRepository = bookRepository;
//	}
//
	// List<TBook>
	@Override
	public String findAll(String input) {
		RequestInput<String> rip = new RequestInput<String>();
		CommonInput<String> cip = rip.getInput(String.class, input);
		List<TBook> bookList = this.bookRepository.findAll();
		ResponseOutPut<List<TBook>> rop = new ResponseOutPut<List<TBook>>("1",
				"success", bookList, cip.getOutput());
		return rop.response();
	}
//
//	public TBook findOne(String id) {
//
//		// return this.bookRepository.findOne(id);
//		return null;
//	}
//
//	@Transactional(rollbackFor = BookNotFoundException.class)
//	public TBook update(BookDTO bookDTO) throws BookNotFoundException {
//		// TBook book = this.bookRepository.findOne(bookDTO.getId());
//		// if(book == null){
//		// throw new BookNotFoundException();
//		// }
//		// book.setIsbn(bookDTO.getIsbn());
//		// book.setName(bookDTO.getName());
//		// book.setPrice(bookDTO.getPrice());
//		// this.bookRepository.saveAndFlush(book);
//		// return book;
//
//		return null;
//	}

	 //CommonInput<BookDTO>
	@Override
	public String add(String input) {
		
		
//		 TBook book = new TBook();
//		 BookDTO created = input.getData();
//		 book.setCreateTime(created.getCreateTime());
//		 book.setIsbn(created.getIsbn());
//		 book.setName(created.getName());
//		 book.setPrice(created.getPrice());
//		 book.setState(created.getState());
//		
//		 book = bookRepository.save(book);
//		 ResponseOutPut<TBook> rsp = new
//		 ResponseOutPut("1","success",book,input.getOutput());
//		 return rsp.response();
		return null;
	}

	// CommonOutPut<TBook>
	@Override
	public String update(String input)
			throws BookNotFoundException {

		return null;
	}

	// CommonOutPut<TBook>
	@Override
	public String findOne(String input) {
		return null;
	}

	// CommonOutPut
	@Override
	public String delete(String input)
			throws BookNotFoundException {
		
		return null;
	}

}
