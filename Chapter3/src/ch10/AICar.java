package ch10;

public class AICar extends Car {

	@Override
	public void drive() {
		System.out.println("���������� �Ѵ�.");
		System.out.println("�ڵ����� ������ ������ �ٲ۴�.");
	}

	@Override
	public void stop() {
		System.out.println("��ֹ� �տ��� ������ �����.");
	}

	@Override
	public void washCar() {	// �� �޼ҵ�
		System.out.println("�ڵ� ������ �Ѵ�");
	}

	@Override
	public void wiper() {
		// TODO Auto-generated method stub
		
	}
	
}
