package filehandeling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class BufferedReaderExample {

	public static void main(String[] args) throws Exception {
		String fileName = "example.txt";
		
		try {
			BufferedReader reader = new BufferedReader(new FileReader (fileName));
			
			// While usinng the buffer reader it will read the line so we can store the value in String 
			String line;
			
			
			
			  while((line=(reader.readLine()))!=null) {
				  
				  
			  System.out.println(line);
			  }
			 
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
