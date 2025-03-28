package ch08;
import java.util.*;

public class PersonMain {
	
	public static void main(String[] args) {
		Person p1 = new Person("admin", "1234");
		// p1.id:admin, p1.pw:1234
		
		// 1-1
		p1.m11(); // Hello | this를 쓰는 상황에서는 static
		p1.m11a(); // Good Morning
		
		
		// 1-2
		p1.m12(9); // AM
	    Calendar c = Calendar.getInstance();
	    int h = c.get(Calendar.HOUR); // enum하고 똑같다고 생각하면 됨
	    p1.m12(h); // AM | h -> h가 아니라 h의 값이 들어옴
	    
	    p1.m12a(false); // flag에 false가 들어감
	    // 매개변수로 값 전달
	    boolean x = false;
	    p1.m12a(x);
	    System.out.println(x); //flag = false
	    // 참조 타입에서 변경되면 같이 변하지만, 값 타입은 변경되지 않음 (복사해서 한 쪽만 없어져도 영향 없음)
	    
	    
	    // 1-3
	    p1.m13a(null);
	    p1.m13a("홍길동"); // 홀수
	    String name = "심사임당";
	    p1.m13a(name); // 짝수
	    
	    p1.m13b("guest", "1234");
	    p1.m13b("admin", "1234");
	    
	    
	    // 1-4
	    int[] arr = new int[5]; // 0, 0, 0, 0, 0 | 배열의 생성자
	    p1.m14a(arr);
	    for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+",");
		}
		System.out.println("");
		
		
		// 1-5
		String[] names = new String[2];
		names[0] = "토게";
		names[1] = "사토루";		
		
		
		// 1-6
		Data d = new Data(7, 7); // 7, 7이 저장됨
		p1.m16a(d);
		System.out.println(d.x);
		System.out.println(d.y);
		
		
		// 1-7
		Data[] datas = new Data[4]; // 변수 값을 똑같이 할 필요는 없지만 다르게 할 필요도 없음
		datas[0] = new Data(13, 100);
		datas[1] = new Data(23, 200);
		datas[2] = new Data(20, 300);
		datas[3] = new Data(39, 400);
		p1.m17a(datas);
		p1.m17b(datas, 200);
		
		
		// 1-8
		ArrayList<Integer> year
			= new ArrayList<Integer>();
		int y = 2000;
		for(int i=0; i<50; i++) { // 50개
			year.add(y);
			y=y+1;			
		}
		p1.m18a(year);
		
		
		// 1-9
		HashMap<String, Object> paramMap
			= new HashMap<String, Object>();
		paramMap.put("name", "이누마키");
		paramMap.put("age", 18);
		String[] myhobby = {"주먹밥", "판다랑 놀기", "야구"};
		paramMap.put("hobby", myhobby);
		Data myData = new Data(7, 11);
		paramMap.put("data", myData);
		
		p1.m19a(paramMap);
	}
}
