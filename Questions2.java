package homework;

import java.util.*;

public class Questions2 {
	public static void main(String[] args) {
		int[] numbers = { 49, 36, 8, 10, 12 };

		Map<Integer, Integer> numberToWeight = new HashMap<>();

		for (int num : numbers) {
			int weight = num % 4 == 0 && num % 6 == 0 ? 4 : isPerfectSquare(num) ? 5 : num % 2 == 0 ? 3 : 0;
			numberToWeight.put(num, weight);
		}

		numberToWeight.entrySet().stream().sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed())
				.forEach(entry -> System.out.println("<" + entry.getKey() + "," + entry.getValue() + ">"));
	}

	public static boolean isPerfectSquare(int num) {
		int sqrt = (int) Math.sqrt(num);
		return sqrt * sqrt == num;
	}
}
