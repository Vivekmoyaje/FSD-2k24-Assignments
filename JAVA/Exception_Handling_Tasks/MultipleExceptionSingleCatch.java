package Exception_Handling_Tasks;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//Exercise 11: Handling Multiple Exceptions

//Write a Java program that demonstrates the handling of multiple exceptions with a single catch block.

public class MultipleExceptionSingleCatch {

	public static void main(String[] args) {

		FileInputStream fileInputStream = null;

		try {
			fileInputStream = new FileInputStream("file.txt");
			int data = fileInputStream.read();
			System.out.println("Read data : " + data);
		} catch (FileNotFoundException | IOException e) {
			System.err.println("Exception caught : " + e.getMessage());

		} finally {
			try {
				if (fileInputStream != null) {
					fileInputStream.close();
				}
			} catch (IOException e) {
				System.err.println("Error closing the file : " + e.getMessage());
			}
		}
	}

}
