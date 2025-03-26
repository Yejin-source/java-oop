package ch04;

public class Car {
	public Car() { // 생략되어 있는 부분		
	}
	public boolean onOff;
	public void move() {
		if(this.onOff) {
			System.out.println("자동차 MOVE!");
		} else {
			System.out.println("시동부터...");			
		}
	}
}
