package dto;

public class Actor {
	// 정보은닉
	private Integer actorId;
	private String firstName;
	private String lastName;
	private String lastupdate;
	
	
	// 캡슐화
	public Integer getActorId() {
		return actorId;
	}
	public void setActorId(Integer actorId) {
		this.actorId = actorId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getLastupdate() {
		return lastupdate;
	}
	public void setLastupdate(String lastupdate) {
		this.lastupdate = lastupdate;
	}
	
	
	// 생성자 오버로딩
	public Actor(Integer actorId, String firstName, String lastName, String lastupdate) {
		this.actorId = actorId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.lastupdate = lastupdate;
	}
	public Actor() {
	}
	
}
