package author;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import manager.Manager;
import util.DataSource;

public class JdbcAuthorDao implements AuthorDao {

	@Override
	public boolean insert(Author author) {
		boolean result = false;
		
		try (Connection connection = DataSource.getDataSource();
				PreparedStatement pStatement 
				= connection.prepareStatement(
						"INSERT INTO AUTHOR (ID, NAME, PEN_NAME, EMAIL, MANAGER_IDX) VALUES (?, ?, ?, ?, ?)"
						)) {
			
			pStatement.setInt(1, author.getId());
			pStatement.setString(2, author.getName());
			pStatement.setString(3, author.getPenName());
			pStatement.setString(4, author.getEmail());
			pStatement.setInt(5, author.getManager().getIdx());
			
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
	public boolean update(Author author) {
		boolean result = false;
		
		try (Connection connection = DataSource.getDataSource();
				PreparedStatement pStatement 
				= connection.prepareStatement("UPDATE AUTHOR SET MANAGER_IDX = ? WHERE ID = ?")) {
			
			pStatement.setInt(1, author.getManager().getIdx());
			pStatement.setInt(2, author.getId());
			
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
	public boolean deleteById(int id) {
		boolean result = false;
		
		try (Connection connection = DataSource.getDataSource();
				PreparedStatement pStatement 
				= connection.prepareStatement("DELETE FROM AUTHOR WHERE ID = ?")) {
			
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
	public List<Author> selectAll() {
		List<Author> authors = new ArrayList<Author>();
		
		try (Connection connection = DataSource.getDataSource();
				PreparedStatement pStatement 
				= connection.prepareStatement("SELECT * FROM AUTHOR ORDER BY ID ASC");
				ResultSet rs = pStatement.executeQuery()) {
			
			while(rs.next()) {
				Manager manager = new Manager(rs.getInt("MANAGER_IDX"));
				Author author = new Author();
			
				author.setId(rs.getInt("ID"));
				author.setName(rs.getString("NAME"));
				author.setPenName(rs.getString("PEN_NAME"));
				author.setEmail(rs.getString("EMAIL"));
				author.setManager(manager);
				
				authors.add(author);	
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return authors;
	}	

}
