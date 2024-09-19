package book;

import java.util.List;

public interface BookDao {

	boolean insert(Book book);
	boolean update(Book book);
	boolean deleteById(int id);
	
	List<Book> selectAll();
	
}
