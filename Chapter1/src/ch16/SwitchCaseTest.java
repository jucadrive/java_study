package ch16;

import java.util.Scanner;

public class SwitchCaseTest {

	public static void main(String[] args) {
		// �� ���� �� ������ ���
		Scanner scanner = new Scanner(System.in);
		System.out.print("�� ������ �Է��� : ");
		int month = scanner.nextInt();
		int day;
		
		switch (month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			day = 31;
			break;
		case 2:
			day = 28;
			break;
		
		case 4: case 6: case 9: case 11:
			day = 30;
			break;
		
		default:
			System.out.println("�������� �ʴ� ���̴�.");
			day = -1;
		}
		System.out.println(month + "���� " + day + "�� �̴�");
		scanner.close();
	}

}

// ������� ���� ��� ���� case�� �� ���� ������ �ȴ�.
// �ڹ� 14���� switch ������ break;�� ���� �ʾƵ� �ȴ�.
// switch���� ���� ����, ���ڿ� ����
// case�� �� ���� ���� ��ǥ�� ������ �� �ִ�(�ڹ�14)
// yield Ű���带 ����� return���� ����� �� ����
