package bblock;
import ablock.One; // 다른 패키지에서 사용할 땐 꼭 import를 해야 함

public class Three {
	public void oneTest() {
		One one = new One();
		one.a = 1; // | public
		// one.b = 2; | protected 
		// one.c = 3; | default
		// one.d = 4; | private
	}
}
