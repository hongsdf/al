package LinkedList;

import java.util.*;
class LinkedList1 {
    public ListNode mergeKLists(ListNode[] lists) { // ListNode[] lists ==> [[1,3,4][5,6]] �ð������� 2�������� ����
       int k = lists.length; // 5
       ListNode answer = null; // return ��ȯ��  ListNode
        
        int idx = 0; // lists�� ���Ҹ� 0 ~ k ���� �ϳ��� ��ġ�� ���� idx
        while(idx < k ){ //��ġ�� ������ ������ ���̴�
           answer = Merge(answer,lists[idx++]); // ��ġ�� : answer�� �̾� ������(�ϳ��� ��� ��)
        }
        return answer;
    }
    
    public ListNode Merge(ListNode left,ListNode right){
        if(left == null ) return right; // left�� ��� ������ right���� ��ȯ
        if(right == null) return left; // right�� ��� ������ left�� ��ȯ
        
       ListNode temp = null; // �ӽ� ListNode
       // ó�� ListNode���� left,right
       if(left.val >= right.val){ 
           temp = right; // ���� ���� �ִ´�
           right = right.next;
           
       }else{
           temp = left;
           left = left.next;
       }
        // ���� left�� right�� �ϳ��� �����ؼ� node�� ����
        ListNode node = temp;
        // �ð��� temp -> node(left) -> right|| left
        
        // ���� �۾�
        while(left != null && right != null ){
            if(left.val >= right.val){
                node.next = right;
                right = right.next;
            }else{
                node.next = left;
                left = left.next;
            }
            // if,else ���� �ϳ��� �ְ� node���������� 
            // ���� node �ڸ��� ���� ��Ŵ
            node = node.next;
            
        }
        // left,right �� ���� ���� ������ node�� �ڸ��� ä������
        if(left != null) node.next = left;
        if(right != null) node.next = right;
        
        
        
        return temp;
        
        
    }
       
        
        
    
}