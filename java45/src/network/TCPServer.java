package network;

import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		// 1. 연결 요청만 담당하는 서버용 socket필요
		// prototype(포로토타입) 방법 <-> singletone(싱글톤)
		// 필요할때마다 객체 생성 <-> 하나만 객체 생성 주소를 재사용 
		ServerSocket server = new ServerSocket(9100); //localhost 9100 서버를 생성
		System.out.println("TCP 서버 시작됨");
		System.out.println("클라이언트의 요청을 기다리는중....");
		int count = 0; //몇명의 클라이언트가 있는지
		while (true) {
			Socket socket = server.accept(); 
			System.out.println(count+"번 클라이언트와의 연결 성공");
			count ++;
			
			PrintWriter out = new PrintWriter(socket.getOutputStream(),true);
			out.println("나는 자바프로그래머다");
		}
		
	}

}
