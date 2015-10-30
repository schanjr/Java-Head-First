package testJava;

import java.net.*;
import java.io.*;

class DailyAdviceClient{
	public void go(){
		
		try {
			Socket sock = new Socket("127.0.0.1",4243);
			InputStreamReader input = new InputStreamReader(sock.getInputStream());
			BufferedReader reader = new BufferedReader(input);
			
			String advice=reader.readLine();
			System.out.println("Today's advice: "+ advice);
			reader.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

public class mockClient {

	public static void main(String[] args) {
		DailyAdviceClient getAdvice = new DailyAdviceClient();
		getAdvice.go();

	}

}
