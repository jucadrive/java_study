package ch11;

import java.util.ArrayList;
import java.util.Collections;

public class Ex11_1 {

	public static void main(String[] args) {
		ArrayList list1 = new ArrayList(10);
		// boolean add(Object o) : ArrayList�� �������� ��ü�� �߰�. �����ϸ� true ��ȯ
		list1.add(new Integer(5));
		list1.add(new Integer(4));
		list1.add(new Integer(2));
		list1.add(new Integer(0));
		list1.add(new Integer(1));
		list1.add(new Integer(3));
		
		// List subList(int fromIndex, int toIndex) : ������ ���� ���̿� �ִ� ��ü�� ��ȯ�Ѵ�.(toIndex ���� �� ��)
		ArrayList list2 = new ArrayList(list1.subList(1, 4));	 
		print(list1, list2);
		
		// void sort(Comparator c) : ������ ���ڷ� List�� �����Ѵ�.
		Collections.sort(list1);
		Collections.sort(list2);
		print(list1, list2);
		
		// boolean containsAll(Collections c) : ������ ��ü �Ǵ� Collection�� ��ü���� Collection�� ���ԵǾ� �ִ��� Ȯ���Ѵ�.
		System.out.println("list1.containsAll(list2) : " + list1.containsAll(list2));
		
		list2.add("B");
		list2.add("C");
		list2.add(3, "A");	// �ε����� 3�� ���� "A"�� �߰�
		print(list1, list2);
		
		list2.set(3, "AA");	// �ε����� 3�� ���� "AA"�� ����
		print(list1, list2);
		
		// list1���� list2�� ��ġ�� �κи� ����� �������� �����Ѵ�
		System.out.println("list1.retainAll(list2) : " + list1.retainAll(list2));
		
		print(list1, list2);
		
		// list2���� list1�� ���Ե� ��ü���� �����Ѵ�
		for(int i = list2.size() - 1; i >= 0; i--) {
			if(list1.contains(list2.get(i))) {
				list2.remove(i);	// �ε����� i�� ���� ����� ��Ҹ� ����
			}
		}
		print(list1, list2);
		
	}	// main�� ��
	static void print(ArrayList list1, ArrayList list2) {
		System.out.println("list1 : " + list1);
		System.out.println("list2 : " + list2);
		System.out.println();
	}
}
