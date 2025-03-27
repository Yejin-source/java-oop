package ch06;

public class CarMain2 {
	
	public static void main(String[] ars) {
		Car2 c1 = new Car2();
		Car2 c2 = new Car2(7, true);
		c1.print();
		c2.print();
		
		// c1 안에 있는 this는 c1, c2 안에 있는 this는 c2를 호출하는 것
	}
}
