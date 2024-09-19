package care;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import util.DataSource;

public class JdbcCareDao implements CareDao {

	@Override
	public boolean insert(Care care) {
		boolean result = false;
		
		try (Connection connection = DataSource.getDataSource();
				PreparedStatement pStatement = connection.prepareStatement("INSERT INTO AUTHOR_CARE (ID,CATEGORY,COST) VALUES (?,?,?)")) {
			
			pStatement.setInt(1, care.getId());
			pStatement.setString(2, care.getCategory());
			pStatement.setInt(3, care.getCost() );
			
			int rows = pStatement.executeUpdate();

			if (rows > 0) {
				result = true;
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return result;
	}

	@Override
	public boolean deleteById(int id) {
		boolean result = false;
		
		try (Connection connection = DataSource.getDataSource();
				PreparedStatement pStatement = connection.prepareStatement("DELETE AUTHOR_CARE WHERE ID = ?")) {
			
			pStatement.setInt(1, id);
			
			int rows = pStatement.executeUpdate();

			if (rows > 0) {
				result = true;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}

	@Override
	public List<Care> selectAll() {
		
		List<Care> cares = new ArrayList<Care>();
		
		try (Connection connection = DataSource.getDataSource();
				PreparedStatement pStatement = connection.prepareStatement("SELECT*FROM AUTHOR_CARE ORDER BY ID");
				ResultSet rs = pStatement.executeQuery()) {
			
			while(rs.next()) {
				Care care = new Care();
				
				care.setId(rs.getInt("ID"));
				care.setCategory(rs.getString("CATEGORY"));
				care.setCost(rs.getInt("COST"));
				
				cares.add(care);
				
			}

			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return cares;
	}

}
