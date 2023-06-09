package ch10;

public abstract class Car {
	
	public abstract void drive();
	public abstract void stop();
	public abstract void wiper();
	
	public void startCar() {
		System.out.println("�õ��� �Ǵ�.");
	}
	public void turnOff() {
		System.out.println("�õ��� ����.");
	}
	
	public void washCar() {}	// �߻� �޼��� �ƴ�, ���� ���븸 ���� ��.
	
	final public void run() {
		startCar();
		drive();
		wiper();
		stop();
		turnOff();
		washCar();
	}
}
