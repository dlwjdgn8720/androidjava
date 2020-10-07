package network;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;


public class UDPSender {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		DatagramSocket socket = new DatagramSocket();
		String str = "나는 안드로이드 프로그래머이다";  
		
		byte[] data = str.getBytes();
		InetAddress ip = InetAddress.getByName("127.0.0.1");
		
		DatagramPacket packet = new DatagramPacket(data,data.length,ip,7100);
		
		socket.send(packet);
		socket.close();
	}

}
