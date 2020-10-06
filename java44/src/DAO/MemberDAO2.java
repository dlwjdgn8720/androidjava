package DAO;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

//CRUD중심으로 기능을 정의
//데이터와 관련된 작업(Data Access object:DAO)
public class MemberDAO2 {
	// 기능을 정의할때는 메서드(함수)를 사용
	// create메서드 호출시 입력 값을 받아주는 중간 매개체 역할의 변수
	// =>매개변수(parameter,파라메터)
	
	PreparedStatement ps;
	Connection con;
	ResultSet rs;

	public MemberDAO2() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		//1.드라이버정보
		System.out.println("1.connector연결성공!!");
		// 2.db연결
		String url = "jdbc:mysql://localhost:3366/mega?useUnicode=true&characterEncoding=utf8";
		String user = "root";
		String password = "1234";
		con = DriverManager.getConnection(url, user, password);
		System.out.println("2.db연결 성공!!");
	}
	
	

	public boolean create(MemberVO2 bag) throws Exception {

		String sql = "insert into member2 values(?,?,?,?,?,?)";
		ps = con.prepareStatement(sql);
		ps.setString(1, bag.getId());
		ps.setString(2, bag.getFirst_name());
		ps.setString(3, bag.getLast_name());
		ps.setString(4, bag.getEmail());
		ps.setString(5, bag.getGender());
		ps.setString(6, bag.getIp_address());
		
		System.out.println("3.sql생성 성공!!");
		// 4.sql문은 전송
		int row = ps.executeUpdate();
		System.out.println("4.sql문 전송 성공!!");
		boolean result = false;
		if (row == 1) {
			result = true;
		}
		ps.close();
		con.close();
		return result;
	}

	

}
