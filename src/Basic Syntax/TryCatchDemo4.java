package tutorial40;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

public class TryCatchDemo4 {
	public void run() throws IOException, ParseException {
		
		//throw new IOException("Ectcetera ");
		throw new ParseException("Error in command list.", 2);
	}
	
	public void input() throws FileNotFoundException, IOException {

	}

	
	
}
