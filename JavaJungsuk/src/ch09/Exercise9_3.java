package ch09;



public class Exercise9_3 {
	public static int count(String src, String target) {
		int count = 0;	// ã�� Ƚ��
		int pos = 0; // ã�� ������ ��ġ
		
	// (1) �ݺ����� ����ؼ� �Ʒ��� ������ �ݺ��Ѵ�.
		while(true) {
			// 1. src���� target�� pos�� ��ġ���� ã�´�.
			pos = src.indexOf(target, pos);
			
			// 2. ã���� count�� ���� 1 ������Ű��, pos�� ���� target.length ��ŭ ������Ų��.
			if(pos != -1) {
				count++;
				pos += target.length();	// pos�� ã�� �ܾ� ���ķ� �ű��.
			} else {
				// 3. indexOf�� ����� -1�̸� �ݺ����� ���������� count�� ��ȯ�Ѵ�.
				break;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		System.out.println(count("12345AB12AB345AB", "AB"));
		System.out.println(count("12345", "AB"));
		
	}

}

// indexOf()�� ������ ���ڿ��� ã�Ƽ� �� ��ġ�� �˷��ش�. ���� ã�� ���Ѵٸ� -1�� ��ȯ�Ѵ�.
// ������ ���ڿ��� ã���� ���� count�� 1 ������Ű��, ã�� ������ ��ġ�� ã�� ���ڿ� ���ķ�
// ������ �־�� �� ������ ������ ��ġ�ϴ� ���ڿ��� ã�� �� �ִ�.
// �׷��� ã�� ��ġ(pos)�� ã�� ���ڿ��� ����(target.length())�� �����ִ� ���̴�.