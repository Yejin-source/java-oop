package ch07;

public class Calculator {
	public Calculator() {
		this.power = false;
	}
	public boolean power;
	public int num;
	
	
	
	// this.num * (0.5 ~ 1.5)
	public double setRateNum(double rate) {
		double result = 0;
		if(!this.power) { // this.power == false
			System.out.println("계산기 OFF 상태");
		} else {
			if(!(rate >= 0.5 && rate <= 1.5)) {
				System.out.println("입력값 ERROR");
			} else {
				result = this.num * rate;
			}
		}
		return result;
	}
	
	
	
	public void setPower() {
		this.power = !this.power;
	}
	
	public void setNum(int num) {
		// 계산기 파워가 on(true)일 때만 실행
		if(this.power) { // this.power == true
			this.num = num;
		} else {
			System.out.println("");
		}
			
	}
	
	// this.num이 짝수인지 홀수인지 알고 싶은 메서드
	public String checkNum() { // 안에 있는 내용은 안에서 다 끝남
			
		// 계산기 파워가 ON(true)일 때만 실행
		String result = "";
		if(!this.power) { // this.power == false	
			System.out.println("계산기 OFF 상태");
			result = "ERROR";
		} else {
			if(this.num % 2 == 0) {
				result = "짝수";
			} else {
				result = "홀수";
			}
		}
		return result;
	}
	
	/*
		public String checkNum() {
		짝수인지 홀수인지 반환되어야 하니까 -> String
		this.num 안에 있는 숫자를 사용하니까 값을 입력받지 않음
	*/
	
}
