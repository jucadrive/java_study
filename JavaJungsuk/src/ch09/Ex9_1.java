package ch09;



public class Ex9_1 {

	public static void main(String[] args) {
		Value v1 = new Value(10);
		Value v2 = new Value(10);
		
		if(v1.equals(v2))
			System.out.println("v1�� v2�� ����");
		else
			System.out.println("v1�� v2�� �ٸ���");
	}

}

class Value {
	int value;
	
	Value(int value) {
		this.value = value;
	}
}

// equals() �޼���� �ּҰ����� �񱳸� �ϱ� ������, �� Value �ν��Ͻ��� ������� value�� ���� 10���� ���� ��������
// equals() �޼���� ���� ����� false�� ���ۿ� ���� ���̴�.
// v1 == v2 -> 0x1234 == 0x2345 -> false
