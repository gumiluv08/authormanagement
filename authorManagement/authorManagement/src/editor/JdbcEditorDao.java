package editor;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import util.DataSource;

public class JdbcEditorDao implements EditorDao {

	@Override
	public boolean insert(Editor editor) {
		boolean result = false;
		
		try (Connection connection = DataSource.getDataSource();
				PreparedStatement pStatement 
				= connection.prepareStatement(
						"INSERT INTO EDITOR (ID, NAME, EMAIL) "
						+ "VALUES (?, ?, ?)")) {
			
			pStatement.setInt(1, editor.getId());
			pStatement.setString(2, editor.getName());
			pStatement.setString(3, editor.getEmail());
			
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
	public boolean update(Editor editor) {
		boolean result = false;
		
		try (Connection connection = DataSource.getDataSource();
				PreparedStatement pStatement 
				= connection.prepareStatement("UPDATE EDITOR SET EMAIL = ? WHERE ID = ?")) {
			

			pStatement.setString(1, editor.getEmail());
			pStatement.setInt(2, editor.getId());
			
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
		
		try (Connection connection 
				= DataSource.getDataSource();
				PreparedStatement pStatement 
				= connection.prepareStatement("DELETE FROM EDITOR WHERE ID = ?")) {
			
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
	public List<Editor> selectAll() {
		List<Editor> editors = new ArrayList<Editor>();
		
		try (Connection connection = DataSource.getDataSource();
				PreparedStatement pStatement 
				= connection.prepareStatement("SELECT * FROM EDITOR");
				ResultSet rs = pStatement.executeQuery()) {
			
			while(rs.next()) {
				Editor editor = new Editor(
						rs.getInt("ID"),
						rs.getString("NAME"),
						rs.getString("Email")
						);
				
				editors.add(editor);
				
				
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return editors;
	}

}
