package collections;


import java.io.*;

import java.util.*;

public class ModifyComparable {
	ArrayList songList = new ArrayList();
	
	
	
	public static void main(String[] args) {
		ModifyComparable test = new ModifyComparable();
		test.beginReadFile();
	}

	
	void beginReadFile() {
		
		File file = new File("C:\\Users\\t_chanst\\Desktop\\Codes\\GitHub\\Java-Head-First\\src\\collections\\", "SongList.txt");
		try {
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String line = null;
			while((line=reader.readLine())!=null) {
				String[] tokens = line.split("/");
				System.out.println(tokens[0]);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}

class SongObj{
	String name,artist,clicks,bpm;
	SongObj(String n, String a, String c, String b){
			this.name=n;
			this.artist=a;
			this.clicks=c;
			this.bpm=b;
	}
	
	public String toString() {
		return this.name+" by "+this.artist;
	}
}


