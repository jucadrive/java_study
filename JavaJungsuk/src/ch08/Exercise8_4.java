package ch08;

public class Exercise8_4 {
	static void method(boolean b) {
		try {
			System.out.println(1);
			if(b) throw new ArithmeticException();
			System.out.println(2);
		} catch (RuntimeException r) {	// ArithmeticException�� RuntimExceptionŬ������ �ڼ��̴�.
			System.out.println(3);	// ���
			return;	// �޼��带 ����������(finally ���� ������ �Ŀ�)
		} catch (Exception e) {
			System.out.println(4);
			return;
		}finally {
			System.out.println(5);
		}
		
		System.out.println(6);	// method(true)�� ��� catch������ return;�� ���� �޼��带 ���������Ƿ� ������� �ʴ´�. 
	}

	public static void main(String[] args) {
		method(true);	// 1 3 5 
		method(false);	// 1 2 5 6
	}

}
