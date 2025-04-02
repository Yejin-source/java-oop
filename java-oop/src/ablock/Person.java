package ablock;

public class Person {
	// 정보은닉 | 메서드 안에서도 가능
	private void first() { // 메서드 하나는 하나의 역할만 해야 함
		System.out.println("backup");
	}

	// 정보은닉
	private void second() {
		System.out.println("delete");
	}
	
	// 캡슐화 | private으로 정보를 은닉하고 public으로 캡슐화해서 사용하기
	public void deleteMember() {
		this.first();
		this.second();
	}
}
