package ch09;

public class Ex9_3 {

	public static void main(String[] args) {
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		System.out.println(str1.equals(str2));
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		
	}

}
// String Ŭ������ ���ڿ��� ������ ������, ������ �ؽ��ڵ带 ��ȯ�ϵ��� hashcode() �޼��尡 �������̵��Ǿ� �ִ�.
// System.identityHashCode(Object x)�� Object Ŭ������ hashCode �޼���ó�� ��ü�� �ּҰ����� �ؽ��ڵ带 ����
// ��� ��ü�� ���� �׻� �ٸ� �ؽ��ڵ� ���� ��ȯ�� ���� �����Ѵ�.
// �׷��� str1�� str2�� �ؽ��ڵ�� ������ ���� �ٸ� ��ü��� ���� �� �� �ִ�.
