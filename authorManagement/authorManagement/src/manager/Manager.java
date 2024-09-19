package manager;

public class Manager {
	/* 1. 컬럼들을 변수로 선언
	 * 2. 생성자(디폴트, idx만 포함된 것, id만 포함된 것 , 변수 전부 포함된 것)\
	 * 3. set&get 메소드
	 * 4. toString 메소드
	 */
	
	//1. 컬럼들을 변수로 선언
	private int idx;
	private String id;
	private String password;
	private String name;
	private String Email;
	
	
	//2. 생성자(디폴트, idx만 포함된 것, id만 포함된 것, 변수 전부 포함된 것)
	public Manager() {
		// TODO Auto-generated constructor stub
	}

	public Manager(int idx) {
		super();
		this.idx = idx;
	}

	public Manager(String id) {
		super();
		this.id = id;
	}

	public Manager(int idx, String id, String password, String name, String email) {
		super();
		this.idx = idx;
		this.id = id;
		this.password = password;
		this.name = name;
		Email = email;
	}

	

	//3. set&get 메소드
	public int getIdx() {
		return idx;
	}

	public void setIdx(int idx) {
		this.idx = idx;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	
	// 4. toString 메소드
	@Override
	public String toString() {
		return "Manager [idx=" + idx + ", id=" + id + ", password=" + password + ", name=" + name + ", phoneNumber="
				+ ", Email=" + Email + "]";
	}
	
	
	
	
	
	
	
	
}
