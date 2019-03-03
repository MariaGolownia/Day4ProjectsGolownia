package by.javatr.task1.util;
import java.util.HashMap;
import java.util.Map;

public class Search {

	public static Map<Integer, Integer> binarySearchSeveralElements (int value, Array array, int left, int right) {
		Map<Integer, Integer> hashmap = new HashMap<Integer, Integer>();
		if (left == 0 && right == array.length()) {
			Sort.insertionSortByASC(array);}
		
		if (left > right)  {
			int temp = left;
			left = right;
			right = temp;
		}
		int mid = left + (right - left) / 2;

		if (value < array.get(mid)) {
			return binarySearchSeveralElements(value, array, left, mid - 1);
		} else if (value > array.get(mid)) {
			return binarySearchSeveralElements(value, array, mid + 1, right);
		} else {
			hashmap.put(mid, array.get(mid));
			// ƒальнейший код дл€ предусморени€ случа€, когда в массиве несколько чисел с одинаковым значением
			for (int i = mid + 1; i < array.length(); i ++) {
			if (array.get(mid) == array.get(i))
			hashmap.put(i, array.get(i));
			}
			
			for (int i = mid - 1; i >= 0; i--) {
			if (array.get(mid) == array.get(i))
			hashmap.put(i, array.get(i));
			}
			return hashmap;		
		}		
	}
}
