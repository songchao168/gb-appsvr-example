//package genebook.appsvr.example.book.service;
//
//import static junit.framework.Assert.assertEquals;
//import static org.mockito.Matchers.any;
//import static org.mockito.Mockito.mock;
//import static org.mockito.Mockito.times;
//import static org.mockito.Mockito.verify;
//import static org.mockito.Mockito.verifyNoMoreInteractions;
//import static org.mockito.Mockito.when;
//import genebook.appsvr.example.book.dao.BookRepository;
//import genebook.appsvr.example.domain.TBook;
//import genebook.appsvr.example.dto.BookDTO;
//
//import java.math.BigDecimal;
//import java.sql.Timestamp;
//
//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;
//import org.mockito.ArgumentCaptor;
//
//public class BookServiceImplTest {
//
//	private BookRepository bookRepository;
//	
//	private BookServiceImpl333 bookService;
//	
////	@BeforeClass
////	public static void setUpBeforeClass() throws Exception {
////		
////	}
////
////	@AfterClass
////	public static void tearDownAfterClass() throws Exception {
////	}
//
//	@Before
//	public void setUp() throws Exception {
//		bookService = new BookServiceImpl333();
//
//		bookRepository = mock(BookRepository.class);
//		bookService.setBookRepository(bookRepository);
//		
//	}
//
//	@After
//	public void tearDown() throws Exception {
//	}
//
//	@Test
//	public void testSearch() {
////		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testAdd() {
//		BookDTO created = newBookDTO();
//		TBook persisted = newBook();
//        
//        when(bookRepository.save(any(TBook.class))).thenReturn(persisted);
//        
//        TBook returned = bookService.add(created);
//
//        ArgumentCaptor<TBook> bookArgument = ArgumentCaptor.forClass(TBook.class);
//        verify(bookRepository, times(1)).save(bookArgument.capture());
//        verifyNoMoreInteractions(bookRepository);
//        System.out.println(returned.getId());
////        assertPerson(created, bookArgument.getValue());
//        assertEquals(persisted, returned);
//		
////		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testUpdate() {
////		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testFind() {
////		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testDelete() {
////		fail("Not yet implemented");
//	}
//	
//	private TBook newBook(){
//		TBook bt = new TBook();
//		bt.setCreateTime(new Timestamp(System.currentTimeMillis()));
//		bt.setIsbn("123");
//		bt.setName("Spring");
//		bt.setPrice(new BigDecimal("11.2"));
//		return bt;
//	}
//	
//	private BookDTO newBookDTO(){
//		BookDTO bt = new BookDTO();
//		bt.setCreateTime(new Timestamp(System.currentTimeMillis()));
//		bt.setIsbn("123");
//		bt.setName("Spring");
//		bt.setPrice(new BigDecimal("11.2"));
//		return bt;
//	}
//
//}
