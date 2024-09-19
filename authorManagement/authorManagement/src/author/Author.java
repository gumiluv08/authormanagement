package author;

import manager.Manager;

public class Author {
	/* 1. 컬럼들을 변수로 선언
	 * 2. 생성자(디폴트,id만 포함된 것 , 변수 전부 포함된 것)
	 * 3. set&get 메소드
	 * 4. toString 메소드
	 */
	
	//1. 컬럼들을 변수로 선언
	private int id;
	private String name;
	private String penName;
	private String email;
	private Manager manager;
	
	
	
	//2. 생성자(디폴트,id만 포함된 것 , 변수 전부 포함된 것)
	public Author() {
		// TODO Auto-generated constructor stub
	}

	public Author(int id) {
		super();
		this.id = id;
	}

	public Author(int id, String name, String penName, String email, Manager manager) {
		super();
		this.id = id;
		this.name = name;
		this.penName = penName;
		this.email = email;
		this.manager = manager;
	}

	
	
	//3. set&get 메소드
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Manager getManager() {
		return manager;
	}

	public void setManager(Manager manager) {
		this.manager = manager;
	}

	
	public String getPenName() {
		return penName;
	}

	public void setPenName(String penName) {
		this.penName = penName;
	}

	
	//4. toString 메소드
	@Override
	public String toString() {
		return "Author [id=" + id + ", name=" + name + ", penName=" + penName + ", phoneNumber="
				+ ", email=" + email + ", manager=" + manager + "]";
	}

	

	
	
	
	
	
	
	
	
	
}
