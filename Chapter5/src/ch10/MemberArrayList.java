package ch10;

import java.util.ArrayList;
import java.util.Iterator;

public class MemberArrayList {

	private ArrayList<Member> arrayList;	// ArrayList ����
	
	public MemberArrayList() {
		arrayList = new ArrayList<>();	// Member�� ������ ArrayList ����
	}
	
	public MemberArrayList(int size) {
		arrayList = new ArrayList<>(size);
	}
	
	public void addMember(Member member) {	// ArrayList�� ��� �߰�
		arrayList.add(member);
	}
	
	public boolean removeMember(int memberId) {	// ��� id�� �Ű�������, �������� ��ȯ
//		for(int i = 0; i < arrayList.size(); i++) {		// �ش� id�� ���� ����� ArrayList���� ã��
//			Member member = arrayList.get(i);
//			
//			int tempId = member.getMemberId();
//			if(tempId == memberId) {	// ��� id�� �Ű������� ��ġ�ϸ�
//				arrayList.remove(i);	// �ش� ��� ����
//				return true;	// true ��ȯ
//			}
//		}
//		System.out.println(memberId + "�� �������� �ʴ´�.");	// for���� ���� ������ return�� �� �� ���
//		return false;
		
		Iterator<Member> ir = arrayList.iterator();
		while(ir.hasNext()) {
			
			Member member = ir.next();
			
			int tempId = member.getMemberId();
			if(tempId == memberId) {
				arrayList.remove(member);
				return true;
			}
		}
		System.out.println(memberId + "�� �������� �ʽ��ϴ�.");
		return false;
	}
	
	public void showAllMember() {
		for(Member member : arrayList) {
			System.out.println(member);
		}
		System.out.println();
	}
}
