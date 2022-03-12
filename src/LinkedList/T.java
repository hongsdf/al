package LinkedList;


class T {
	 public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		 // ó�� ����� ���� 0
		 ListNode node = new ListNode(0);
		 // ����� ��ȯ�� Listnode
		 ListNode ans = node; // 0  1 2 .. ���� ���� �ʿ���
//		                         0  7
		 //                      7  0 8 0
//		  8 0 7 0
		 
		 int sum = 0;
		
		 // �� ����� ���� ���� �ϳ��� ��ġ�� ���
		 while( l1 != null || l2 != null || sum > 0) {
			 if(l1 != null) {
				 sum += l1.val;
				 l1 = l1.next;
				 
			 }
			 // linkedList�� �ش� ����� ������ ������
			 if(l2 != null) {
				 sum += l2.val;
				 l2 = l2.next; // ���� ���� ���� ��Ŵ
			 }
			
			 node.next = new ListNode(sum % 10); // 7 0 8
			 sum /= 10; // 0 1 0
			 
			 node = node.next; // ���� ��� ����
		 }
		 
		 // �ٽ�
		 return ans.next; // 0 7 0 8 �� �� �ִ�. 
//		 �׷��� 0�� ���������� 7 0 8�� ��µȴ�
	 }
}
