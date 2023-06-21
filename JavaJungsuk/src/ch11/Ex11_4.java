package ch11;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;
import java.util.Scanner;

public class Ex11_4 {
	static Queue q = new LinkedList();
	static final int MAX_SIZE = 5;
	
	public static void main(String[] args) {
		System.out.println("help�� �Է��ϸ� ������ �� �� �ִ�.");
		
		while(true) {
			System.out.print(">>");
			try {
				// ȭ�����κ��� ���� ������ �Է¹޴´�
				Scanner scanner = new Scanner(System.in);
				String input = scanner.nextLine().trim();
				
				if("".equals(input)) continue;
				
				if (input.equalsIgnoreCase("help")) {
					System.out.println(" help - ������ �����ش�.");
					System.out.println(" q �Ǵ� Q - ���α׷��� �����Ѵ�.");
					System.out.println(" history - �ֱٿ� �Է��� ��ɾ " + MAX_SIZE + "�� �����ش�.");
				} else if(input.equalsIgnoreCase("history")) {
					int i = 0;
					// �Է¹��� ��ɾ �����ϰ�,
					save(input);
					
					// LinkedList�� ������ �����ش�
					LinkedList tmp = (LinkedList)q;
					ListIterator it = tmp.listIterator();
					
					while(it.hasNext()) {
						System.out.println(++i + "." + it.next());
					}
				} else {
					save(input);
					System.out.println(input);
				}
			} catch (Exception e) {
				System.out.println("�Է¿�����.");
			}
		}
	}
	
	public static void save(String input) {
		// queue�� �����Ѵ�.
		if(!"".equals(input))
			q.offer(input);
		
		// queue�� �ִ�ũ�⸦ ������ ���� ó�� �Էµ� ���� �����Ѵ�.
		if(q.size() > MAX_SIZE) // size()�� Collection �������̽��� ����
			q.remove();
	}

}
