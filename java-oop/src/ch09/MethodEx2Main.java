package ch09;
import java.util.ArrayList;
import java.util.HashMap;

public class MethodEx2Main {
	public static void main(String[] args) { // 메소드 안에 this를 쓰는 경우 static 불가능
		MethodEx2 m2 = new MethodEx2();
		
		// 반환타입: int
		// 매개타입: 배열 
		int[] arr = new int[7];
		System.out.println(m2.m24a(arr)); //  7
		System.out.println(m2.m24b(arr)); //  7
		
		
		Student s1 = new Student();
		s1.num = 2;
		s1.name = "토게";
		Student s2 = new Student();
		s2.num = 3;
		s2.name = "사토루";
		Student s3 = new Student();
		s3.num = 3;
		s3.name = "유타";
		
		
		// Student 변수를 디버깅하는 메서드 (디버깅 < 로깅)
		// 반환타입 String
		// 매개타입 Student
		System.out.println(s1.num + ", " + s1.name); // 이렇게 할 필요가 없어짐
		System.out.println(m2.m25a(s1));
		System.out.println(m2.m25a(s2));
		
		// Student 변수를 비교하는 메서드
		System.out.println(s2 == s3); // false
		System.out.println(s2.equals(s3)); // false
		// 주소값이 다른 위치에 있기 때문에 false일 수밖에 없음
		
		System.out.println(m2.m24c(s2, s3)); // true
		System.out.println(m2.m24c(s1, s2)); // false
		
		
		ArrayList<String> list = new ArrayList<String>();
			list.add("101");
			list.add("200");
			list.add("900");
			int[] result = m2.m4a(list);
			if(result != null) {
				for(int n : result) {
					System.out.println(n); // 101 200 900
				}
			}
			
			
		int num = 252;
		String[] result2 = m2.m5b(num);
		for(String s : result2) {
			System.out.println(s);
		}
		
		int num5 = 1528;
		String[] result5 = m2.m5b(num5);
		for(String s : result5) {
			System.out.println(s);
		}
		
		
		Student student = m2.m6a(8, "나기");
		System.out.println(m2.m25a(student));
		
		
		ArrayList<HashMap<String, Object>> list7 
			= new ArrayList<HashMap<String, Object>>();
		
		HashMap<String, Object> map1
			= new HashMap<String, Object>();
		map1.put("num", 11);
		map1.put("name", "바치라");
		list7.add(map1);
		
		HashMap<String, Object> map2
		= new HashMap<String, Object>();
		map2.put("num", 21);
		map2.put("name", "레이");
		list7.add(map2);
		
		HashMap<String, Object> map3
		= new HashMap<String, Object>();
		map3.put("num", 7);
		map3.put("name", "미야");
		list7.add(map3);
		
		Student[] arr7 = m2.m7a(list7);
		for(Student s : arr7) {
			System.out.println(m2.m25a(s));
		}
		
		
		ArrayList<String> nameList
			= m2.m8a("토게", "사토루", "메구미", "유타", "유우지");
		for(String n : nameList) {
			System.out.println(n);
		}
		
		
		Student s9 = new Student();
		s9.num = 99;
		s9.name = "켄마";
		HashMap<String, Object> map9
			= m2.m9a(s9);
		System.out.println(map9.get("num"));
		System.out.println(map9.get("name"));
	}
}
