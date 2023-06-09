package ch16;

import java.util.Scanner;

public class SwitchCaseTest {

	public static void main(String[] args) {
		// 한 달이 몇 일인지 출력
		Scanner scanner = new Scanner(System.in);
		System.out.print("몇 월인지 입력해 : ");
		int month = scanner.nextInt();
		int day;
		
		switch (month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			day = 31;
			break;
		case 2:
			day = 28;
			break;
		
		case 4: case 6: case 9: case 11:
			day = 30;
			break;
		
		default:
			System.out.println("존재하지 않는 달이다.");
			day = -1;
		}
		System.out.println(month + "월은 " + day + "일 이다");
		scanner.close();
	}

}

// 결과값이 같은 경우 여러 case를 한 번에 적으면 된다.
// 자바 14부터 switch 문에서 break;를 적지 않아도 된다.
// switch문의 값에 정수, 문자열 가능
// case를 한 번만 쓰고 쉼표로 구분할 수 있다(자바14)
// yield 키워드를 사용해 return문을 대신할 수 있음
