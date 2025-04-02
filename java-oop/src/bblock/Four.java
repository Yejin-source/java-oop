package bblock;
import ablock.One;

public class Four extends One { // One을 상속받겠다
	public void oneTest() {
		this.a = 1; // 자신의 것이니까 새로 만들 필요 없음
		this.b = 2;
		// this.c = 3; 
		// this.d = 4;
	}
}
