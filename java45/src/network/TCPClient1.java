package network;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

public class TCPClient1 {
   
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
	for(int i = 1; i<1000; i++) {
    Socket socket = new Socket("localhost",9100);
    System.out.println("client"+i+" 서버와 연결됨 ");
    BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
    String data = input.readLine();
    System.out.println("받은 데이터: "+data);
    
	}
    
	}

}
