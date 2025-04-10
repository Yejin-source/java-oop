package ch12;

public class SmartCar extends Car {
	// Object: super.super -> Car:super
	
	public String display;
	
	@Override
	public void onOff() { // 오버라이딩: 부모 메서드를 자식 클래스에서 다시 정의하는 것(메서드 재정의)
		System.out.println("버튼 사용");
	}
	
	public static void main(String[] args) {
		SmartCar sc = new SmartCar();
		sc.onOff();
	}
	
	
	
	/*
		[Car.java]
		
	 	package ch12;

		public class Car {
			public String color = "노란색";
			public void onOff() {
				System.out.println("키 사용");
			}
		}
		 
		 
		 
		[smartCar.java]
		
		package ch12;
		
		public class SmartCar extends Car {
			public String display;
			public String color = "보라색";
			public SmartCar() {
				super(); // super.color = null;
				this.display = null;
		}
		// super.onOff()
		 
		public void print() {
			System.out.println(super.color); // 노란색
			System.out.println(this.color);  // 보라색
			System.out.println(color);		 // 보라색
		}
	
		public static void main(String[] args) {
			SmartCar sc = new SmartCar();
			// sc.display = "삼성"; // this
			// sc.color = "파란색"; // super
			System.out.println(sc.display);
			System.out.println(sc.color); // 부모 필드가 hiding되기 때문에 this만 호출됨
			sc.onOff(); // super
			sc.print();
			
			Car c = (Car)(new SmartCar()); // 자동형변환이 됨
			c.onOff(); // super
			if(c instanceof SmartCar) { // 강제형변환이 가능한지 물어봐야 함
				((SmartCar)c).print(); // 강제형변환			
			}
			
			String s = null;
			// ((SmartCar)s).print(); -> 불가능
			
			Car c2 = new Car();
			if(c2 instanceof SmartCar) { // 강제형변환이 가능한지 물어봐야 함
				((SmartCar)c2).print(); // 강제형변환			
			}
		}
		
	 */
}
