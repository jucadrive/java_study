package ch14;

import java.util.Scanner;

public class IfElseIfTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int charge;
		
		System.out.print("���̸� �����ϼ��� : ");
		int age = scanner.nextInt();
		
		if(age < 8) {
			charge = 1000;
			System.out.println("�� ���� �Ƶ��Դϴ�");
		} else if(age < 14) {
			charge = 2000;
			System.out.println("�ʵ��л� �Դϴ�.");
		} else if(age < 20) {
			charge = 2500;
			System.out.println("��, ����л� �Դϴ�.");
		} else {
			charge = 3000;
			System.out.println("�����Դϴ�.");
		}
		System.out.println("������ " + charge + "�� �Դϴ�.");
		
	}

}
