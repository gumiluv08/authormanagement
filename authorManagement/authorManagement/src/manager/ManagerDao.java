package manager;

import java.util.List;

public interface ManagerDao {

	boolean insert(Manager manager);
	
	boolean updatePw(Manager manager);
	
	boolean deleteByIdx(int idx);
	
	List<Manager> selectAll();
	
	
	
	
}
