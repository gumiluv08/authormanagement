package careHistory;

import java.sql.Date;

import author.Author;
import care.Care;

public class CareHistory {
	/* 1. 컬럼들을 변수로 선언
	 * 2. 생성자(디폴트,id만 포함된 것 , 변수 전부 포함된 것)
	 * 3. set&get 메소드
	 * 4. toString 메소드
	 */
	
	//1. 컬럼들을 변수로 선언
	private int idx;
	private Date date;
	private Care careId;
	private Author authorId;
	
	//2. 생성자(디폴트,id만 포함된 것 , 변수 전부 포함된 것)
	public CareHistory() {
		// TODO Auto-generated constructor stub
	}

	public CareHistory(int idx) {
		super();
		this.idx = idx;
	}

	public CareHistory(int idx, Date date, Care careId, Author authorId) {
		super();
		this.idx = idx;
		this.date = date;
		this.careId = careId;
		this.authorId = authorId;
	}

	
	//3. set&get 메소드
	public int getIdx() {
		return idx;
	}

	public void setIdx(int idx) {
		this.idx = idx;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Care getCareId() {
		return careId;
	}

	public void setCareId(Care careId) {
		this.careId = careId;
	}

	public Author getAuthorId() {
		return authorId;
	}

	public void setAuthorId(Author authorId) {
		this.authorId = authorId;
	}

	
	//4. toString 메소드
	@Override
	public String toString() {
		return "CareHistory [idx=" + idx + ", date=" + date + ", careId=" + careId + ", authorId=" + authorId + "]";
	}
	
	
	
	
}
