package ch10;

public class ManualCar extends Car {

	@Override
	public void drive() {
		System.out.println("����� �����Ѵ�.");
		System.out.println("����� �ڵ��� �����Ѵ�");
	}

	@Override
	public void stop() {
		System.out.println("��ֹ� �տ��� �극��ũ�� ��Ƽ� �����Ѵ�.");
	}

	@Override
	public void wiper() {
		// TODO Auto-generated method stub
		
	}
	
}
