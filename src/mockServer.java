package testJava;

import java.io.*;
import java.net.*;


class DailyAdviceServer{
	String [] adviceList = {"Take a smaller bites", "Go for the tight jeans. No they do not make you look fat.","One word: inappropriate", "Just for today, be honest. Tell your boss what you *really* think", "You might want to rethink that haircut."};

	public void go(){
		
		try {
			ServerSocket ss = new ServerSocket(4243);
			while (true) {
				Socket sock = ss.accept();
				PrintWriter writer = new PrintWriter(sock.getOutputStream());
				String advice = getAdvice();
				writer.println(advice);
				writer.close();
				System.out.println(advice);
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	private String getAdvice(){
		int random = (int) (Math.random() * adviceList.length);
		return adviceList[random];
	}
}

public class mockServer {

	public static void main(String[] args) {
		DailyAdviceServer server = new DailyAdviceServer();
		server.go();

	}

}
