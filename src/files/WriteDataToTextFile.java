package files;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDataToTextFile {

	public static void main(String[] args) throws IOException {

		FileWriter fw = new FileWriter("C:\\Users\\thamb\\OneDrive\\Documents\\text.txt");
		
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write("selenium with java");
		bw.write("java programs practice");
		
		System.out.println("Finished...");
		
		bw.close();
	}

}
