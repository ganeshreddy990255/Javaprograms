package filehandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class fileops1 {
	public static void main(String[] args) throws IOException {
		String input_path = "C:\\JavaPrograms\\Input.txt";
		String output_path = "C:\\JavaPrograms\\Output";
		
		FileInputStream fis = new FileInputStream (input_path);
		int temp;
		FileOutputStream fos = new FileOutputStream(output_path);
		
		while((temp=fis.read())!=-1) {
			fos.write(temp);
			
		}
		fos.close();
		fis.close();
		}

}
