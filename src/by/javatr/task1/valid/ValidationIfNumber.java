package by.javatr.task1.valid;

public class ValidationIfNumber {


	public static Boolean validateIfIntNumber (String valueString){
		String regex = "^[-+]?[0-9]+$";
		Boolean result = valueString.matches (regex);
		return result;
	}
	

}
