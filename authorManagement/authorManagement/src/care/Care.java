package care;

public class Care {
	/* 1. 컬럼들을 변수로 선언
	 * 2. 생성자(디폴트,id만 포함된 것 , 변수 전부 포함된 것)
	 * 3. set&get 메소드
	 * 4. toString 메소드
	 */
	
	//1. 컬럼들을 변수로 선언
	private int id;
	private String category;
	private int cost;
	
	
	// 2. 생성자(디폴트,id만 포함된 것 , 변수 전부 포함된 것)
	public Care() {
		// TODO Auto-generated constructor stub
	}

	public Care(int id) {
		super();
		this.id = id;
	}

	public Care(int id, String category, int cost) {
		super();
		this.id = id;
		this.category = category;
		this.cost = cost;
	}


	//3. set&get 메소드
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}


	//4. toString 메소드
	@Override
	public String toString() {
		return "Care [id=" + id + ", category=" + category + ", cost=" + cost + "]";
	}
	
	
	
	
	
	
	
}
