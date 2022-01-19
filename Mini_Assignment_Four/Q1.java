package Mini_Assignment_Four;
import java.io.*;


public class Q1 {
	public static void main (String[] args) {
		//try block 
		try {
			
			//initialize all count variables to zero 
			int wordCount = 0;
			int characterCount = 0;
			int lineCount = 0;
			
			//construct file object, pass in argument from command line
			File f = new File(args[0]);
			
			//wrap FileInputStream with a bufferedReader to convert byte stream to char sequences
			BufferedReader reader = new BufferedReader(new FileReader(f));
			String line;
			
			//while there is text to read, read one line at a time 
			while((line = reader.readLine()) != null)
	        {
					//increase lineCount by one for each line read 
					lineCount++;
					
					//add the length of the line to character count to get the number of characters in the file 
					//Note: this program does not count newlines as characters!
	                characterCount += line.length();
	                  
	                //split the words using a space
	                String[] words = line.split(" ");
	                  
	                //increase the word count for each word
	                wordCount += words.length;	                
	                
	        // close the reader
	        } reader.close();
	           
	        //print the character,word and line count
	        System.out.println("File " + f.getName() + " has:");	          
		    System.out.println(characterCount + " characters");	          
	        System.out.println(wordCount + " words");
	        System.out.println(lineCount +  " lines");

	    
	    //catch block to print stack Trace if there is an IOException
		}catch(IOException ex) {
			ex.printStackTrace();
		}
	}
}