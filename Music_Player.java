package testing;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Music_Player {
	public static void main(String[] args)
	{
		// How to PLAY AUDIO with Java (.wav , .au, .aiff)
		String file_path = "C:\\Users\\Dell\\OneDrive - National University of Mongolia\\Desktop\\BoyWithUke - Burn (Lyric Video).wav";
		File file = new File(file_path); // creating file object of our audio using file_path
		
		try(Scanner scanner = new Scanner(System.in);
				AudioInputStream  audioStream = AudioSystem.getAudioInputStream(file)) // file to audio file
		{	
			Clip clip = AudioSystem.getClip(); 
			clip.open(audioStream); // starting audio file
			String responce = "";
			System.out.println("No problems detected");
			while(!responce.equals("Q"))
			{
				System.out.print("P == Play\nS == Stop\nR == Reset\nQ == Quit\n");
				System.out.print("Please enter your choice :");
				
				responce = scanner.next().toUpperCase();
				
				if(responce.equals("P"))
				{
					clip.start();
				}
				else if(responce.equals("S"))
				{
					clip.stop();
				}
				else if(responce.equals("Q"))
				{
					clip.close();
				}
				else if(responce.equals("R"))
				{
					clip.setMicrosecondPosition(0);
				}
				else
				{
					System.out.println("Invalid Choice");
				}
				
				
				
				
			/*	switch(responce)
				{
				case "P" -> clip.start();
				case "S" -> clip.stop();
				case "R" -> clip.setMicrosecondPosition(0);
				case "Q" -> clip.close();
				default -> System.out.println("invalid choice");
 				} */
			}
		}
		catch(FileNotFoundException e)
		{
			System.out.println("Could not locate file");
		}
		catch(LineUnavailableException e)
		{
			System.out.println("Unable to access audio resource");
		}
		catch(UnsupportedAudioFileException e)
		{
			System.out.println("Audio File is not supported");
		}
		catch(IOException e)
		{
			System.out.println("Something went wrong");
		}
		finally
		{
			System.out.println("Finally");
		}
	}
}
