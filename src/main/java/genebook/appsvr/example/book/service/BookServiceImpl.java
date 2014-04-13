package genebook.appsvr.example.book.service;

import genebook.appsvr.example.book.dao.BookRepository;
import genebook.appsvr.example.domain.TBook;
import genebook.appsvr.example.dto.BookDTO;
import genebook.appsvr.example.util.CommonInput;
import genebook.appsvr.example.util.InputUtil;
import genebook.appsvr.example.util.OutputUtil;

import java.util.List;
import java.util.Map;

import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;

@WebService(endpointInterface = "genebook.appsvr.example.book.service.BookService", 
serviceName = "BookService")
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
		CommonInput<String> cip = InputUtil.getInputData(String.class, input);
		List<TBook> bookList = this.bookRepository.findAll();
		return OutputUtil.formatOutputData("1",
				"success", bookList, cip.getOutput());
	}
	
	@SuppressWarnings("rawtypes")
	@Override
	public String findOne(String input) {
		CommonInput<Map> cip = InputUtil.getInputData(Map.class, input);
		 TBook find =  this.bookRepository.findOne(cip.getData().get("id").toString());
		 return OutputUtil.formatOutputData("1", "success", find, "json");
	}
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
		CommonInput<BookDTO> cip = InputUtil.getInputData(BookDTO.class, input);

		BookDTO created = cip.getData();
		
		TBook book = new TBook();
		book.setCreateTime(created.getCreateTime());
		 book.setIsbn(created.getIsbn());
		 book.setName(created.getName());
		 book.setPrice(created.getPrice());
		 book.setState(created.getState());
		
		 book = bookRepository.save(book);
		 
		 return OutputUtil.formatOutputData("1", "success", book, "json");
		 
	}

	// CommonOutPut<TBook>
	@Override
	public String update(String input)
			throws BookNotFoundException {
		CommonInput<BookDTO> cip = InputUtil.getInputData(BookDTO.class, input);
		BookDTO updated = cip.getData();
		
		 TBook book = this.bookRepository.findOne(updated.getId());
		 if(book == null){
			 throw new BookNotFoundException();
		 }
		 book.setIsbn(updated.getIsbn());
		 book.setName(updated.getName());
		 book.setPrice(updated.getPrice());
		 book = this.bookRepository.saveAndFlush(book);
		 
		 return OutputUtil.formatOutputData("1", "success", TBook.class, "json");
	}


	// CommonOutPut
	@SuppressWarnings("rawtypes")
	@Override
	public String delete(String input)
			throws BookNotFoundException {
		CommonInput<Map> cip = InputUtil.getInputData(Map.class, input);
		
		 TBook deleted = this.bookRepository.findOne(cip.getData().get("id").toString());
		
		 if(deleted==null){
			 throw new BookNotFoundException();
		 }
		 this.bookRepository.delete(cip.getData().get("id").toString());
		 return OutputUtil.formatOutputData("1", "success",String.class, "json");
	}

}
