package ch10;

public class TypeConversionTest {

	public static void main(String[] args) {
//		int iNum = 255;
//		byte bNum = (byte)iNum;	
//		// 255�� byte�� ������ �ʰ��ϴµ� byte�� ����� ����ȯ �ϹǷ�
//		// �� �ս� �߻� -1
//		System.out.println(bNum);
//		
//		double dNum = 3.14;
//		int inum = (int)dNum; 
//		// double Ÿ�� ���� int Ÿ������ �ٲٷ��� ������
//		// �Ҽ��� ���ϰ� �߸��� �ȴ�. 3
//		
//		System.out.println(inum);
		
		double dNum = 1.2;
		float fNum = 0.9f;
		
		int iNum1 = (int)dNum + (int)fNum;
		// �Ҽ����� ���� �߸��� �Ǿ� 1 + 0 = 1
		int iNum2 = (int)(dNum + fNum);
		// 1.2�� 0.9�� ���� �������� ���� ����ȯ�� ���� �Ҽ��� ���ϰ� �߸��� ��
		// 1.2 + 0.9 = 2.1 => 2
		
		System.out.println(iNum1);
		System.out.println(iNum2);
		
		int myNum = 10;
		int yourNum = 20;
		
		myNum += yourNum;
		System.out.println(myNum);
	}

}
