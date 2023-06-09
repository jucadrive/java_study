package ch14;

import java.util.Scanner;

public class IfElseTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("나이를 말해 : ");
		int age = scanner.nextInt();
		
		if(age >= 8) {
			System.out.println("학교에 다녀.");
		} else {
			System.out.println("학교에 안 다녀.");
		}
		System.out.println("노는 게 제일 좋아");
		
	}

}
