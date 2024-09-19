package main;

import java.util.ArrayList;
import java.util.List;

import care.Care;
import care.CareDao;
import care.JdbcCareDao;

public class MainTest {
	public static void main(String[] args) {
		/*
		ManagerDao managerDao = new JdbcManagerDao();
		Manager manager = new Manager();
		List<Manager> managerList = new ArrayList<Manager>();
		*/
		/*
		manager.setId("B1");
		manager.setPassword("1111");
		manager.setName("Bob Smith");
		manager.setEmail("bob01@email.com");
		/*
		if(managerDao.deleteByIdx(10)) {
			System.out.println("삭제 완료.");
		}else {
			System.out.println("삭제 실패.");
		}
		*/
		/*
	
		if(managerDao.insert(manager)) {
			System.out.println("입력 완료");
		}else {
			System.out.println("입력 실패");
		}
		
		*/
		/*
		if(managerDao.updatePw(manager)) {
			System.out.println("수정 완료");
		}else {
			System.out.println("수정 실패");
		}
		
		*/
		/*
		for(Manager managers : managerDao.selectAll()) {
			System.out.println(managers);
		}
		*/
		/*
		AuthorDao authorDao = new JdbcAuthorDao();
		Author author = new Author();
		List<Author> authorList = new ArrayList<Author>();
		//Manager manager = new Manager();
		*/
		/*
		manager.setIdx(1);
		author.setId(2222);
		author.setName("bob");
		author.setPenName("B");
		author.setEmail("Bob1953@email.com");
		author.setManager(manager);
		*/
		
		/*
		if(authorDao.insert(author)) {
			System.out.println("추가 완료.");
		}else {
			System.out.println("추가 실패.");
		}
		*/
		/*
		manager.setIdx(1);
		author.setManager(manager);
		author.setId(2222);
		
		
		if(authorDao.update(author)) {
			System.out.println("업데이트 완료.");
		}else {
			System.out.println("업데이트 실패.");
		}
		*/
		
		/*
		if(authorDao.deleteById(2222)) {
			System.out.println("삭제 완료.");
		}else {
			System.out.println("삭제 실패.");
		}*/
		
		/*
		for(Author authors : authorDao.selectAll()) {
			System.out.println(authors);
		}*/
		/*
		EditorDao editorDao = new JdbcEditorDao();
		
		
		
		editor.setId(3);
		editor.setName("Edan");
		editor.setEmail("edan09@email.com");
		
		if(editorDao.insert(editor)) {
			System.out.println("완료.");
		}else {
			System.out.println("실패.");
		}
		
		
		
		editor.setEmail("edan08@email.com");
		editor.setId(3);
		if(editorDao.update(editor)) {
			System.out.println("완료.");
		}else {
			System.out.println("실패.");
		}
		
		
		
		if(editorDao.deleteById(2)) {
			System.out.println("완료.");
		}else {
			System.out.println("실패.");
		}
	
		
		
		for(Editor editors : editorDao.selectAll()) {
			System.out.println(editors);
		}
		*/
		
		/*
		BookDao bookdDao = new JdbcBookDao();
		Book book = new Book();
		List<Book> bookList = new ArrayList<Book>();
		
		Author author = new Author();
		author.setId(1);
		Editor editor = new Editor();
		editor.setId(1);
		
		book.getId();
		book.setTitle("Pride and Prejudes");
		book.setGenre("Romantic Comedy");
		book.setRate("All");
		book.setAuthor(author);
		book.setEditor(editor);
		
		if(bookdDao.insert(book)) {
			System.out.println("완료.");
		}else {
			System.out.println("실패.");
		}
		
		
		
		book.setRate("r-15");
		if(bookdDao.update(book)) {
			System.out.println("완료.");
		}else {
			System.out.println("실패.");
		}
		
		
		
		if(bookdDao.deleteById(2)) {
			System.out.println("완료.");
		}else {
			System.out.println("실패.");
		}
		*/
		
	
		CareDao careDao = new JdbcCareDao();
		Care care = new Care();
		List<Care> careList = new ArrayList<Care>();
		
		care.setId(01);
		care.setCategory("선인세 지급");
		care.setCost(1000000);
		/**/
		if(careDao.insert(care)) {
			System.out.println("완료.");
		}else {
			System.out.println("실패.");
		}
		
		
		if(careDao.deleteById(01)) {
			System.out.println("완료.");
		}else {
			System.out.println("실패.");
		}
	
	
	}	
	
}