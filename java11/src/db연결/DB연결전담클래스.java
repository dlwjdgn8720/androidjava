package db연결;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

//CRUD중심으로 기능을 정의
//데이터와 관련된 작업(Data Access object:DAO)
public class DB연결전담클래스 {
	// 기능을 정의할때는 메서드(함수)를 사용
	// create메서드 호출시 입력 값을 받아주는 중간 매개체 역할의 변수
	// =>매개변수(parameter,파라메터)

	public void create(String id, String pw, String name, String tel) throws Exception {
		// DB프로그램 절차에 맞추서 코딩
		// 1.connector 설정
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1.connector연결성공!!");
		// 2.db연결
		String url = "jdbc:mysql://localhost:3366/shop1";
		String user = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("2.db연결 성공!!");
		// 3.sql문을 만든다.

		String sql = "insert into member values(?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);
		ps.setString(2, pw);
		ps.setString(3, name);
		ps.setString(4, tel);
		System.out.println("3.sql생성 성공!!");
		// 4.sql문은 전송
		ps.executeUpdate();
		System.out.println("4.sql문 전송 성공!!");
	}

	// public void read() {
	// 1.connector 설정
//		Class.forName("com.mysql.jdbc.Driver");
//		System.out.println("1.connector연결성공!!");
//		// 2.db연결
//		String url = "jdbc:mysql://localhost:3366/shop1";
//		String user = "root";
//		String password = "1234";
//		Connection con = DriverManager.getConnection(url, user, password);
//		System.out.println("2.db연결 성공!!");
//		// 3.sql문을 만든다.
//
//		String sql = "insert into member values(?,?,?,?)";
//		PreparedStatement ps = con.prepareStatement(sql);
//		ps.setString(1, id);
//		ps.setString(2, pw);
//		ps.setString(3, name);
//		ps.setString(4, tel);
//		System.out.println("3.sql생성 성공!!");
//		// 4.sql문은 전송
//		ps.executeUpdate();
//		System.out.println("4.sql문 전송 성공!!");
//
//	}
//
	public void update(String tel, String id) throws Exception {
		// 1.connector 설정
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1.connector연결성공!!");
		// 2.db연결
		String url = "jdbc:mysql://localhost:3366/shop1";
		String user = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("2.db연결 성공!!");
		// 3.sql문을 만든다.

		String sql = "update member set tel=? where id=?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, tel);
		ps.setString(2, id);

		System.out.println("3.sql생성 성공!!");
		// 4.sql문은 전송
		ps.executeUpdate();
		System.out.println("4.sql문 전송 성공!!");
	}

	public void delete(String id) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1.connector 연결 성공");

		String url = "jdbc:mysql://localhost:3366/shop1";
		String user = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("2.db연결 성공");

		String sql4 = "delete from member where id=?";
		PreparedStatement ps = con.prepareStatement(sql4);
		ps.setString(1, id);
		System.out.println("3.SQL생성 성공");

		ps.executeUpdate();
		System.out.println("4.SQL 전송 성공");

	}

}
