package ch13;

public class B extends A {
	final int x = 10; // final -> 값을 바꿀 수 없음 -> 상수
	
	@Override
	public void test() { // 오버라이딩
		// this.x = 9; -> 불가능
	}
	
	public int add(final int x, final int y) { // 입력받은 변수 값은 변경할 수 없어야 함
		return x+y;
	}
}
