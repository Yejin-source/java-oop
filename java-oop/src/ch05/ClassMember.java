package ch05;

public class ClassMember {
	// 1. static : ClassMember와 무관하고 공간과 이름만을 빌려 쓰는 요소들
	// 1-1) static method
	public static void sFun() { // ClassMember와 전혀 상관없음 (ex. A의 집에 하숙하는 B는 A 가족과 전혀 상관없음) 
		System.out.println("sFun");
	}
	
	// 1-2 static field
	public static int x = 1+1; // 처음부터 초기값을 가져야 함
	
	public static int[] arr = new int[3]; // 3개 만들기
	
	/*
		public static int[] arr = new int[] {1, 2, 3}; 
		자바는 오른쪽에 값과 식 이외에는 올 수 없음 public static int[] arr = for( ) -> X
		
		public static int y = (int)Math.random(); // y값이 랜덤 값을 가짐
	*/
	
	// 1-3) static block
	static {
		// ClassMember.arr = new int[3]; // 초기화 
		// arr = new int[3]; -> ClassMember 생략 가능 -> static을 가져오는 거니까
		
		for(int i=0; i<ClassMember.arr.length; i++) {
			int rNum = (int)(Math.random()+10) + 1;
			ClassMember.arr[i] = rNum;
		}
	}
	
	
	// 2. 메서드
	public void fun() { // 코드 기능일뿐임 -> 객체가 만들어져야 함
		System.out.println("fun()");
	}
	// ClassMember cm = new ClassMember(); 
	// cm.fun(); -> 호출 가능
	
	
	// 3. 필드
	public String name;
	
	
	// 4. 생성자
	public ClassMember() { // 없으면 기본 형태로 자동으로 생성됨(컴파일러)
		// 필드 초기화 코드가 없다면 자동으로 코드가 구현됨(컴파일러)
		this.name = null;
	}
	public class InClass{} // 내부 클래스
	public enum InEnum{ // 내부 Enum
		x, y
	}
	public interface InInterface{} // 내부 인터페이스
	public @interface InAnnotation{} // 내부 인터페이스
	
}
