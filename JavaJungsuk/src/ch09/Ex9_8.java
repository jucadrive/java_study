package ch09;

public class Ex9_8 {

	public static void main(String[] args) {
		// ���̰� 0�� char �迭�� �����Ѵ�.
		char[] cArr = new char[0];	// char[] cArr = {}; �� ����
		String s = new String(cArr);	// String s = new String(""); �� ����.
		
		System.out.println("cArr.length = " + cArr.length);
		System.out.println("@@@" + s + "@@@");
	}

}
// String s = "";  ->  �������� s�� �����ϰ� �ִ� String �ν��Ͻ��� ���ο�
// new char[0]�� ���� ���̰� 0�� char�� �迭�� �����ϰ� �ִ� ���̴�.
// char �� �������� �ݵ�� �ϳ��� ���ڸ� �����ؾ��Ѵ�.

// String�� ������ Ÿ���� �⺻���� null ���ٴ� �� ���ڿ���,	String s = "";
// char���� '\u0000' ��� �������� �ʱ�ȭ�ϴ� ���� �����̴�. char c = ' ';