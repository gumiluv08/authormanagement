package editor;

import java.util.List;

public interface EditorDao {

	boolean insert(Editor editor);
	
	boolean update(Editor editor);
	
	boolean deleteById(int id);
	
	List<Editor> selectAll();
	
	
}
