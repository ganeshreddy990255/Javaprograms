package filehandling;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class fileops4 {
	public static void main(String[] args) throws IOException {
		String input_path = "C:\\JavaPrograms\\Input.txt";
		String output_path = "C:\\JavaPrograms\\Output1.txt";
		
		FileInputStream fis = new FileInputStream(input_path);
		BufferedInputStream bis = new BufferedInputStream(fis);
		int temp;
		FileOutputStream fos = new FileOutputStream(output_path);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		while((temp=bis.read())!=-1) {
			bos.write(temp);
			
		}
		bis.close();
		bos.close();
} 


}
