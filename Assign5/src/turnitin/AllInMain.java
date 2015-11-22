package turnitin;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.SecurityException;
import java.nio.file.Paths;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class AllInMain {

	private static Formatter output;	//outputs text to a file
	private static Scanner input;		//inputs text from a file
	
	public static void main(String[] args) {
		
		Buttons JButtons = new Buttons();
		
		
		
		//opens the Reading FIle
		try{input = new Scanner(Paths.get("testing.txt"));}
		
		catch(IOException ioException)
			{System.err.println("Error opening file1. Terminating.");System.exit(1);}
		

		
		
		
		
		//opens the Writing File
		try{output = new Formatter("testingout.txt");}//open the file
		
		catch(SecurityException securityException)
			{System.err.println("Write permission denied. Terminating.");System.exit(1);}//terminates the program
		
		catch(FileNotFoundException fileNotFoundException)
			{System.err.println("Error opening file2. Terminating.");System.exit(1);}//terminate the program
		
		
		
		
		
		
		
		
		
		
		
		
		//Reads the File
		try{
				String firstword = input.next();
				String secondword = input.next();
				String thirdword = input.next();
				String fourthword = input.next();
				String sentence = firstword + " " + secondword + " " + thirdword + " " + fourthword;
				String SENTENCE = sentence.toUpperCase();
				
				String substring1 = SENTENCE.substring(5, 7);
				String substring2 = sentence.substring(15);
				String substrings = substring1 + substring1 + " " + substring2 + substring2;
				
				
				String replace = sentence.replace(firstword, fourthword);
				replace = replace.replace(secondword,  fourthword);
				replace = replace.replace(thirdword, fourthword);
				
				
//				System.out.println(sentence);
//				System.out.println(SENTENCE);
//				System.out.println(replace);
//				System.out.println(substrings);
				
				
				try{output.format(sentence + "%n" + SENTENCE + "%n" + replace + "%n" + substrings);} //should write to file backwards
				catch(FormatterClosedException formatterClosedException)
				{System.err.println("Error writing to file. Terminating.");}
			}//end try
		
		catch(NoSuchElementException elementException)
			{System.err.println("File improperly formed. Terminating.");}
		
		catch(IllegalStateException stateException)
			{System.err.println("Error reading from file. Terminating.");}
		
		
		
		
		
		
		
		
		//closes Read File
		if (input != null)
			input.close();
		
		//closes Write File
		if (output != null)
			output.close();
		
		
		
		
		
		
		JButtons.showButtonDemo(); //Literally Mandy's Demo with modifications made in the ActionListeners and Buttons deleted.
		
		
		
	}//end main

}//end class AllInMain
