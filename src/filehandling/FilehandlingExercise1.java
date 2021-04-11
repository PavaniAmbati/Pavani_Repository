package filehandling;

import java.io.File;
import java.io.IOException;
import java.io.FileReader;
import java.io.FileWriter;

public class FilehandlingExercise1 {
	
		
	public static void main(String args[]) {
		try {
		File file = new File("C://Pavani//Myfile.txt");
		file.createNewFile();
		System.out.println("New file created");
		
		String data = "Happy Days";
		FileWriter output = new FileWriter("C://Pavani//Myfile.txt");
		output.write(data);
		System.out.println("Data written in file");
		
		for(int i=1;i<6;i++) {
		output.append("\n"+"Hi");
		}
		output.close();
		
		char[] text = new char[100];
		FileReader filereader = new FileReader("C://Pavani//Myfile.txt");
		filereader.read(text);
		System.out.println(text);
		filereader.close();
		System.out.println("Data read");
		
		if (file.exists()) {
			file.delete();
		System.out.println("File deleted");
		}
		else {
			System.out.println("file not found");
		}
		
		}catch (IOException e) {
			e.printStackTrace();
			}
		finally {
					System.out.println("File closed");
			
		}

	}
}
	

	

