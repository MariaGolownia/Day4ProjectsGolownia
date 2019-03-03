package by.javatr.task1.util;
//Создание типа Array, который является классом оболочкой над массивом целого типа. 
//В данном типе должны быть реализованы конструкторы
//(позволяющие несколькими способами создавать объекты типа), 
//get-ы, set-ы и переопределенные методы класса Object (toString(), equals(), hasCode()).

import java.util.Arrays;

public class Array  {
	private int [] array;
	private Boolean ifConstructorByLength; 
	// Переменная нужна для случая использования контруктора, принимающего длину массива
	//(помогает сигнализировать об автоматическом заполнении массива нулями)
	
	public Array() {
		super();
		this.ifConstructorByLength = false;
		this.array = null;
	}

	public Array(int length) {
		this.ifConstructorByLength = true;
		this.array = new int[length];
	}

	public Array(int[] array) {
		super();
		this.ifConstructorByLength = false;
		this.array = array;
	}
	
	public int[] getArray() {
		return (int[])array.clone();
	}

	public void setArray(int[] array) {
		this.array = array;
	}
	

	public void add(int ...elements) {
		int lengthOfNewArray;
		if (this.array == null || ifConstructorByLength) {
			lengthOfNewArray = elements.length;
			int [] newArray = new int [lengthOfNewArray];
			for (int i = 0; i < lengthOfNewArray; i++) {
				newArray[i] = elements[i];
				this.array = newArray;
			}
		}
		else {
			lengthOfNewArray = this.array.length + elements.length;
			int [] newArray = new int [lengthOfNewArray];
			for (int i = 0; i < this.array.length; i++) {
				newArray[i] = this.array[i];
			}
			int j = 0;
			for (int i = this.array.length; i < lengthOfNewArray; i++) {
				newArray[i] = elements[j];
				j++;
				this.array = newArray;
			}
		}
	}

		public void remove(int indexOfElement) {
			int [] newArray = new int [this.array.length - 1];
			int k = 0;
				for (int i = 0; i < this.array.length; i++) {
					if (i != indexOfElement) {
						newArray[k] = this.array[i];
						k++;
				}
			}
				this.array = newArray;
		}


	public int get (int index) {
		int element = 0;
		for (int i = 0; i < this.array.length; i++) {
			if (i == index) {
				element = this.array[i];
			}
		}
		return element;
	}
	
	public void set (int index, int value) {
		for (int i = 0; i < this.array.length; i++) {
			if (i == index) {
				this.array[i] = value;
			}
		}
	}

	@Override
	public String toString() {
		return "Array {array=" + Arrays.toString(array) + "}";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(array);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Array other = (Array) obj;
		if (!Arrays.equals(array, other.array))
			return false;
		return true;
	}

	public void clear() {
		this.array = null;
	}

	public int length() {
		return this.array.length;
	}
}
