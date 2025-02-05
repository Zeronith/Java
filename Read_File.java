package testing;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Read_File {
	public static void main(String [] args)
	{
		// How to read file using Java (3 popular options)
		
		// BufferedReader + FileReader = Best for reading text files , line by line
		// FileInputStream = Best for binary files (images, audio files)
		// RandomAccessFile = Best for read/write specific portion of large file
		
		String file_path = "C:\\Users\\Dell\\OneDrive - "
							+ "National University of Mongolia"
							+ "\\Desktop\\Personal\\Coding\\Java\\"
							+ "JavaTutorial\\src\\testing\\test.txt";
		
		try(BufferedReader reader = new BufferedReader(new FileReader(file_path)))
		{
			System.out.println("Successfully Reads File , Sir");
			String line;
			while((line = reader.readLine())!= null)
			{
				System.out.println(line);
			}
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File Not Found , Sir");
		}
		catch(IOException e)
		{
			System.out.println("About input and output something is wrong , Sir");
		}
		catch(java.lang.Exception e)
		{
			System.out.println("Something is wrong , Sir");
		}
	}
}
