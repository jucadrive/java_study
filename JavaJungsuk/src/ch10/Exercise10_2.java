package ch10;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Exercise10_2 {

	public static void main(String[] args) {
		String pattern = "yyyy/MM/dd";
		String pattern2 = "�Է��Ͻ� ��¥�� E�����Դϴ�.";	// 'E'�� �� ~ �� ���� �ϳ��� �ȴ�.
		
		DateFormat df = new SimpleDateFormat(pattern);
		DateFormat df2 = new SimpleDateFormat(pattern2);
		
		Scanner scanner = new Scanner(System.in);
		
		Date inDate = null;
		
		do {
			System.out.println("��¥�� " + pattern + "�� ���·� �Է���.(�Է� �� : 2023/06/20)");
			try {
				System.out.print(">>");
				inDate = df.parse(scanner.nextLine());	// �Է¹��� ��¥�� Date�� ��ȯ�Ѵ�.
				break;
			} catch (Exception e) {
				// TODO: handle exception
			}
		}while(true);
		
		System.out.println(df2.format(inDate));
	}

}
