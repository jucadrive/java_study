package ch10;

public class ManualCar extends Car {

	@Override
	public void drive() {
		System.out.println("사람이 운전한다.");
		System.out.println("사람이 핸들을 조작한다");
	}

	@Override
	public void stop() {
		System.out.println("장애물 앞에서 브레이크를 밟아서 정지한다.");
	}

	@Override
	public void wiper() {
		// TODO Auto-generated method stub
		
	}
	
}
