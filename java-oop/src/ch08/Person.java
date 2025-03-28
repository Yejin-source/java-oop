package ch08;
import java.util.*;

public class Person {
	public String id;
	public String pw;
	public Person() {} // 생성자 오버로딩
	public Person(String id, String pw) {
		this.id = id;
		this.pw = pw;
	}
	
	
	// 1-1 리턴타입: void, 매개변수: X
	public void m11() {
		System.out.println("hello");
		// 단순히 print를 할 때
	}
	
	// 1-1 과제) 
	// ~12:00 Good Morning
	// ~18:00 Good Afternoon
	// ~00:00 Good Evening
	// 입력값 필요 X
	
	public void m11a() {
      Calendar c = Calendar.getInstance();
      int hour = c.get(Calendar.HOUR);
      
      if(hour < 12) {
    	  System.out.println("Good Morning");
      } else if(hour < 18) {
    	  System.out.println("Good Afternoon");
      } else {
    	  System.out.println("Good Evening");
      }
	}
	
	
	// 1-2 리턴타입: void, 매개변수: int 
	// 매개변수 : int (시간 0 ~ 23)
	public void m12(int time) {
		if(time < 0 || time > 23) {
			System.out.println("0 ~ 23 입력하세요");
			return; // 1. 메서드 강제 종료 2. 값을 남기고 싶으면 남기기 
			// 여기서는 void라서 반환값이 없기 때문에 값을 남기지 않음
		} if(time < 12) {
			System.out.println("AM");
		} else {
			System.out.println("PM");
		}
		
	}
	public void m12a(boolean flag) {
		flag = true; // false가 들어갔지만 true로 바뀜
		System.out.println(flag); // true 출력
	}
	
	
	// 1-3 리턴타입: void, 매개변수: String
	// 글자 수 짝/홀
	public void m13a(String name) { // 모든 참조 타입에는 null이 들어올 수 있음
		if(name == null) {
			System.out.println("null 입력 불가");
			return;
		}
		int len = name.length();
		if(len % 2 == 0) {
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}
		
	}
		
	// 로그인(Person id, pw가 동일하면 로그인)
	public void m13b(String id, String pw) { // 모든 참조 타입에는 null이 들어올 수 있음
		// 리턴타입 필요없으니까 void
		if(this.id.equals(id) && this.pw.equals(pw)) { // this가 없으면 static으로 설정
			System.out.println("로그인 성공");
		} else {
			System.out.println("로그인 실패");
		}
	}
		
	
	// 1-4 리턴타입: void, 매개변수: 배열
	public void m14a(int[] arr) { // 모든 참조 타입에는 null이 들어올 수 있음
		if(arr == null) {
			System.out.println("null 입력 불가");
			return;
		}
		for(int i=0; i<arr.length; i++) {
			arr[i] = i+1;
		}
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+",");
		}
		System.out.println("");
	}
	
	
	// 1-5 리턴타입: void, 매개변수: String 배열
	public void m15a(String[] names) {
		for(String n : names) {
			System.out.println(n);
		}
	}
	
	
	// 1-6 리턴타입: void, 매개변수: 배열
	public void m16a(Data d) { // 참조 타입이니까 변경됨
		d.y = d.y*100;
	}
	
	
	// 1-7 리턴타입: void, 매개변수: class[]
	public void m17a(Data[] datas) {
		for(int i=0; i<datas.length; i++) {
			if(datas[i].x % 2 == 1) {
				System.out.print(datas[i].y + ",");
			}
		}
		System.out.println();
	}
	
	public void m17b(Data[] datas, int y) {
		for(Data d : datas) {
			if(d.y == y) {
				System.out.println("d.x: "+d.x+", d.y: "+d.y);
			}
		}
	}
	
	
	// 1-8 리턴타입: void, 매개변수: ArrayList
	public void m18a(ArrayList<Integer> year) { // 참조 타입의 배열만 만들 수 있음 
		System.out.print("입력된 리스트 중 윤년은 ");
		for(Integer y : year) {
			if(y % 4 == 0 && y % 100 != 0 || y % 400 == 0) { // 윤년이면
				System.out.print(y + " ");
			}
		}
		System.out.println("입니다.");
	}
	
	
	// 1-9 리턴타입: void, 매개변수: HashMap
 	public void m19a(HashMap<String, Object> map) { // 참조 타입도 형 변환이 가능함
		System.out.println((String)(map.get("name"))); // 키 값 | 무조건 Object 타입으로 나옴 
		System.out.println((Integer)(map.get("age"))); 
		String[] hobby = (String[])(map.get("hobby")); 
		for(String h : hobby) {
			System.out.print(h + ",");
		}
		Data data = (Data)(map.get("data"));
		System.out.println(data.x);
		System.out.println(data.y);
	}
	// 모든 타입은 Object 타입이 될 수 있음 But 반대는 불가능 -> 형 변환 필요
}