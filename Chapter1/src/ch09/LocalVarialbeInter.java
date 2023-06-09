package ch09;

public class LocalVarialbeInter {

	public static void main(String[] args) {
		// jdk 10 이상부터 특정 조건에 한해 자료형을 입력하지 않고
		// 리터럴에 따라 자료형을 추론하여 그 자료형이 자동으로 결정된다.
		var i = 10;
		var j = 10.0;
		var str = "test";
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(str);
		
		var str2 = str;
		System.out.println(str2);
	}

}
