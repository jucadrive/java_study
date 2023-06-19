package ch08;

import java.util.*;

public class Exercise8_7 {

	public static void main(String[] args) {
		// 1 ~ 100 ������ ������ ���� �� answer�� �����Ѵ�.
		int answer = (int)(Math.random() * 100) + 1;
		int input = 0;	// ����� �Է��� ������ ����
		int count = 0; // �õ� Ƚ���� ���� ���� ����
				
		do {
			count++;
			System.out.print("1�� 100 ������ ���� �Է��ϼ��� : ");
			
			// input = new Scanner(System.in).nextInt();
			
			try {
				Scanner scanner = new Scanner(System.in);
				input = scanner.nextInt();
			} catch (Exception e) {
				System.out.println("��ȿ���� ���� ���̴�. �ٽ� �Է���");
				continue;
			}
			
			if(answer > input) {
				System.out.println("�� ū ���� �Է���");
			} else if(answer < input) {
				System.out.println("�� ���� ���� �Է���");
			} else {
				System.out.println("�����");
				System.out.println("�õ� Ƚ���� " + count + "���̴�.");
				break;	// do-while �� ���
			}
		}while(true);	// ���� �ݺ�
		
	}

}
