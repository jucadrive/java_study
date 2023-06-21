package ch10;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Exercise10_1 {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		cal.set(2020, 0, 1);	// cal�� ��¥�� 2020�� 1�� 1�Ϸ� ����
		
		for(int i = 0; i < 12; i++) {
			int weekDay = cal.get(Calendar.DAY_OF_WEEK);	// 1���� ������ ���Ѵ�
			
			// �� ��° �Ͽ����� 1���� ���Ͽ� ���� �޶�����.
			// 1���� �Ͽ����� ��쿡�� �� ��° �Ͽ����� 8���̰�,
			// 1���� �ٸ� ������ ���� 16���� 1���� ����(weekDay)�� ���� �� �� �ִ�.
			int secondSunday = (weekDay == 1) ? 8 : 16 - weekDay;
			
			// �� ��° �Ͽ���(secondSunday)�� cal�� ��¥(Day_OF_MONTH)�� �ٲ۴�.
			cal.set(Calendar.DAY_OF_MONTH, secondSunday);
			
			Date d = cal.getTime();	// Calendar�� Date�� ��ȯ�Ѵ�.
			System.out.println(new SimpleDateFormat("yyyy-MM-dd�� F��° E�����Դϴ�.").format(d));
			
			// ��¥�� ������ 1�Ϸ� �����Ѵ�.
			cal.add(Calendar.MONTH, 1);
			cal.set(Calendar.DAY_OF_MONTH, 1);
		}
		
	}

}
