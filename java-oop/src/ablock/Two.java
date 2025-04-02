package ablock;

public class Two {
	public void oneTest() {
		One one = new One(); // one이라는 객체를 통해서 a, b, c, d 호출 가능
		one.a = 1;
		one.b = 2;
		one.c = 3;
		// one.d = 4; | private으로 되어 있으면 같은 패키지에서도 호출할 수 없음
	}
}
