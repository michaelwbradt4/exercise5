import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Formatter;
import java.util.Scanner;

public class Fileread {

/*	public Fileread(){
		readTheFile();
	}*/
	
	String Mackenzie;
	
	
	
	private Scanner read;
	
	public void openthefile(){
	
		try{
		read = new Scanner(new File("thefile.txt"));
	}//end try statement
	
	
		catch(Exception e){
		System.out.println("trouble finding file");
	}//end catch
	
	}//end method openfile

	
	public String readTheFile(){
		while(read.hasNext()){
			String a = read.next();
			String b = read.next();
			String c = read.next();
			String d = read.next();
			System.out.printf("%s %s %s %s", a, b, c, d);
			System.out.printf("%n%s","something" + a);
			System.out.printf("%n%s", a.toUpperCase());
			
			Mackenzie = a;
		}//end while
		return Mackenzie;
	}//end method readTheFile
	
	
	public void changethefile(){
	}// end method changethefile
	
	
	public void closethefile(){
		read.close();
	}
	
	
	
}//end class Fileread
