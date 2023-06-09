package ch17;

public class WhileTest {

	public static void main(String[] args) {
		int num = 1;
		int sum = 0;	// 지역 변수는 선언과 동시에 초기화 해주어야 한다.
		while(num <= 10) {
			sum += num;
			num++;
		}
		System.out.println(sum);
		System.out.println(num);
	}

}
