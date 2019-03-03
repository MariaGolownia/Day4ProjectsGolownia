package scan;
import java.util.Scanner;
import by.javatr.task1.exc.ExceptionNotIntNumber;
import by.javatr.task1.util.Array;
import by.javatr.task1.valid.ValidationIfNumber;


public class Scan {
	
	public static String getNextStringFromConsole () {
		Scanner scannerString = new Scanner(System.in);
		while (!scannerString.hasNext()){
			scannerString.nextLine();
		}
		return scannerString.next();
	}
	
	public static String getStringFromConsole () {
		Scanner scannerString = new Scanner(System.in);
		while (!scannerString.hasNext()){
			scannerString.nextLine();
		}
		return scannerString.nextLine();
	}
	
	public static Array getIntNumbersFromConsole () {
		Array array = new Array();
		String str = Scan.getStringFromConsole();
		String[] listString = str.trim().split("\\s+");	// Разделение по любому количеству пробелов, означает "по крайней мере, одно белое пространство"
		try {
			for (int i = 0; i < listString.length; i++) {
			Boolean ifNumber = ValidationIfNumber.validateIfIntNumber(listString[i].trim());
			if (ifNumber == false)	{
				throw new ExceptionNotIntNumber("Exception! The data you entered is not numbers!");	}		
			int number = Integer.parseInt(listString[i].trim());
			array.add(number);}
		}
		catch (ExceptionNotIntNumber ex) {
			ex.printStackTrace();
			ex.getMessage();
			return null;
			}
		return array;
	}

	public static int getNextIntFromConsole () {
		Scanner scannerInt = new Scanner(System.in);
		while (!scannerInt.hasNextInt()){
			scannerInt.nextLine();
		}
		return scannerInt.nextInt();
		
	}
	
	public static double getNextDoubleFromConsole () {
		Scanner scannerDouble = new Scanner(System.in);
		while (!scannerDouble.hasNextDouble()){
			scannerDouble.nextLine();
		}
		return scannerDouble.nextDouble();
	}
}
