package DataStructures;

import java.util.Arrays;

public class Array {

	private int[] array;
	private int index;

	public Array(int length) {
		array = new int[length];
		index = 0;
	}

	public void insert(int item) {
		if (index == array.length) {
			array = Arrays.copyOf(array, array.length * 2);
		}
		array[index] = item;
		index++;
	}

	public void removeAt(int index) {
		if(index< 0 || index >= this.index) {
			throw new IllegalArgumentException();
		}else {
			for (int i = index; i < array.length-1; i++) {
				array[i] = array[i+1];
			}
			this.index--;
		}
		
	}

	public void print() {
		for (int i = 0; i < index; i++) {
			System.out.println(array[i]);
		}
	}

	public int indexOf(int value) {
		int index=-1;
		for (int i = 0; i < this.index; i++) {
			if(array[i] == value) {
				index = i;
				i = this.index;
			}
		}
		return index;
	}
}
