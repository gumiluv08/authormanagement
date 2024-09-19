package author;

import java.util.List;

public interface AuthorDao {

	boolean insert(Author author);
	
	boolean update(Author author);

	boolean deleteById(int id);
	
	List<Author> selectAll();
	


}
