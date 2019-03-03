package by.javatr.task1.util;
import java.util.ArrayList;
import java.util.List;

public class ActionWithArray {

	public static Integer defineSum (Array array) {
		Integer sum = 0;
		for (int i = 0; i < array.length(); i++) {
			sum += array.get(i);
		}
		return sum;
	}

	public static Double defineAverage (Array array) {
		Double average = 0.0;
		for (int i = 0; i < array.length(); i++) {
			average+=array.get(i);
		}
		average = average/array.length();
		return average;
	}

	public static Integer defineMin(Array array){
		Integer tempMin =  array.get(0);
		for (int i = 0; i < array.length(); i++) {
			if (array.get(i) < tempMin)
				tempMin = array.get(i);
		}
		return tempMin;
	}


	public static Integer defineMax(Array array){
		Integer tempMax = array.get(0);
		for (int i = 0; i < array.length(); i++) {
			if (array.get(i) > tempMax)
				tempMax = array.get(i);
		}
		return tempMax;
	}


	// Поиск простых чисел 
	public static List <Integer> definePrimeNumbers (Array array) {
		List  <Integer> list = new ArrayList<>();
		for (int i = 0; i < array.length(); i++) {
			int elementForCheck = array.get(i);
			if (ActionWithArray.isPrimeNumber(elementForCheck)) {
				list.add(elementForCheck);
			}
		}	
		return list;
	}

	public static Boolean isPrimeNumber (int number) {
		Boolean isPrime = true;
		for (int i = 2; i <= number/2; i++) {
			if (number %i == 0) {
				return !isPrime;
			}
		}
		return isPrime;
	}
	
	// Поиск чисел Фибоначии
	public static List <Integer> defineFibNumbers (Array array) {
		List  <Integer> list = new ArrayList<>();
		for (int i = 0; i < array.length(); i++) {
			int elementForCheck = array.get(i);
			if (Fibonacci.isFibonacciNumber(elementForCheck)) {
				list.add(elementForCheck);
			}
		}	
		return list;
	}

}
