package ch08;

public class Ex8_6 {

	public static void main(String[] args) {
		try {
			Exception e = new Exception("�Ϻη� �߻����״�.");
			throw e;
			// == throw new Exception("�Ϻη� �߻����״�"); 
		} catch (Exception e) {
			System.out.println("���� �޽��� : " + e.getMessage());
			e.printStackTrace();
		}
		System.out.println("���α׷��� ���� ����Ǿ���.");
	}

}
