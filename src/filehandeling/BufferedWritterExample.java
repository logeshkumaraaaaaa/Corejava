package filehandeling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWritterExample {

	public static void main(String[] args) {
		
		try {
			FileWriter writer = new  FileWriter("output.txt");
			BufferedWriter buffered = new BufferedWriter(writer);
			buffered.write("Logesh");
			System.out.println("Success");
			buffered.close();
		}
		
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
