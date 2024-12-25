package filehandeling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String fileName = "example.txt";
		
		try {
			FileReader reader = new FileReader(fileName);
			
			
			
			int i;
			
			while(	( i = reader.read()) !=-1) {
				
				
				System.out.print((char)i);
			}
			
			
			int a = 88;
			System.out.println((char)a);
			
			reader.close();
			
			/*
			 * int j = reader.read(); System.out.println(j);
			 * 
			 * int k = reader.read(); System.out.println(j);
			 */
			
			
		} 
		
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
