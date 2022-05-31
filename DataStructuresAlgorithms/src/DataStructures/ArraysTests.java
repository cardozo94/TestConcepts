package DataStructures;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraysTests {
	
	public static void main(String[] args) {
		/* working with arrays
		int[] numbers = {10, 20, 30};
				/*new int[3];
		numbers[0] = 10;
		numbers[1] = 20;
		numbers[2] = 30;
		System.out.println(numbers.length);
		System.out.println(Arrays.toString(numbers));
		*/
		
		/* Building an Array
		 * Array numbers = new Array(3);
		numbers.insert(10);
		numbers.insert(20);
		numbers.insert(30);
		numbers.insert(40);
		numbers.print();
		numbers.removeAt(1);
		numbers.print();
		System.out.println(numbers.indexOf(300));*/
		
		// Dynamic arrays 
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		System.out.println(list);
		list.remove(0);
		System.out.println(list);
		
	}

}
