package ch06;

public class Car2 {
	public int num;
	public boolean is;
	
	// 생성자 오버로딩
	public Car2() {
		this(1, true);
	}
	public Car2(int num, boolean is) {
		this.num = num;
		this.is = is;
	}	
	
	// this
	public void print() {
		System.out.println(this.num);
	}
	
	// 일반 메서드 안에 this는 자기 메서드를 호출하는 객체 자체를 가리킴
	// static 안에는 this를 쓸 수 없음 
}

