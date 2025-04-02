package ablock;

public class One {
	public int a; // 정보은닉 불가능
	protected int b; // 같은 패키지에서 사용 가능 + 상속
	int c; // default | 같은 패키지에서만 사용(호출) 가능
	private int d; // 정보은닉
	
	public void test() {
		this.a = 1;
		this.b = 2;
		this.c = 3;
		this.d = 4; // 필드가 있는 동일한 클래스 내의 메서드에서는 사용 가능함
	}
}
