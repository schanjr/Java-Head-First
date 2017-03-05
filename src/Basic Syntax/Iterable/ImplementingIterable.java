package tutorial64;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;



public class ImplementingIterable {

	public static void main(String[] args) {
		
		/*
		UrlLibrary urlLibrary = new UrlLibrary();
		
		for(String html: urlLibrary){
			System.out.println(html.toString());
		}
		*/
		
		try {
			URL urlReader = new URL("http://www.google.com");
			BufferedReader br = new BufferedReader(new InputStreamReader(urlReader.openStream()));
			StringBuilder sb = new StringBuilder();
			while ( (br.readLine()) != null ) {
				sb.append(br.readLine());
			}
			System.out.println(sb);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		
	}

	
	
	
	
}
