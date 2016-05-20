package task05;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int a[] = { 20,55,12,4,5,6};
		Arrays.sort(a);		
		System.out.println("The index of the number is " +Arrays.binarySearch(a, 5));
	}

}
