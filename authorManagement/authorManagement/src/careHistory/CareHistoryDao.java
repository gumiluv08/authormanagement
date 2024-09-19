package careHistory;

import java.util.List;

public interface CareHistoryDao {

	boolean insert(CareHistory careHistory);
	
	List<CareHistory> selectAll();
	
	List<CareHistory> selectByAuthorId(int id);
	
	List<CareHistory> selectByCareId(int id);
	
}
