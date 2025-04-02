package ch10;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import dto.Actor; // DTO -> Data Transfer Object

public class ActorDAO { // DAO -> Data Access Object
	
	// Actor 테이블 데이터를 입력 - insert
	public int insertActor(Actor actor) throws ClassNotFoundException, SQLException {
		int row = 0;
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = null;
		PreparedStatement stmt = null;
		String sql = "INSERT INTO actor(first_name, last_name) VALUES (?,?)";
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila", "root", "java1234");
		
		// 쿼리 실행
		stmt = conn.prepareStatement(sql);
		stmt.setString(1, actor.getFirstName()); // getter
		stmt.setString(2, actor.getLastName());
		System.out.println(stmt);
		row = stmt.executeUpdate();
		conn.close();
		return row;
	}
	
	// Actor 테이블 데이터를 조회 - select
	public ArrayList<Actor> selectActorList(int num) throws ClassNotFoundException, SQLException {
		ArrayList<Actor> list = new ArrayList<Actor>();
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		String sql = "SELECT actor_id actorId, first_name firstName, last_name lastName, last_update lastUpdate" 
				+ " FROM actor ORDER BY actor_id DESC LIMIT ?";
		
		stmt = conn.prepareStatement(sql);
		stmt.setInt(1, num);
		rs = stmt.executeQuery();
		
		// ResultSet(특수한) -> ArrayList(일반적: 기본 API, 문법)
		while(rs.next()) {
			Actor a = new Actor();
			a.setActorId(rs.getInt("actorId"));
			a.setFirstName(rs.getString("firstName"));
			a.setLastName(rs.getString("lastName"));
			a.setLastupdate(rs.getString("lastUpdate"));
			list.add(a);
		}
		
		conn.close();
		return list;
	}
}
