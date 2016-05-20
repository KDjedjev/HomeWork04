package task07;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int a[] = { 52, 21, 32, 6, 2, 14 };
		Scanner in = new Scanner(System.in);
		System.out.print("Koe chislo da tursq : ");
		int n = in.nextInt();
		for (int i = 0; i < a.length; i++) {
			if (a[i] == n) {
				System.out.print("Indeksut na chisloto " + n + " e " + i);
			}
		}

	}

}
