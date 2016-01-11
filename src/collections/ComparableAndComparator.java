package collections;


import java.io.*;
import java.util.*;

/**
 * @author Stanley Chan
 *@Description - Use case here is to get a list text and the list by certain characteristics. In java there are two ways of sorting
 *Either sort by Comparable or Comparator. Basic idea is Comparable is implemented by adding an interface called "Comparable" to whatever class
 *that needs the sorting. This is great for packaging the class to sort by a default way.
 *Comparator is a "nested class" that needs to be created and can sort by developer's defined way. Interesting part here is that after 
 *implementing comparator, you get access to the methods of the original class that needs the sorting. 
 *
 *
 */
public class ComparableAndComparator {
	public static void main(String[] args) throws FileNotFoundException {
		
		ArrayList<Songs> SongList = new ArrayList<Songs>();
		File file = new File("C:/Users/Stanley Chan/Desktop/Codes/Git/Java-Head-First/src/collections/SongList.txt");
		
		class SortByArtist implements Comparator<Songs>{
			@Override
			public int compare(Songs o1, Songs o2) {
				System.out.println("------"+o1.getArtist().compareTo(o2.getArtist()));
				return o1.getArtist().compareTo(o2.getArtist());
			}
		}
		
		class SortByBPM implements Comparator<Songs>{

			@Override
			public int compare(Songs o1, Songs o2) {
				return -(o1.getBpm().compareTo(o2.getBpm()));
			}
			
		}
		
		try {
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String line = null;
			while ((line = reader.readLine()) != null) {
				String[] token = line.split("/");
				Songs songFromFile = new Songs(token[0], token[1], token[2], token[3]);
				SongList.add(songFromFile);

			}
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception o) {
			o.printStackTrace();
		}
		
		System.out.println("Before Sorting---"+SongList);
		Collections.sort(SongList); //Sorting using Comparable. Comparable is defined in the class itself. Look at the bottom!
		System.out.println("\nAfter Sorting---"+SongList); 
		Collections.sort(SongList,new SortByArtist()); //Sorting using Comparator
		System.out.println("\nSorting by Artist Name--"+SongList); 
		Collections.sort(SongList, new SortByBPM());
		System.out.println("\nSorting by BPM---"+SongList);
		
	
		
	}

}


class Songs implements Comparable<Songs>{
	String title, artist;
	String bpm;
	String rating;

	Songs(String t, String a, String r, String b) {
		title = t;
		artist = a;
		rating = r;
		bpm = b;
	}



	public String toString() {
		return title+"|"+artist+"|"+rating+"|"+bpm;
	}
	
	private String getTitle(){
		return title;
	}
	
	/*Notice ths one does not have the private modifier. This allows the comparator object to access its method. How? I don't know. I thought,
	this was a violation of the encapsulation rule. Apparently it isn't.
*/	
	String getArtist(){ 
		return artist;
	}
	
	Integer getRating(){
		
		int ratings = Integer.parseInt(rating);
		return ratings;
	}
	
	Integer getBpm(){
		int bpms = Integer.parseInt(bpm);
		return bpms;
	}
	@Override
	public int compareTo(Songs o) {
		return title.compareTo(o.getTitle());
	}
}
