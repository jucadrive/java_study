package ch08;

public class Ex8_2 {

	public static void main(String[] args) {
		System.out.println(1);
		
		try {
			System.out.println(0/0);	// 0���� ������ ���Ƿ� ArithmeticException �߻���Ŵ
			System.out.println(2);	// ������� �ʴ´�
		} catch (ArithmeticException e) {
			System.out.println(3);
		}	// try-catch �� ��
		System.out.println(4);
	}

}
