package by.javatr.task1.util;

public class FillingArray {

	public static Array fillWithRandomNumbers(int countOfElement, int minValue, int maxValue){ 
		Array array = new Array();
		for (int i = 0; i < countOfElement; i ++) {
			int number = (int) ((Math.random()*(maxValue-minValue)) + minValue);
			array.add (number);
		}
		return array;
	}
}
