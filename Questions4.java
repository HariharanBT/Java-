package homework;

import java.util.Scanner;

public class Questions4 {
	static void printPattern(String str, int len) {
		for (int i = 0; i < len; i++) {
			for (int j = 0; j < len; j++) {
				if ((i == j) || (i + j == len - 1))
					System.out.print(str.charAt(j));
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str = scanner.next();
		int len = str.length();
		printPattern(str, len);
		scanner.close();
	}
}
