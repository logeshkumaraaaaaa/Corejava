package filehandeling;

import java.io.FileWriter;


public class FileWriterExample {

	public static void main(String[] args) {
		
		String fileName = "example.txt";
		
		
		try {
			FileWriter type = new FileWriter(fileName);
			
			type.write("Hello guys \n");
			
			type.write("Mechatronics \n");
						
			type.close();

			System.out.println("Success");
		} 
		
		
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Something has happened");
		}

		
	}

}
