package ch10;

public class TypeConversionTest {

	public static void main(String[] args) {
//		int iNum = 255;
//		byte bNum = (byte)iNum;	
//		// 255는 byte의 범위를 초과하는데 byte로 명시적 형변환 하므로
//		// 값 손실 발생 -1
//		System.out.println(bNum);
//		
//		double dNum = 3.14;
//		int inum = (int)dNum; 
//		// double 타입 값을 int 타입으로 바꾸려고 함으로
//		// 소수점 이하가 잘리게 된다. 3
//		
//		System.out.println(inum);
		
		double dNum = 1.2;
		float fNum = 0.9f;
		
		int iNum1 = (int)dNum + (int)fNum;
		// 소수점이 각각 잘리게 되어 1 + 0 = 1
		int iNum2 = (int)(dNum + fNum);
		// 1.2와 0.9가 먼저 더해지고 나서 형변환에 의해 소수점 이하가 잘리게 됨
		// 1.2 + 0.9 = 2.1 => 2
		
		System.out.println(iNum1);
		System.out.println(iNum2);
		
		int myNum = 10;
		int yourNum = 20;
		
		myNum += yourNum;
		System.out.println(myNum);
	}

}
