package ch09;

class Card {
	String kind;
	int num;
	
	Card() {
		this("SPADE", 1);
	}
	Card(String kind, int num) {
		this.kind = kind;
		this.num = num;
	}
}

public class Ex9_4 {

	public static void main(String[] args) {
		Card c1 = new Card();
		Card c2 = new Card();
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());
	}

}
// toString() : �ν��Ͻ��� ���� ������ ���ڿ�(String)�� ������ �������� ������ ���̴�.
// �ν��Ͻ��� ������ �����Ѵٴ� ���� ��κ��� ��� �ν��Ͻ� ������ ����� ������ ���ڿ��� ǥ���Ѵٴ� ��

/*
public String toString() {
	return getClass().getName() + "@" + Integer.toHexString(hashCode());
 */

// ���� �ٸ� �ν��Ͻ��� ���ؼ� toString()�� ȣ���Ͽ����Ƿ� Ŭ������ �̸��� ���Ƶ� �ؽ��ڵ尪�� �ٸ��ٴ� ���� Ȯ���� �� �ִ�.
 