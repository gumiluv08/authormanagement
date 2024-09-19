package book;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import author.Author;
import editor.Editor;
import util.DataSource;

public class JdbcBookDao implements BookDao {

	@Override
	public boolean insert(Book book) {
		boolean result = false;
		
		try (Connection connection = DataSource.getDataSource();
				PreparedStatement pStatement 
				= connection.prepareStatement("INSERT INTO BOOK (TITLE, GENRE, RATE, AUTHOR_ID, EDITOR_ID) VALUES (?,?,?,?,?)")) {
		
			pStatement.setString(1, book.getTitle());
			pStatement.setString(2, book.getGenre());
			pStatement.setString(3, book.getRate());
			pStatement.setInt(4, book.getAuthor().getId());
			pStatement.setInt(5, book.getEditor().getId());
		
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
	public boolean update(Book book) {
		boolean result = false;
		
		try (Connection connection = DataSource.getDataSource();
				PreparedStatement pStatement 
				= connection.prepareStatement("UPDATE BOOK SET RATE = ? , EDITOR_ID = ? WHERE ID = ?")) {
			
			pStatement.setString(1, book.getRate());
			pStatement.setInt(2, book.getId());
			
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
				PreparedStatement pStatement 
				= connection.prepareStatement("DELETE BOOK WHERE ID = ?")) {
			
			pStatement.setInt(1,id);
			
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
	public List<Book> selectAll() {
		List<Book> books = new ArrayList<Book>();
		
		try (Connection connection = DataSource.getDataSource();
				PreparedStatement pStatement 
				= connection.prepareStatement("SELECT * FROM BOOK ORDER BY AUTHOR_ID");
				ResultSet rs = pStatement.executeQuery()) {
			
			while(rs.next()) {
				Author author = new Author(rs.getInt("ID"));
				Editor editor = new Editor(rs.getInt("ID"));
				Book book = new Book();
				
				book.setId(rs.getInt("ID"));
				book.setTitle(rs.getString("TITLE"));
				book.setGenre(rs.getString(""));
				book.setRate(rs.getString(0));
				book.setAuthor(author);
				book.setEditor(editor);
				
				books.add(book);
				
			}
			
		} catch (SQLException e) {
						
			e.printStackTrace();
		}
		
		return books;
	}

}
