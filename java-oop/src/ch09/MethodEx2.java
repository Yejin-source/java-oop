package ch09;
import java.util.ArrayList;
import java.util.HashMap;

public class MethodEx2 {
	// 반환타입: 숫자
	// 매개타입: 배열 
	// 배열.length API 사용 금지
	// 배열을 입력하면 반환값으로 배열의 길이 반환
	
	public int m24a(int[] arr) { // ex) int x = new int[7]
		int result = 0; // int result = arr.length -> 사용금지
		
		// foreach문 사용
		for(int i : arr) { // arr의 개수만큼 i가 반복됨
			result++;
		}
		return result;
	}
	
	public int m24b(int[] arr) {
		int i = 0; // arr.length 사용금지
		boolean flag = true;
		while(flag) { // 무한루프 -> flag가 true이기 때문에 계속 반복
			try { // try절에서 예외가 발생하면 catch절로
				int temp = arr[i];
			} catch(Exception e) {
				return i; // 예외 발생 시 현재 인덱스 반환 (배열 길이)
			}
			i++;
		}
 		return i;
	}
	
	
	// Student타입을 디버깅한 문자열을 반환하는 메서드
	// 반환타입: String
	// 매개타입: 클래스 하나
	public String m25a(Student s) {
		String result = "";
		result += "번호는 " + s.num + "이고, ";
		result += "이름은 " + s.name + "입니다";
		return result; // 번호는 ?이고, 이름은 ?입니다
	}
	
	// 반환타입: boolean
	// 매개타입: 클래스 두 개
	public boolean m24c(Student s1, Student s2) {
		boolean result = false;
		
		// s1, s2를 비교하는 코드
		if(s1.num == s2.num && s1.name.equals(s2.name)) {
			result = true;
		}
		return result;
	}
	

	// 반환타입: 배열
	// 매개타입: List
	// List를 입력받아서 배열로 변경하여 반환
	public int[] m4a(ArrayList<String> list) {
		int[] result = new int[list.size()]; // 리스트 요소 개수 반환 (요소 추가/삭제 가능)
		int i = 0;
		for(String s : list) {
			result[i] = Integer.parseInt(s);
			i=i+1;
		}		
		return result;
	}
	
	
	// ! 과제
	// 반환타입: 배열
	// 매개타입: int
	// 1528 -> {1, 5, 2, 8}
	public int[] m5a(int num) { // 나누기 연산
		int[] result = null;
		
		// 복사해서 원본 값 유지
		int temp = num; // temp: 임시로 값을 저장하는 변수로 자주 사용됨
		
		// 자리수 구하기
		int length = 0;
		while(temp > 0) {
			temp = temp / 10; // 1528 -> 152 -> 15 -> 1 -> 0
			length++; // length가 4면 네 자리수
		}
		
		// 결과를 저장할 배열 생성
		result = new int[length];
	
		// 배열에 뒤에서부터 숫자 채우기
		for(int i=length-1; i>=0; i--) {
			result[i] = num % 10; // 마지막 자리 숫자 저장
			num = num / 10; // 마지막 자리수 없애기 
		}
		return result;
	}
	
	// 252 -> {"2", "5", "2"}
	public String[] m5b(int num) { // substring() 메서드
		String[] result = null;
		String str = num+""; // "252" | 문자열로 바꾸기
		result = new String[str.length()]; // new String[3]
		for(int i=0; i<result.length; i++) {
			if(i != result.length-1) { // 마지막 인덱스가 아니라면
				result[i] = str.substring(i, i+1); // (0, 1) (1, 2)	
			} else { // (2)
				result[i] = str.substring(i); // 마지막 자리는 끝까지 가져옴
			}
		}	
		return result;
	}
	
	
	// 반환타입: 클래스
	// 입력타입: int, String
	public Student m6a(int num, String name) {
		Student s = new Student();
		s.num = num;
		s.name = name;
		return s;
	}
	
	
	// 반환타입: Student[] 클래스의 배열
	// 매개타입: List<Map>
	public Student[] m7a(ArrayList<HashMap<String, Object>> list) {
		Student[] arr = new Student[list.size()];
		int i = 0;
		for(HashMap<String, Object> m : list) {
			arr[i] = new Student();
			arr[i].num = (Integer)(m.get("num"));
			arr[i].name = (String)(m.get("name"));
			i=i+1;
		}
		return arr;
	}
	
	/*
	 * HashMap<String, Object>
	 * String -> 키: 데이터를 구분하는 문자열 (ex. "num", "name")
	 * Object -> 값: 어떤 데이터 타입이든 저장 가능
	 */
	
	
	// 반환타입: List<String>
	// 매개타입: 임의의 개수의 문자열
	public ArrayList<String> m8a(String...name) {
		ArrayList<String> result = new ArrayList<String>();
		for(String n : name) {
			result.add(n);
		}
		return result;
	}
	
	
	// 반환타입: Map
	// 매개타입: Student
	public HashMap<String, Object> m9a(Student s) {
		HashMap<String, Object> result
			= new HashMap<String, Object>();
		result.put("num", s.num);
		result.put("name", s.name);
		return result;
	}
}
