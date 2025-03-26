package ch03;

// Person에 종속 -> Person이 가지는 것은 다 가져야 함
public class Doctor { 
	public Person person; // 집합(포함) 관계
		// public int age;
		// public String name;
	public String major;
}
