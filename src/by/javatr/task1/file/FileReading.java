package by.javatr.task1.file;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import by.javatr.task1.exc.ValidationFileException;
import by.javatr.task1.util.Array;
import print.PrintToConsole;

public class FileReading  {
	final static String CONSTANT_SPACE = " "; 

	public static Array readFileDigitIntoString (String nameOfFile) throws IOException {
		Array array = new Array();                            
		File file = new File (nameOfFile);
		FileReader fileReader = null;
		BufferedReader bufferedReader = null;
		try {	
			fileReader = new FileReader(nameOfFile);
			bufferedReader = new BufferedReader (fileReader);
			if (ValidationFile.checkFile(file))	{
				String str;			
				while ((str = bufferedReader.readLine()) != null){
					for (String valueToParse  : str.split(CONSTANT_SPACE)){
						try {
							array.add(Integer.parseInt(valueToParse));
						} 
						catch (NumberFormatException exc) {
							PrintToConsole.println("Error reading data from the file: the file contains not only numbers!");
							exc.getMessage();
							exc.printStackTrace();
							break;}	
					}
				}
			}
			else throw new ValidationFileException ("Error accessing file! Check the file!");
		}
		catch (IOException ex) {
			System.out.println("File read error!" + ex.getMessage());}
		catch (ValidationFileException e) {
			e.printStackTrace();}
		finally {
			fileReader.close();
			bufferedReader.close();}
		return array;
	}
}
