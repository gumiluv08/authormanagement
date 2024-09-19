package careHistory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import util.DataSource;

public class JdbcCareHistoryDao implements CareHistoryDao {

	@Override
	public boolean insert(CareHistory careHistory) {
		boolean result = false;
		
		try (Connection connection = DataSource.getDataSource();
				PreparedStatement pStatement = connection.prepareStatement("")) {
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}

	@Override
	public List<CareHistory> selectAll() {
		
		List<CareHistory> careHistories = new ArrayList<CareHistory>();
		
		try (Connection connection = DataSource.getDataSource();
				PreparedStatement pStatement = connection.prepareStatement("")) {
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return careHistories;
	}

	@Override
	public List<CareHistory> selectByAuthorId(int id) {
		List<CareHistory> careHistories = new ArrayList<CareHistory>();
		
		try (Connection connection = DataSource.getDataSource();
				PreparedStatement pStatement = connection.prepareStatement("")) {
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return careHistories;
	}

	
	@Override
	public List<CareHistory> selectByCareId(int id) {
		List<CareHistory> careHistories = new ArrayList<CareHistory>();
		
		try (Connection connection = DataSource.getDataSource();
				PreparedStatement pStatement = connection.prepareStatement("")) {
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return careHistories;
	}

}
