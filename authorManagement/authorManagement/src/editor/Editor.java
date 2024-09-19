package editor;

public class Editor {
	/* 1. 컬럼들을 변수로 선언
	 * 2. 생성자(디폴트,id만 포함된 것 , 변수 전부 포함된 것)
	 * 3. set&get 메소드
	 * 4. toString 메소드
	 */
	
	
	//1. 컬럼들을 변수로 선언
	private int id;
	private String name;
	private String email;
	
	
	//2. 생성자(디폴트,id만 포함된 것 , 변수 전부 포함된 것)
	public Editor() {
		// TODO Auto-generated constructor stub
	}

	public Editor(int id) {
		super();
		this.id = id;
	}

	public Editor(int id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
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

	
	//4. toString 메소드
	@Override
	public String toString() {
		return "Editor [id=" + id + ", name=" + name + ", email=" + email + "]";
	}
	
	
	
	
	
	
	
}
