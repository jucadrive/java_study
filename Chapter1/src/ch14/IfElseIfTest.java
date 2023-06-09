package ch14;

import java.util.Scanner;

public class IfElseIfTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int charge;
		
		System.out.print("나이를 말씀하세요 : ");
		int age = scanner.nextInt();
		
		if(age < 8) {
			charge = 1000;
			System.out.println("미 취학 아동입니다");
		} else if(age < 14) {
			charge = 2000;
			System.out.println("초등학생 입니다.");
		} else if(age < 20) {
			charge = 2500;
			System.out.println("중, 고등학생 입니다.");
		} else {
			charge = 3000;
			System.out.println("성인입니다.");
		}
		System.out.println("입장료는 " + charge + "원 입니다.");
		
	}

}
