package beans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

//CRUD중심으로 기능을 정의
//데이터와 관련된 작업(Data Access object:DAO)
public class MemberDAO {
	// 기능을 정의할때는 메서드(함수)를 사용
	// create메서드 호출시 입력 값을 받아주는 중간 매개체 역할의 변수
	// =>매개변수(parameter,파라메터)
	
	PreparedStatement ps;
	Connection con;
	ResultSet rs;

	public MemberDAO() throws Exception {
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
	
	// 전체 검색
		public List<MemberVO> all() throws Exception {
			// 가방을 넣는 컨테이너 역할을 하게 됨.!
			// <>안에는 컨테이너에 무엇을 넣을 지정!
			// 3. sql문을 만든다.
			String sql = "select * from member ";
			// select * from member where id = 'park' //setString
			// select * from bbs where no = 1 //setInt
			ps = con.prepareStatement(sql);
	        // 4. sql문은 전송
			// select의 결과는 검색결과가 담긴 테이블(항목+내용)
			// 내용에는 없을 수도 있고, 많은 수도 있음.
			System.out.println("3.sql생성 성공!!");
			rs = ps.executeQuery();
			System.out.println("4. SQL문 전송 성공.!!");
			List<MemberVO> list = new ArrayList<MemberVO>();//업캐스팅
			while (rs.next()) { // 결과가 있는지 없는지 체크해주는 메서드
				//Object(vo) Relational DB(row) Mapping(ORM)   // row=한 행  
				MemberVO bag = new MemberVO();// 가방만들어서,
	            bag.setId(rs.getString("id"));// 커서(위치를 알려주는 역할)
				bag.setPw(rs.getString("pw"));
				bag.setName(rs.getString("name"));
				bag.setTel(rs.getString("tel"));
				// 컨테이너 넣기
				list.add(bag);
	        }
			con.close();
			ps.close();
			rs.close();
			return list;
			// bag은 참조형 변수, 주소를 전달!
		}
		// 조건 검색
		public List<MemberVO> all(String tel) throws Exception {
			// 가방을 넣는 컨테이너 역할을 하게 됨.!
			// <>안에는 컨테이너에 무엇을 넣을 지정!
			// 3. sql문을 만든다.
			String sql = "select * from member where tel = ?";
			// select * from member where id = 'park' //setString
			// select * from bbs where no = 1 //setInt
			ps = con.prepareStatement(sql);
			ps.setString(1, tel);
			// 4. sql문은 전송
			// select의 결과는 검색결과가 담긴 테이블(항목+내용)
			// 내용에는 없을 수도 있고, 많은 수도 있음.
			System.out.println("3.sql생성 성공!!");
			rs = ps.executeQuery();
			System.out.println("4. SQL문 전송 성공.!!");
			List<MemberVO> list = new ArrayList<MemberVO>();// 업캐스팅
			while (rs.next()) { // 결과가 있는지 없는지 체크해주는 메서드
				// Object(vo) Relational DB(row) Mapping(ORM) // row=한 행
				MemberVO bag = new MemberVO();// 가방만들어서,
				bag.setId(rs.getString("id"));// 커서(위치를 알려주는 역할)
				bag.setPw(rs.getString("pw"));
				bag.setName(rs.getString("name"));
				bag.setTel(rs.getString("tel"));
				// 컨테이너 넣기
				list.add(bag);
			}
			con.close();
			ps.close();
			rs.close();
			return list;
			// bag은 참조형 변수, 주소를 전달!
		}

		// 부분 검색
		public List<MemberVO> all2(String tel) throws Exception { //파라미터 = 매개변수
			// 가방을 넣는 컨테이너 역할을 하게 됨.!
			// <>안에는 컨테이너에 무엇을 넣을 지정!
			// 3. sql문을 만든다.
			String sql = "select * from member where tel like'" + tel + "%'";
			
			ps = con.prepareStatement(sql);
			// 4. sql문은 전송
			// select의 결과는 검색결과가 담긴 테이블(항목+내용)
			// 내용에는 없을 수도 있고, 많은 수도 있음.
			System.out.println("3.sql생성 성공!!");
			rs = ps.executeQuery();
			System.out.println("4. SQL문 전송 성공.!!");
			List<MemberVO> list = new ArrayList<MemberVO>();// 업캐스팅
			while (rs.next()) { // 결과가 있는지 없는지 체크해주는 메서드
				// Object(vo) Relational DB(row) Mapping(ORM) // row=한 행
				MemberVO bag = new MemberVO();// 가방만들어서,
				bag.setId(rs.getString("id"));// 커서(위치를 알려주는 역할)
				bag.setPw(rs.getString("pw"));
				bag.setName(rs.getString("name"));
				bag.setTel(rs.getString("tel"));
				// 컨테이너 넣기
				list.add(bag);
			}
			con.close();
			ps.close();
			rs.close();
			return list;
			// bag은 참조형 변수, 주소를 전달!
		}
		
	
	
	
   //create
	public void create(String id, String pw, String name, String tel) throws Exception {

		String sql = "insert into member values(?,?,?,?)";
		con.prepareStatement(sql);
		ps.setString(1, id);
		ps.setString(2, pw);
		ps.setString(3, name);
		ps.setString(4, tel);
		System.out.println("3.sql생성 성공!!");
		// 4.sql문은 전송
		ps.executeUpdate();
		System.out.println("4.sql문 전송 성공!!");
		ps.close();
		con.close();
	}

	public boolean create(MemberVO bag) throws Exception {

		String sql = "insert into member values(?,?,?,?)";
		ps = con.prepareStatement(sql);
		ps.setString(1, bag.getId());
		ps.setString(2, bag.getPw());
		ps.setString(3, bag.getName());
		ps.setString(4, bag.getTel());
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

	// read

   //id 중복체크
	public int read(String id) throws Exception {

		String sql = "select * from member where id=?";
		ps = con.prepareStatement(sql);
		ps.setString(1, id);

		System.out.println("3.sql생성 성공!!");

		// 4.sql문은 전송
		rs = ps.executeQuery();
		System.out.println("4.sql문 전송 성공!!");
		int result = 0; // 없음
		if (rs.next() == true) { // 결과가 있는지 없는지 체크해주는 메서드
			System.out.println("검색결과가 있어요");
			result = 1; // 있음
//			String id2 = rs.getString("id");
//			String pw = rs.getString("pw");
//			String name = rs.getString("name");
//			String tel = rs.getString("tel");

		} else {
			System.out.println("검색 결과가 없어요");
		}
		
		ps.close();
		con.close();
		rs.close();
		return result; // 0이 넘어가면, 검색결과 없음
						// 1이 넘어가면, 검색결과 있음
		

	}
	// id중복체크2

	public MemberVO one(String id) throws Exception {

		String sql = "select * from member where id=?";
		ps = con.prepareStatement(sql);
		ps.setString(1, id);

		System.out.println("3.sql생성 성공!!");

		// 4.sql문은 전송
		rs = ps.executeQuery();
		System.out.println("4.sql문 전송 성공!!");
		MemberVO bag = new MemberVO();// 가방 생성
		if (rs.next() == true) { // 결과가 있는지 없는지 체크해주는 메서드
			System.out.println("검색결과가 있어요");

			String id2 = rs.getString("id");
			String pw = rs.getString("pw");
			String name = rs.getString("name");
			String tel = rs.getString("tel");
			// 가방에 넣기
			bag.setId(id2);
			bag.setPw(pw);
			bag.setName(name);
			bag.setTel(tel);

		} else {
			System.out.println("검색 결과가 없어요");
		}
		ps.close();
		con.close();
		rs.close();
		return bag;
		// bag은 참조형변수, 주소를 전달!

	}

	// id pw맞는지 로그인 처리

	public boolean read(String id, String pw) throws Exception {

		String sql = "select * from member where id=? and pw=?";
		ps = con.prepareStatement(sql);
		ps.setString(1, id);
		ps.setString(2, pw);

		System.out.println("3.sql생성 성공!!");

		// 4.sql문은 전송
		rs = ps.executeQuery();
		System.out.println("4.sql문 전송 성공!!");

		boolean result = false; // 없음
		if (rs.next() == true) { // 결과가 있는지 없는지 체크해주는 메서드
			System.out.println("로그인 ok");
			result = true; // 있음
		} else {
			System.out.println("로그인 not");
		}
		ps.close();
		con.close();
		rs.close();
		return result;
		// false면 로그인not
		// true면 로그인ok

	}

	// update

	public boolean update(MemberVO vo) throws Exception {

		String sql = "update member set pw=?,name=?,tel=? where id=?";
		ps = con.prepareStatement(sql);
		ps.setString(1, vo.getPw());
		ps.setString(2, vo.getName());
		ps.setString(3, vo.getTel());
		ps.setString(4, vo.getId());

		System.out.println("3.sql생성 성공!!");
		// 4.sql문은 전송
		int row = ps.executeUpdate();
		System.out.println("4.sql문 전송 성공!!");
		ps.close();
		con.close();
		boolean result = false;
		if(row==1) {
			result = true;
		}
		return result;
	}
	
	//delete

	public boolean delete(String id) throws Exception {

		String sql4 = "delete from member where id=?";
		ps = con.prepareStatement(sql4);
		ps.setString(1, id);
		System.out.println("3.SQL생성 성공");

		int row = ps.executeUpdate();
		System.out.println("4.SQL 전송 성공");
		ps.close();
		con.close();
		boolean result = false;
		if(row==1) {
			result = true;
		}
		return result;
		

	}

}
