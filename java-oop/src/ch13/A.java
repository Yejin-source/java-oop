package ch13;

public class A { // final -> 확장 클래스를 만들 수 없음 | final public class A { }
	public void test() { // final -> 오버라이드 불가능 | final public void test() { }
		
	}
}

/*
	class 로봇고양이 extends 고양이 {
		로봇 r; // 로봇고양이와 로봇 간에는 다형성이 지원되지 않음
	}
	
	로봇 x = new 로봇고양이();
	고양이 y = new 로봇고양이();
	똑같은 이름으로 여러 개 할 수 있음
*/