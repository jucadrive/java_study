package ch09;

class Person {
	long id;
	
	public boolean equals(Object obj) {
		if(obj instanceof Person) {	// obj�� Person�� �ν��Ͻ����
			return this.id == ((Person)obj).id;	// obj�� Object Ÿ���̹Ƿ� id ���� �����ϱ� ���ؼ��� Person Ÿ������ ����ȯ�� �ʿ��ϴ�.
		} else {
			return false;
		}
	}
	
	Person(long id) {
		this.id = id;
	}
}

public class Ex9_2 {

	public static void main(String[] args) {
		Person p1 = new Person(8011081111222L);
		Person p2 = new Person(8011081111222L);
		
		if(p1.equals(p2))
			System.out.println("p1�� p2�� ���� ����̴�");	// ���
		else
			System.out.println("p1�� p2�� �ٸ� ����̴�");
	}

}
// equals() �޼���� �� ���������� ����� ��(�ּҰ�)�� �������� �Ǵ��ϴ� ��ɹۿ� �� �� ����
// equals() �޼��带 �������̵��Ͽ� �ּҰ� �ƴ� ��ü�� ����� ������ ���ϵ��� ������ �� �ִ�.
// �� ������ ��� Person �ν��Ͻ��� �ּҰ��� �ƴ� ������� id�� ���� ���ϵ��� �������̵� �ߴ�.