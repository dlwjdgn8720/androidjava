package bean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class BbsDAO {
	Connection con;
	PreparedStatement ps;
	ResultSet rs;

	public BbsDAO() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1.connector연결성공!!");
		// 2.db연결
		String url = "jdbc:mysql://localhost:3366/mega?useUnicode=true&characterEncoding=utf8";
		String user = "root";
		String password = "1234";
		con = DriverManager.getConnection(url, user, password);
		System.out.println("2.db연결 성공!!");
	}

	public boolean create(BbsVO bag) throws Exception {
		// DB프로그램 절차에 맞추서 코딩
		// 1.connector 설정

		String sql = "insert into bbs values(?,?,?,?)";
		ps = con.prepareStatement(sql);
		ps.setInt(1, bag.getNo());
		ps.setString(2, bag.getTitle());
		ps.setString(3, bag.getContent());
		ps.setString(4, bag.getWritter());
		System.out.println("3.sql생성 성공!!");
		// 4.sql문은 전송
		int row = ps.executeUpdate();
		System.out.println("4.sql문 전송 성공!!");
		boolean result = false;
		
		if(row==1) {
			result = true;
		}
		con.close();
		ps.close();
		
		return result;

	}

	// 하나만 검색
	public BbsVO one(int no) throws Exception {

		// 3. sql문을 만든다.
		String sql = "select * from bbs where no = ?";
		// select * from member where id = 'park' //setString
		// select * from bbs where no = 1 //setInt
		ps = con.prepareStatement(sql);
		ps.setInt(1, no);

		// 4. sql문은 전송
		// select의 결과는 검색결과가 담긴 테이블(항목+내용)
		// 내용에는 없을 수도 있고, 많은 수도 있음.
		rs = ps.executeQuery();
		System.out.println("4. SQL문 전송 성공.!!");
		BbsVO bag = new BbsVO();// 가방만들어서,
		if (rs.next()) { // 결과가 있는지 없는지 체크해주는 메서드
			System.out.println("검색결과가 있어요.");
			int no2 = rs.getInt("no");
			String title = rs.getString("title");
			String content = rs.getString("content");
			String writer = rs.getString("writter");
			// 가방에 넣기
			bag.setNo(no2);
			bag.setTitle(title);
			bag.setContent(content);
			bag.setWritter(writer);

		} else {
			System.out.println("검색결과가 없어요.");
		}
		con.close();
		ps.close();
		rs.close();
		return bag;
		// bag은 참조형 변수, 주소를 전달!
	}

	// 전체 검색
	public ArrayList<BbsVO> all() throws Exception {
		// 가방을 넣는 컨테이너 역할을 하게 됨.!
		// <>안에는 컨테이너에 무엇을 넣을 지정!
		ArrayList<BbsVO> list = new ArrayList<BbsVO>();

		// 3. sql문을 만든다.
		String sql = "select * from bbs ";
		// select * from member where id = 'park' //setString
		// select * from bbs where no = 1 //setInt
		ps = con.prepareStatement(sql);

		// 4. sql문은 전송
		// select의 결과는 검색결과가 담긴 테이블(항목+내용)
		// 내용에는 없을 수도 있고, 많은 수도 있음.
		System.out.println("3.sql생성 성공!!");
		rs = ps.executeQuery();
		System.out.println("4. SQL문 전송 성공.!!");

		while (rs.next()) { // 결과가 있는지 없는지 체크해주는 메서드
			BbsVO bag = new BbsVO();// 가방만들어서,
			System.out.println("검색결과가 있어요.");
			int no2 = rs.getInt("no");
			String title = rs.getString("title");
			String content = rs.getString("content");
			String writer = rs.getString("writter");
			// 가방에 넣기
			bag.setNo(no2);// 커서(위치를 알려주는 역할)
			bag.setTitle(title);
			bag.setContent(content);
			bag.setWritter(writer);
			// 컨테이너 넣기
			list.add(bag);

		}
		con.close();
		ps.close();
		rs.close();
		return list;
		// bag은 참조형 변수, 주소를 전달!
	}

	public void update(String content, int no) throws Exception {

		// 3.sql문을 만든다.

		String sql = "update bbs set content=? where no=?";
		ps = con.prepareStatement(sql);

		ps.setString(1, content);
		ps.setInt(2, no);

		System.out.println("3.sql생성 성공!!");
		// 4.sql문은 전송
		ps.executeUpdate();
		System.out.println("4.sql문 전송 성공!!");
		con.close();
		ps.close();
	}

	public boolean delete(int no) throws Exception {

		String sql4 = "delete from bbs where no=?";
		ps = con.prepareStatement(sql4);
		ps.setInt(1, no);

		System.out.println("3.SQL생성 성공");

		int row = ps.executeUpdate();
		System.out.println("4.SQL 전송 성공");
		con.close();
		ps.close();
		boolean result = false;
		if(row==1) {
			result = true;
		}
		return result;

	}
}
