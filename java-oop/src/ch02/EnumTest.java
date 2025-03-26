package ch02;
/*	
 * import ch02.*; -> 같은 패키지에 있는 것은 import 하지 않아도 됨
 * import java.lang.*; -> 자동으로 import 되어 있어서 String을 그냥 적을 수 있는 것
 * 
*/

public class EnumTest {
	public static void main(String[] args) {
		char gender = 'ㅁ'; // M, F가 아닌 다른 값이 대입될 수 있음
		
		if(gender == 'M') {
			System.out.println("남자");
		} else if(gender == 'F') {
			System.out.println("여자");
		} else {
			System.out.println("잘못된 값입니다");
		}
		
		
		// Enum 사용시 잘못된 값이 대입될 수 없음
		Gender gender2 = null; // 참조타입이니까 null로 초기화
		gender2 = Gender.MALE;
		
		// 다른 값이 들어올 수 없기 때문에 참조타입이어도 등호연산자 사용 가능 (enum)
		if(gender2 == Gender.MALE) { 
			System.out.println("남자");
		} else {
			System.out.println("여자");
		}
		
		
		// Enum 사용시 if보다 swich가 가독성이 높을 수도 있음
		switch(gender2) {
		case Gender.MALE:
			System.out.println("남자");
			break;
		case Gender.FEMAIL:
			System.out.println("여자");
			break;
		}
	}

}
