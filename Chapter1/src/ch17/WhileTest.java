package ch17;

public class WhileTest {

	public static void main(String[] args) {
		int num = 1;
		int sum = 0;	// ���� ������ ����� ���ÿ� �ʱ�ȭ ���־�� �Ѵ�.
		while(num <= 10) {
			sum += num;
			num++;
		}
		System.out.println(sum);
		System.out.println(num);
	}

}
