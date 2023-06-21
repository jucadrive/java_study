package ch10;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Exercise10_4 {

	public static void main(String[] args) {
		Calendar date1 = Calendar.getInstance();
		Calendar date2 = Calendar.getInstance();
		
		date1.set(1994, 2, 31); // 1994�� 3�� 31�Ϸ� ����
		date2.set(2023, 5, 20);	// ���� ��¥
		
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		
		System.out.println("birthDay = " + df.format(new Date(date1.getTimeInMillis())));	// Calendar Ÿ�� ��ü�� Date Ÿ������ ��ȯ
		System.out.println("today = " + df.format(new Date(date2.getTimeInMillis())));
		
		// �� ��¥ ���� ���̸� ��������, getTimeInMillis() õ���� 1�� ������ ��ȯ�ؾ� �Ѵ�
		long difference = (date2.getTimeInMillis() - date1.getTimeInMillis()) / 1000;	
		
		System.out.println(difference / (24 * 60 * 60) + "days");	// 1�� : 24 * 60 * 60
	}

}
