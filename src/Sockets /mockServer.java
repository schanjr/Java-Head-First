package sockets;

import java.io.*;
import java.net.*;




class DailyAdviceServer{
	
	

	/**
	 * 
	 * A list of quotes to be printed out to the client. Quotes will be passed into the PrinterWriter() method. 
	 */
	String [] adviceList = {"Take a smaller bites", "Go for the tight jeans. No they do not make you look fat.","One word: inappropriate", "Just for today, be honest. Tell your boss what you *really* think", "You might want to rethink that haircut."};

	/**
	 * Binds the local host port 4243 and begins accepting connection. Once port is enabled, Server sends one advice and drops the connection. 
	 */
	public void go(){
		
		try {
			ServerSocket ss = new ServerSocket(4243);
			
			while (true) {
				Socket sock = ss.accept();
				int portNum=sock.getPort();

				
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
	/**
	 * @return generates a random quote from the list of quotes.
	 */
	private String getAdvice(){
		int random = (int) (Math.random() * adviceList.length);
		return adviceList[random];
	}
}

/**
 * @since 10.30.2015
 * @author chanst
 */
 
public class mockServer {

	/**
	 *Mocks as if running on a Server. If executed, this class will bind to port "4243" and accept connections from clients while printing one of the random
	 *quotes.
	 */
	public static void main(String[] args) {
		DailyAdviceServer server = new DailyAdviceServer();
		server.go();

	

	}

}
