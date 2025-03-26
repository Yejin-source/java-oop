package ch04;

public class Person {
	public void drive() {
		Car c1 = new Car();
		c1.move(); // this -> c1
		
		Car c2 = new Car();
		c2.onOff = true;
		c2.move(); // this -> c2
		
		// this -> 파이썬에서는 self라는 용어를 사용함
	}
}
