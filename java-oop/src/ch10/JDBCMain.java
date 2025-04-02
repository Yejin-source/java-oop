package ch10;
import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner; // 주로 앱에서 사용하는 API

import dto.Actor;

public class JDBCMain {
	public static void main(String[] args) throws ClassNotFoundException, SQLException { // 예외를 전부 외부로 던지기
		
		// 1) ~ 4) Controller
		// ActorDAO.java -> Model
		// 5) View
		
		// 1) 키보드를 통해 매개값 입력받기
		Scanner scanner = new Scanner(System.in);
		System.out.println("firstName을 입력하세요: ");
		String firstName = scanner.nextLine();
		System.out.println("lastName을 입력하세요: ");
		String lastName = scanner.nextLine();
		
		System.out.println("firstName: " + firstName);
		System.out.println("lastName: " + lastName);
		scanner.close(); // 다 사용했다고 알려주어야 함
		
		
		// 2) 
		Actor actor = new Actor();
		actor.setFirstName(firstName);
		actor.setLastName(lastName);
		
		// 3) 입력 insert 모듈(메서드) 호출
		ActorDAO actorDao = new ActorDAO();
		int row = actorDao.insertActor(actor);
		
		// 4) 조회 select 모듈(메서드) 호출
		ArrayList<Actor> list = actorDao.selectActorList(5);
		
		// 5) 출력
		for(Actor a : list) { // "\t" -> tab
			System.out.println(a.getActorId()+"\t"+a.getFirstName()+"\t"+a.getLastName()+"\t"+a.getLastupdate());
		}
			
		
	/*	
	 	[insert -> ActorDAO.java에 작성]
	 	
		// 라이브러리를 추가 -> 프로젝트 우클릭 build-path 항목에서 추가
		Class.forName("com.mysql.cj.jdbc.Driver"); // 예외를 발생시킬 수 있음 -> throws
		Connection conn = null;
		PreparedStatement stmt = null;
		int row = 0;
		String sql = "INSERT INTO actor(first_name, last_name) VALUES (?, ?)";
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila", "root", "java1234");		
		
		// 쿼리 실행
		stmt = conn.prepareStatement(sql);
		stmt.setString(1, firstName);
		stmt.setString(2, lastName);
		System.out.println(stmt);
		
		row = stmt.executeUpdate();
		if(row == 1) {
			System.out.println("입력 성공");
		}


		[select -> ActorDAO.java에 작성]
		
		// 조회 select
		PreparedStatement stmt2 = null;
		ResultSet rs2 = null;
		String sql2 = "SELECT actor_id actorId, first_name firstName, last_name lastName, last_update lastUpdate" 
						+ " FROM actor ORDER BY actor_id DESC LIMIT 5";
		stmt2 = conn.prepareStatement(sql2);
		rs2 = stmt2.executeQuery();
		System.out.println("actorId\tfirstName\tlastName\tlastUpdate");
		while(rs2.next()) {
			System.out.println(rs2.getInt("actorId")+"\t"+rs2.getString("firstName")+"\t"+rs2.getString("lastName")+"\t"+rs2.getString("lastUpdate"));
		}
		
		conn.close(); // 다 사용했다고 알려주어야 함
	 */	
		
	}
}
