package by.javatr.task1.util;
import java.util.List;

public class Sort {

	public static void swap (Array array, int a, int b){
		Integer tmp = array.get(a);
		array.set(a, array.get(b));
		array.set(b, tmp);
	}
	
	public static void swap (List <Integer> list, int a, int b){
		Integer tmp = list.get(a);
		list.set(a, list.get(b));
		list.set(b, tmp);
	}
	
	// ���������� ���������
	public static void bubbleSortByDECS(Array array){
		if (array == null || array.length() == 0 ||array.length() == 1) return;
		else{
			for(int i = 0;  i < array.length(); i++){
				for(int j = 0; j < array.length()-i-1; j++){
					if(array.get(j) < array.get(j + 1) ){
						swap(array, j, j + 1);}
				}
			}
		}
	}

	public static void bubbleSortByASC (Array array){
		if (array == null || array.length() == 0 || array.length() == 1) return;
		else{
			for(int i = 0;  i < array.length(); i++){
				for(int j = 0; j < array.length()-i-1; j++){
					if(array.get(j) > array.get(j + 1) ){
						swap(array, j, j + 1);}
				}
			}
		}
	}

	// ���������� �������
	public static void selectionByDECS (Array array){
		int maxValue;
		int indexOfMaxValue;   
		if (array == null || array.length() == 0 || array.length() == 1) return;
		else {
			for (int i = 0; i < array.length(); i++) {
				maxValue = array.get(i);
				indexOfMaxValue = i; 
				for (int j = i+1; j < array.length(); j++) {
					if (array.get(j) > maxValue) {
						maxValue= array.get(j);
						indexOfMaxValue= j;}
				}
				if (i != indexOfMaxValue) {
					int tmp = array.get(i);
					array.set(i, array.get(indexOfMaxValue));
					array.set(indexOfMaxValue, tmp);}
			}
		}
	}


	public static void selectionByASC(Array array){
		Integer minValue;
		int indexOfMinValue;   
		if (array == null || array.length() == 0 || array.length() == 1) return;
		else {
			for (int i = 0; i < array.length(); i++) {
				//������������, ��� ������ ������� � ������ ������������ ��������� �������� ����������� 
				minValue = array.get(i);
				indexOfMinValue = i; 
				//� ���������� ����� ������������ ���� �������,������� ������ ��������������� ��������*/
				for (int j = i+1; j < array.length(); j++) {
					//���� �������, ���������� ��� ������
					if (array.get(j) <minValue) {
						minValue= array.get(j);
						indexOfMinValue= j;}
				}
				/*���� ������� �������, �������, ��� �� ������� �������,������ �� �������*/
				if (i != indexOfMinValue) {
					Integer tmp = array.get(i);
					array.set(i, array.get(indexOfMinValue));
					array.set(indexOfMinValue, tmp);}
			}
		}
	}

	// ���������� ��������� �� �����������
	public static void insertionSortByASC(Array array){ 

		if (array == null || array.length() == 0 || array.length() == 1) return;
		else {
			for(int i = 0; i < array.length(); i++)     
				for(int j = i; j>0 && array.get(j-1)>array.get(j);j--) // ���� j>0 � ������� j-1 > j, x-������ int
					swap(array, j-1,j);
		}
	}
	
	// ���������� ��������� �� ��������
	public static void insertionSortByDECS (Array array){ 

		if (array == null || array.length() == 0 || array.length() == 1) return;
		else {
			for(int i = 0; i < array.length(); i++)     
				for(int j = i; j>0 && array.get(j-1) < array.get(j);j--) // ���� j>0 � ������� j-1 > j, x-������ int
					swap(array, j-1,j);
		}
	}
	
	// ���������� ���������� ��������� �� �����������
	public static void insertionSortinByASC (List <Integer> list){ 

		if (list == null || list.size() == 0 || list.size() == 1) return;
		else {
			for(int i = 0; i < list.size(); i++)     
				for(int j = i; j>0 && list.get(j-1) > list.get(j); j--) // ���� j>0 � ������� j-1 > j, x-������ int
					swap(list, j-1,j);
		}
	}
	
}

