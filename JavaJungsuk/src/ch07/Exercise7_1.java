package ch07;

class SutdaDeck {
	final int CARD_NUM = 20;
	SutdaCard[] cards = new SutdaCard[CARD_NUM];
	
	SutdaDeck() {
		for(int i = 0; i < cards.length; i++) {
			if(i == 0) {
				cards[i] = new SutdaCard();
			} else if(i == 2 || i == 7) {
				cards[i] = new SutdaCard(i + 1, true);
			} else if(i >= 10){
				cards[i] = new SutdaCard(i - 9, false);
			} else {
				cards[i] = new SutdaCard(i + 1, false);
			}
		}
	}
	
	void shuffle() {	
		for(int i = 0; i < cards.length; i++) {
			int j = (int)(Math.random() * 20);
			SutdaCard temp = cards[i];
			cards[i] = cards[j];
			cards[j] = temp;
		}
	}
	
	SutdaCard pick(int index) {
		return cards[index];
	}
	
	SutdaCard pick() {
		int index = (int)(Math.random()*20);
		return cards[index];
	}
}

class SutdaCard {
	int num;
	boolean isKwang;
	
	SutdaCard() {
		this(1, true);
	}
	
	SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}
	
	// info() ��� Object Ŭ������ toString()�� �������̵��ߴ�.
	public String toString() {
		return num + (isKwang ? "k" : "");
	}
}

public class Exercise7_1 {

	public static void main(String[] args) {
		SutdaDeck deck = new SutdaDeck();
		
		System.out.println(deck.pick(0));
		System.out.println(deck.pick());
		
		deck.shuffle();
		
		for(int i = 0; i < deck.cards.length; i++) {
			System.out.print(deck.cards[i] + ", ");
		}
		
		System.out.println();
		System.out.println(deck.pick(0));
	}

}
/* 
����ī�� 20���� �����ϴ� ����ī�� �� ���� ������ ���̴�. ����ī�� 20���� ��� SutdaCard �迭��
�ʱ�ȭ�Ͻÿ�. ��, ����ī��� 1���� 10������ ���ڰ� ���� ī�尡 �� �־� �ְ�, ���ڰ� 1, 3, 8�� ��쿡��
�� ���� �� ���� ��(Kwang)�̾�� �Ѵ�. ��, SutdaCard�� �ν��Ͻ� ���� isKwang�� ���� true�̾�� �Ѵ�.
*/