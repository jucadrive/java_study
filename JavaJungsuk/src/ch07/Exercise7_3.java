package ch07;

class Product {
	int price;
	int bonusPoint;
	
	Product(int price) {
		this.price = price;
		bonusPoint = (int)(price / 10.0);
	}
}

class Tv extends Product {
	
	Tv(int price) {
		super(price);
	}

	public String toString() {
		return "Tv�� �����߽��ϴ�. ������ " + price + "���� �Դϴ�.";
	}
}
public class Exercise7_3 {

	public static void main(String[] args) {
		Tv t = new Tv(300);
		
		System.out.println(t);
	}

}
