package manager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import util.DataSource;

public class JdbcManagerDao implements ManagerDao {

	@Override
	public boolean insert(Manager manager) {
		boolean result = false;

		try (Connection connection = DataSource.getDataSource();
				PreparedStatement pStatement = connection.prepareStatement(
						"INSERT INTO MANAGER (ID, PASSWORD, NAME, EMAIL) VALUES (?,?,?,?)")) {

			pStatement.setString(1, manager.getId());
			pStatement.setString(2, manager.getPassword());
			pStatement.setString(3, manager.getName());
			pStatement.setString(4, manager.getEmail());

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
	public boolean updatePw(Manager manager) {
		boolean result = false;
		try (Connection connection = DataSource.getDataSource();
				PreparedStatement pStatement = connection
						.prepareStatement("UPDATE MANAGER SET PASSWORD = ? WHERE IDX = ?")) {

			pStatement.setString(1, manager.getPassword());
			pStatement.setInt(2, manager.getIdx());

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
	public boolean deleteByIdx(int idx) {
		boolean result = false;
		try (Connection connection = DataSource.getDataSource();
				PreparedStatement pStatement 
				= connection.prepareStatement("DELETE FROM MANAGER WHERE IDX = ?")) {
			
			pStatement.setInt(1, idx);
			
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
	public List<Manager> selectAll() {

		List<Manager> managers = new ArrayList<Manager>();

		try (Connection connection = DataSource.getDataSource();
				PreparedStatement pStatement 
				= connection.prepareStatement("SELECT * FROM MANAGER ORDER BY IDX");
				ResultSet rs = pStatement.executeQuery()) {
				
			while(rs.next()) {
				Manager manager = new Manager(
						rs.getInt("IDX"),
						rs.getString("ID"),
						rs.getString("PASSWORD"),
						rs.getString("NAME"),
						rs.getString("EMAIL")
						);
				
				managers.add(manager);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return managers;
	}

}
