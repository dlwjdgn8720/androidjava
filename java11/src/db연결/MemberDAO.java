package db연결;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

//CRUD중심으로 기능을 정의
//데이터와 관련된 작업(Data Access object:DAO)
public class MemberDAO {
	// 기능을 정의할때는 메서드(함수)를 사용
	// create메서드 호출시 입력 값을 받아주는 중간 매개체 역할의 변수
	// =>매개변수(parameter,파라메터)

	public void create(String id, String pw, String name, String tel) throws Exception {
//		// DB프로그램 절차에 맞추서 코딩
//		// 1.connector 설정
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

	public int read(String id) throws Exception {
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

		String sql = "select * from member where id=?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);
		
		System.out.println("3.sql생성 성공!!");
		
		// 4.sql문은 전송
		ResultSet rs = ps.executeQuery();
		System.out.println("4.sql문 전송 성공!!");
		int result = 0; //없음
		if(rs.next() == true) { //결과가 있는지 없는지 체크해주는 메서드
			System.out.println("검색결과가 있어요");
			result = 1; //있음
			String id2 = rs.getString("id");
			String pw = rs.getString("pw");
			String name = rs.getString("name");
			String tel = rs.getString("tel");
			System.out.println("검색결과id: "+id2);
			System.out.println("검색결과pw: "+pw);
			System.out.println("검색결과name: "+name);
			System.out.println("검색결과tel: "+tel);
		}
		else {
			System.out.println("검색 결과가 없어요");
		}
		return result; // 0이 넘어가면, 검색결과 없음
		               // 1이 넘어가면, 검색결과 있음

	}

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
