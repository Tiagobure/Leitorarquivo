package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Programa2 {

	public static void main(String[] args) {

		String patch = "c:\\teste\\nip.txt";
	//	FileReader fr = null;
	//	BufferedReader br = null;

		try (BufferedReader br = new BufferedReader(new FileReader(patch))){
			//fr = new FileReader(patch);
		   // br = new BufferedReader(fr);

			String line = br.readLine();

			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		} 
		
		
		/*finally {
			try {
				if (br != null) {
					br.close();
				}
				if (fr != null) {
					fr.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}*/

	}

}
