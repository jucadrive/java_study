package ch14;

import java.util.Scanner;

public class IfElseTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("���̸� ���� : ");
		int age = scanner.nextInt();
		
		if(age >= 8) {
			System.out.println("�б��� �ٳ�.");
		} else {
			System.out.println("�б��� �� �ٳ�.");
		}
		System.out.println("��� �� ���� ����");
		
	}

}
