package util;

import java.util.Scanner;

public class MyScanner {
	/* 1. 스캐너 변수 선언
	 * 2. 생성자
	 * 3. int형과 string의 입력범위를 제한 받는 스캐너 메소드
	 */

	private Scanner scanner;

	public MyScanner(Scanner scanner) {
		this.scanner = scanner;
	}
	
	
	//입력받은 int값이 min보다 작고, max보다 크면 -1을 반환하고, 아니면 입력받은 값을 반환.
	public int takeInt(int min, int max) {
		int num;
		
		try {
			num = Integer.parseInt(scanner.nextLine());
		} catch (Exception e) {
			return -1;
		}
		
		return num >= min && num <= max ? num : -1;
	}	
	
	//입력받은 String값을 리턴.
	public String takeStr() {
		String str;
		
		try {
			str = scanner.nextLine();
		} catch(Exception e) {
			return "";
		}
		
		return str;		
	}
	
	
	public void closeScanner() {
		scanner.close();
	}
	
	
	
}
