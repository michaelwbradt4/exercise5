//Michael Bradt
//CS 110 Exercise 5
//With help from thenewboston on youtube

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Formatter;
import java.util.Scanner;
public class Filespractice {
	
	private Formatter theformatter;

	protected void openfile(){
		try{
			theformatter = new Formatter("thefile.txt");
		}//end try
		
		catch(Exception e){
			System.out.println("error?");
		}//end catch
	}//end method openfile
	
	protected  void addRecords(){
		theformatter.format("%s %s %s %s","HeLlO", "testing", "TESTING", "tEsTiNg");
	}//end method addRecords
	
	
	protected void closefile(){
		theformatter.close();
	}//end closefile
	
	
}//end class Filespractice