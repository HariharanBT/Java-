package homework;

import java.util.Scanner;
public class Questions3 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String input = scanner.nextLine();

	        int n = input.length();

	        if (n % 2 == 1) { 
	            for (int i = 0; i < n; i++) {
	                for (int j = 0; j < n; j++) {
	                    if (i == j || i + j == n - 1) {
	                        System.out.print(input.charAt(i));
	                    } else {
	                        System.out.print(" ");
	                    }
	                }
	                System.out.println();
	            }
	        } else {
	            int mid = n / 2;
	            for (int i = 0; i < n; i++) {
	                for (int j = 0; j < n; j++) {
	                    if (i == j && i == mid) {
	                        System.out.print(input.charAt(i));
	                    } else {
	                        System.out.print(" ");
	                    }
	                }
	                System.out.println();
	            }
	        }
	    }
	}



