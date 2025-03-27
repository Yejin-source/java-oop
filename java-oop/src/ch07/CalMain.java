package ch07;

public class CalMain {
	public static void main(String[] ars) {
		Calculator c = new Calculator();
		// c.power = true; -> 속성 자체를 바꾸는 형태로 하지 않는 것이 좋음
		System.out.println(c.power); // false
		c.setPower();
		System.out.println(c.power); // true
		// c.setPower();
		// System.out.println(c.power); // false
		
		c.setNum(5);
		
		String result = c.checkNum(); 
		System.out.println(result);
		// 반환값이 있으니까 실행하고 나면 이 자리에 짝수 or 홀수가 남음
		// Calculator에 있는 result가 아님
		
		System.out.println(c.setRateNum(-0.777));
	}
}
