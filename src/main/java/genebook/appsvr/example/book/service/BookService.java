package genebook.appsvr.example.book.service;



import javax.jws.WebService;

@WebService
public interface BookService {
	
	
	/**
	 * 
	 * @return data:List<TBook>
	 */
	public String  findAll(String input);
	
	/**
	 * 
	 * @param data:BookDTO
	 * @return data:TBook
	 */
	public String add(String input);
	
	/**
	 * 
	 * @param data:BookDTO
	 * @return data:TBook
	 * @throws BookNotFoundException
	 */
	public String update(String input) throws BookNotFoundException;
	
	/**
	 * 
	 * @param data:id
	 * @return data:TBook
	 */
	public String findOne(String input);
	
	/**
	 * 
	 * @param data:id
	 * @return 
	 * @throws BookNotFoundException
	 */
	public String delete(String input)throws BookNotFoundException;
	

}
