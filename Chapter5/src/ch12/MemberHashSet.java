package ch12;



import java.util.HashSet;
import java.util.Iterator;

public class MemberHashSet {

	private HashSet<Member> hashSet;	// ArrayList ����
	
	public MemberHashSet() {
		hashSet = new HashSet<>();	// Member�� ������ ArrayList ����
	}
	
	public MemberHashSet(int size) {
		hashSet = new HashSet<>(size);
	}
	
	public void addMember(Member member) {	// ArrayList�� ��� �߰�
		hashSet.add(member);
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
		
		Iterator<Member> ir = hashSet.iterator();
		while(ir.hasNext()) {
			
			Member member = ir.next();
			
			int tempId = member.getMemberId();
			if(tempId == memberId) {
				hashSet.remove(member);
				return true;
			}
		}
		System.out.println(memberId + "�� �������� �ʽ��ϴ�.");
		return false;
	}
	
	public void showAllMember() {
		for(Member member : hashSet ) {
			System.out.println(member);
		}
		System.out.println();
	}
}
