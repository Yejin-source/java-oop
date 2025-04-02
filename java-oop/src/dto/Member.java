package dto;

public class Member {
	// 정보은닉
	private String id;
	private int age;
	private String pw;
	
	// 캡슐화
	// setter
	public void setId(String id) {
		this.id = id;
	}
	
	// getter
	public String getId() {
		return this.id;
	}

	// 자동화 기능으로 만들 수 있음
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age < 0) {
			this.age = 0;
			return;
		}
		this.age = age;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}
	
	
}
