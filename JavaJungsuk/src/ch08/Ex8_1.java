package ch08;

public class Ex8_1 {

	public static void main(String[] args) {
		System.out.println(1);
		
		try {
			System.out.println(2);
			System.out.println(3);
		} catch (Exception e) {
			System.out.println(4);	// 실행되지 않는다
		}
		System.out.println(5);
	}

}
// 예외가 발생하지 않았으므로 catch 블럭의 문장이 실행되지 않는다.