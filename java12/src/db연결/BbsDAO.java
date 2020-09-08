package db연결;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class BbsDAO {
	public void create(BbsVO bag) throws Exception {
		// DB프로그램 절차에 맞추서 코딩
		// 1.connector 설정
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1.connector연결성공!!");
		// 2.db연결
		String url = "jdbc:mysql://localhost:3366/shop1?useUnicode=true&characterEncoding=utf8";
		String user = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("2.db연결 성공!!");
		// 3.sql문을 만든다.

		String sql = "insert into bbs values(null,?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		//ps.setInt(1, bag.getNo());
		ps.setString(1, bag.getTitle());
		ps.setString(2, bag.getContent());
		ps.setString(3, bag.getWritter());
		System.out.println("3.sql생성 성공!!");
		// 4.sql문은 전송
		ps.executeUpdate();
		System.out.println("4.sql문 전송 성공!!");
	}

}
