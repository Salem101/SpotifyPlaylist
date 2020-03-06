import java.io.*;
import java.util.*;

public class Spotify2 {
	public static void main(String[] args) throws Exception {
		// We need to provide file path as the parameter:
		// double backquote is to avoid compiler interpret words
		// like \test as \t (ie. as a escape sequence)
		File file1 = new File("C:\\Users\\rivka\\OneDrive\\Documents\\CodeFiles\\Stats1.csv");
		File file2 = new File("C:\\Users\\rivka\\eclipse-workspace\\Rivka 2019\\src\\A2\\Stats2.csv");

		ArrayList<String> tracks = new ArrayList<String>();

		ArrayList<File> myFiles = new ArrayList<File>();
		myFiles.add(file1);
		myFiles.add(file2);
		for (int i = 0; i < myFiles.size(); i++) {
			BufferedReader br = new BufferedReader(new FileReader(myFiles.get(i)));

			String line;
			while ((line = br.readLine()) != null) {
				String[] info = line.split(",");

				String tr = info[1];
				tracks.add(tr);

			}
			br.close();
		}
		//System.out.println(tracks);
		Queue <String> playlist = new LinkedList<String>();
		//loop for counting
		int counter =1;
		for(int j=0; j<tracks.size(); j++) {
			playlist.add(tracks.get(j));
			System.out.println(counter + tracks.get(j));
			counter++;
		}
		//Each time a song is played you add it to the stack and to find the last played song you just peek.
		Stack <String> songHistory = new Stack<String>(); 
		//songHistory.push();
		String head = songHistory.peek(); 
		System.out.println("Last played song: " +head);
		
		//method to get song
	}
}
