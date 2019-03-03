package by.javatr.task1.runner;
import java.io.IOException;
import by.javatr.task1.file.FileReading;
import by.javatr.task1.file.StartPath;
import by.javatr.task1.util.ActionWithArray;
import by.javatr.task1.util.Array;
import by.javatr.task1.util.FillingArray;
import by.javatr.task1.util.Search;
import by.javatr.task1.util.Sort;
import by.javatr.task1.util.ThreeDigitNumbers;
import print.PrintToConsole;
import scan.Scan;

public class Runner {


	public static void main(String[] args) throws IOException {

		// Первый способ вызова конструктора
		Array array1 = new Array();
		array1.add(1, 4, 2, 5, 3);
		PrintToConsole.println("1: " + array1.toString());
		
		array1.add(9, 10);
		PrintToConsole.println("1: " + array1.toString());

		array1.remove(2);
		PrintToConsole.println("1: " + array1.toString());

		 //Второй способ вызова конструктора
		int [] arr2 = new int [] {16, 17, 18, 19, 20};
		Array array2 = new Array(arr2);
		PrintToConsole.println("2: " + array2.toString());

		// Третий способ вызова конструктора
		Array array3 = new Array(5);
		array3.add(12, 15, 14, 13, 11);
		PrintToConsole.println("3: " + array3.toString());

		//Вызов сортировки пузырьком по возрастанию
		Sort.bubbleSortByASC(array1);
		PrintToConsole.println("Array 1 after bubble sort in increasing order:" + array1.toString());

		//Вызов сортировки пузырьком по убыванию
		Sort.bubbleSortByDECS(array1);
		PrintToConsole.println("Array 1 after bubble sort in decreasing order:" + array1.toString());

		//Вызов сортировки выбором по возрастанию
		Sort.selectionByASC(array1);
		PrintToConsole.println("Array 1 after selection sort in increasing order:" + array1.toString());

		//Вызов сортировки выбором по убыванию
		Sort.selectionByDECS(array1);
		PrintToConsole.println("Array 1 after selection sort in decreasing order:" + array1.toString());

		//Вызов сортировки вставками по возрастанию
		Sort.insertionSortByASC(array1);
		PrintToConsole.println("Array 1 after insertion sort in increasing order:" + array1.toString());

		//Вызов сортировки вставками по убыванию
		Sort.insertionSortByDECS(array1);
		PrintToConsole.println("Array 1 after insertion sort in deccreasing order:" + array1.toString());

		//Бинарный поиск
		Array array4 = new Array(new int [] {156, 14, 598, 598, 12, 1259});
		Sort.insertionSortByASC(array4);
		PrintToConsole.println("Array 4:" + array4.toString());
		PrintToConsole.println ("Search elements by binary search with value \"598\" (index/find value): " + Search.binarySearchSeveralElements(598, array4, 0, array4.length()));

		// Максимальный элемент
		PrintToConsole.println ("Value Of MAX elenent is: " + ActionWithArray.defineMax(array4));

		// Минимальный элемент
		PrintToConsole.println ("Value Of MIN elenent is: " + ActionWithArray.defineMin(array4));

		// Нахождение простых чисел
		Array array5 = new Array(new int [] {11, 17, 21, 24, 55});
		PrintToConsole.println("Array 5:" + array5.toString());
		PrintToConsole.println ("Prime numbers in array are: " + ActionWithArray.definePrimeNumbers(array5));

		// Нахождение  чисел Фибоначчи
		PrintToConsole.println ("Fibonacci numbers in array are: " + ActionWithArray.defineFibNumbers(array5));

		//Получение трехзначных чисел (из массива), в десятичной записи которых нет одинаковых цифр
		Array array6 = new Array(new int [] {115, 189, 22, 24, 687, 289});
		PrintToConsole.println("Array 6:" + array6.toString());
		PrintToConsole.println ("Getting three-digit numbers in the decimal notation of which there are no identical numbers: " + ThreeDigitNumbers.selectNumbersWithThreeDiffDigits(array6));

		//Генерация трехзначных чисел, в десятичной записи которых нет одинаковых цифр
		PrintToConsole.println ("Generation of all three-digit numbers in the decimal notation of which there are no identical digits: " + ThreeDigitNumbers.generateNumbersWithThreeDifferentDigits().toString());
		
		//Заполнение массива рандомными числами
		Array array7 = new Array();
		array7 = FillingArray.fillWithRandomNumbers(10, 22, 56);
		PrintToConsole.println("Filling array 7 with random numbers:" + array7.toString());
		
		//Заполнение массива числами из консоли, введенные через пробел
		Array arrayType8 = new Array();
		PrintToConsole.print("Enter integers separated by a space: ");
		arrayType8 = Scan.getIntNumbersFromConsole();
		PrintToConsole.println("Filling array 8 with console:" + arrayType8.toString());
			
	
		//Заполнение массива числами из файла
		Array arrayType9 = new Array();
		arrayType9 = FileReading.readFileDigitIntoString(StartPath.getURL() + "text.txt");
		PrintToConsole.println("Array 9 from file:" + arrayType9.toString());

	}
}
