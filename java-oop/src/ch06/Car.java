package ch06;
import java.util.ArrayList; // 패캐지 밑에 import

public class Car {
	public int num;
	public boolean is;
	public String str;
	public ArrayList<String> list;
	
/*
 	이렇게 초기화할 수는 있지만 하지 않음
	public int num = 1;
	public boolean is = true;
	public String arr = null;
	public ArrayList<String> list = null;
*/
	
	// 생성자 -> 없으면 컴파일러 기계어로 변경할 때 기본 생성자 모양으로 자동 추가됨
	// 기본 생성자 -> 매개값 X
	// 생성자는 여러 개여도 됨

	public Car() {
		// 필드 초기화 코드도 자동으로 추가
		// 필드는 초기화의 규칙이 필요함
		this.num = 0;
		this.is = false;
		this.str = null;
		this.list = null;
	}

	
	// 생성자 오버로딩 -> 매개 변수가 다른 생성자를 여러 개 선언하는 것
	// 일반 생성자
	public Car(int num) { // 대부분 필드 이름과 똑같이 설정
		// 일반 생성자가 존재하므로 컴파일러가 기본 생성자 추가 X
		// 생성자 안에 필드 초기화 코드가 없음 -> 추가
		this.num = num; // 두 num은 서로 다름
	}
	
	public Car(boolean is) { 

		this.is = is; 
	}
	
	public Car(int num, boolean is) { 
		this.num = num;
		this.is = is; 
	}
	
	// 메서드 오버로딩 -> 매개값만 다르게 하는 것
	public void test() {}
	public void test(int x) {}
	
}
