package LinkedList;

public class T1 {
	private static void printNode1(ListNode r) {
		while( r != null) {
			System.out.print(r.val);
			r = r.next;
		}
		// Exception in thread "main" java.lang.Error: Unresolved compilation problem: Ŭ������ ��ġ ��Ű��� [projcet --> clean] 
	}

	public static void main(String[] args) {
		SolutionA m = new SolutionA();
		ListNode l3 = new ListNode(3);
		ListNode l2 = new ListNode(4,l3);
		ListNode l1 = new ListNode(2,l2);
		
		ListNode m3 = new ListNode(4);
		ListNode m2 = new ListNode(6,m3);
		ListNode m1 = new ListNode(5,m2);
		
		ListNode r = m.addTwoNumbers(l1,m1);
		printNode1(r);
	}
}
class SolutionA{
	// �� LIST��带 �����ͼ� �ϳ��� ��ġ��
	// �׸��� �������� ����ϱ�
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode p = new ListNode(0); // �� ���� List��� �ΰ��� ��ĥ �����̴�.
		ListNode temp = p; //���� ���纻
		int sum = 0;
		while(l1 != null || l2 !=null ) {
			int n = sum;
			if(l1 != null) {
				n += l1.val;
				l1 = l1.next;
				
			}
			
			if( l2 != null) {
				n += l2.val;
				l2 = l2.next;
				
			}
			if(n >= 10) {
				p.next = new ListNode(n - 10); // ���ڸ��� �ö󰬴�
				sum = 1; //���ڸ����ö󰬴�.
			}else {
				p.next = new ListNode(n) ;
				sum = 0; // �̰� �������
			}
			p = p.next;
			
			if( sum == 1) {
				p.next = new ListNode(1);
			}
		}
		return temp.next;
	}
}

//while(l1 != null) {
//	sum += l1.val;
//	l1 = l1.next;
//}
//
//while(l2 !=null) {
//	sum += l2.val;
//	l2 = l2.next;
//}
//// 999 + 999 =   1998
//if(sum > 0) {
//	// �������� ����Ҽ��ִ� ���ο� ���
//	p.next = new ListNode(sum %10); //8 9 9 1
//	
//	
//	
//	if(sum > 10) {
//		sum /= 10;
//	}
//	
//	p = p.next; //p ���� ��Ű��
//	
//}
//
//
//return temp.next; // sum ==0 �̸� temp --> p(0)�̹Ƿ�
////return 0;