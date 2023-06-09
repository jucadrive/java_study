package ch08;

public class CharacterTest {

	public static void main(String[] args) {
		char ch1 = 'A';	
		System.out.println(ch1);
		System.out.println((int)(ch1)); // 명시적 형변환
		
		char ch2 = 66;	// char 타입은 음수는 쓸 수 없다. 양수만 가능
		System.out.println(ch2);
		System.out.println((char)ch2);
		
		int ch3 = 67;
		System.out.println(ch3);
		System.out.println((char)ch3);
	}

}
