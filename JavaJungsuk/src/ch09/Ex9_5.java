package ch09;

class Card2 {
	String kind;
	int num;
	
	Card2() {
		this("SPADE", 1);	// Card(String kind, int num)�� ȣ��
	}
	
	Card2(String kind, int num) {
		this.kind = kind;
		this.num = num;
	}
	
	public String toString() {
		return "kind : " + kind + ", number : " + num;
	}
}

public class Ex9_5 {

	public static void main(String[] args) {
		Card2 c1 = new Card2();
		Card2 c2 = new Card2("HEART", 10);
		System.out.println(c1.toString());
		System.out.println(c2.toString());
	}

}

// toString()�� �Ϲ������� �ν��Ͻ��� Ŭ������ ���� ���� �Ǵ� �ν��Ͻ� �������� ���� ���ڿ��� ��ȯ�Ͽ� ��ȯ�ϵ��� �������̵��Ǵ� ���� �����̴�.
// �� �������� Object Ŭ������ ���ǵ� toString()�� ���� �����ڰ� public�̹Ƿ� Card2 Ŭ������ toString()�� ���� �����ڵ� public�̴�.
// ���� ���ǵ� �޼��带 �ڼտ��� �������̵��� ���� ���� ���ǵ� ���� �������� ���ų� �� �о�� �ϱ� �����̴�.