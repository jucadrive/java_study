package ch18;

import java.util.Scanner;

public class DoWhileTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int input;
		int sum = 0;

		
//		while(input != 0) {
//			input = scanner.nextInt();
//			sum += input;
//		}
//		System.out.println(sum);
		do {
			System.out.print("���� �Է� : ");
			input = scanner.nextInt();
			sum += input;
		}while(input != 0);
		System.out.println(sum);
	}

}
