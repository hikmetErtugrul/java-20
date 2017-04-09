package tryCatch;

import java.util.Scanner;

public class zeroe {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		try {
			int a = Integer.parseInt(scan.next());

		} catch (NumberFormatException e) {
			e.printStackTrace();
		}

		try {
			bolme(scan.nextInt(), scan.nextInt());
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
		System.out.println("devam ediyor");
	}

	private static int bolme(int a, int b) {
		return a / b;

	}
}
