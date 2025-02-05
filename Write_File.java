package testing;

import java.io.FileWriter;
import java.io.IOException;

public class Write_File {
	public static void main(String[] args)
	{

		// How to write file using java (4 popular options )
		
		// FileWriter = Good for small or medium sized text files
		// BufferedWriter = Better performance for large amounts of text
		// PrintWriter = Best for structured data , like reports or logs
		// FileOutputStream = Best for binary files (e.g images, audio files)
		
		String file_path = "C:\\Users\\Dell\\OneDrive -"
				+ " National University of Mongolia\\Deskto"
				+ "p\\Personal\\Coding\\Java\\JavaTutorial\\src\\testing\\test.txt";
		
		String textContent = "i like pizza \nits really good thougth";
		
		try(FileWriter writer = new FileWriter(file_path))
		{
			writer.write(textContent);
			System.out.println("File has been written");
		}
		catch(IOException e)
		{
			System.out.println("Couldnt write file");
		}
		catch(java.lang.Exception e)
		{
			System.out.println("Something is wrong");
		}
	}
	
}
