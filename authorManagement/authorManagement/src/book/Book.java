package book;

import author.Author;
import editor.Editor;

public class Book {
	/* 1. 컬럼들을 변수로 선언
	 * 2. 생성자(디폴트,id만 포함된 것 , 변수 전부 포함된 것)
	 * 3. set&get 메소드
	 * 4. toString 메소드
	 */
	
	
	//1. 컬럼들을 변수로 선언
	private int Id;
	private String title;
	private String genre;
	private String rate;
	private Author author;
	private Editor editor;
	
	
	//2. 생성자(디폴트,id만 포함된 것 , 변수 전부 포함된 것)
	public Book() {
		// TODO Auto-generated constructor stub
	}

	public Book(int id) {
		super();
		Id = id;
	}

	public Book(int id, String title, String genre, String rate, Author author, Editor editor) {
		super();
		Id = id;
		this.title = title;
		this.genre = genre;
		this.rate = rate;
		this.author = author;
		this.editor = editor;
	}

	
	
	//3. set&get 메소드
	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getRate() {
		return rate;
	}

	public void setRate(String rate) {
		this.rate = rate;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public Editor getEditor() {
		return editor;
	}

	public void setEditor(Editor editor) {
		this.editor = editor;
	}

	
	//4. toString 메소드
	@Override
	public String toString() {
		return "Book [Id=" + Id + ", title=" + title + ", genre=" + genre + ", rate=" + rate + ", author=" + author
				+ ", editor=" + editor + "]";
	}
	
	
	
	
	
	
	
}
