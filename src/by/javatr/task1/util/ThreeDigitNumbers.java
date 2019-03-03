package by.javatr.task1.util;
import java.util.ArrayList;
import java.util.List;

public class ThreeDigitNumbers {
	private static  final int COUNT_OF_DIGIT_IN_NUMBER = 3;
	private static  final int MINIMUM_THREE_DIGIT_NUMBER = 100;
	private static  final int MAXIMUM_THREE_DIGIT_NUMBER = 1000;

	public static List<Integer> generateNumbersWithThreeDifferentDigits (){ 
		List <Integer> listOfNumbersWithDifferentDigits = new ArrayList<>();
		for (int i = MINIMUM_THREE_DIGIT_NUMBER; i < MAXIMUM_THREE_DIGIT_NUMBER; i ++) {
			int numberTemp = i;
			List <Integer> listOfNumbersDigits = new ArrayList<>();
			for (int j = 0; j < COUNT_OF_DIGIT_IN_NUMBER; j++) {
				int lastDigitOfNumber = numberTemp%10;	
				// Проверка на неповторяемость чисел в анализируемом числе
				if (!listOfNumbersDigits.contains(lastDigitOfNumber)) {
					listOfNumbersDigits.add(lastDigitOfNumber);
					numberTemp = numberTemp/10;
					// Если записали в listOfNumbersDigits все цифры числа и они прошли проверку на неповторяемость,
					//осуществляем добавление числа в listOfNumbersWithDifferentDigits
					if (listOfNumbersDigits.size() == COUNT_OF_DIGIT_IN_NUMBER) {
						listOfNumbersWithDifferentDigits.add(i);
						listOfNumbersDigits.clear();
					}
				}
			}
		}
		return listOfNumbersWithDifferentDigits;
	}

	public static List<Integer> selectNumbersWithThreeDiffDigits (Array array){ 
		List <Integer> listOfNumbersWithDifferentDigits = new ArrayList<>();
		for (int i = 0; i < array.length(); i++) {
			int numberTemp = array.get(i);
			// Проверка числа на трехзначность
			if (numberTemp < MINIMUM_THREE_DIGIT_NUMBER || numberTemp > MAXIMUM_THREE_DIGIT_NUMBER) {
				continue;
			}
			else {
				List <Integer> listOfNumbersDigits = new ArrayList<>();
				for (int j = 0; j < COUNT_OF_DIGIT_IN_NUMBER; j++) {
					int lastDigitOfNumber = numberTemp%10;	
					// Проверка на неповторяемость чисел в анализируемом числе
					if (!listOfNumbersDigits.contains(lastDigitOfNumber)) {
						listOfNumbersDigits.add(lastDigitOfNumber);
						numberTemp = numberTemp/10;
						// Если записали в listOfNumbersDigits все цифры числа и они прошли проверку на неповторяемость,
						//осуществляем добавление числа в listOfNumbersWithDifferentDigits
						if (listOfNumbersDigits.size() == COUNT_OF_DIGIT_IN_NUMBER) {
							listOfNumbersWithDifferentDigits.add(array.get(i));
							listOfNumbersDigits.clear();
						}
					}
					else {
						listOfNumbersDigits.clear();
						break;
					}
				}
			}
		}
		return listOfNumbersWithDifferentDigits;
	}

}
