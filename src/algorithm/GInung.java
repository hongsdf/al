package algorithm;

import java.util.*;

class Solution {
   
    public int[] solution(int[] progresses, int[] speeds) {
       // �۾����� �������Ѵ� ����
       List<Integer> list = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
       Stack<Integer> stack = new Stack<>();
       
        /* 	������ ����ϴ� ����? 
         	���� ���ؿ��ҷ� ���� (Ư������)�� ������ �ڿ� ���Ҹ� ���ﶧ ����ϴ� ����
         	�迭�� ����ϸ� Ȯ���ߴ� �ϰ�, ����� ���Ҵ� �������ϹǷ� ��ٷӴ�.
         	�ð��� ���⵵�� o(n^2)�ȴ�.
         	
         	
         	���� ������ ������
         	�� -> �� ���� Ư�������� ���ǿ� ������ ��� �����Ѵ�.
         	ex) 
         	5 2 3 4
         	
         	5 ---->4
         	  2--->4
         	    3->4
         	       4
         	       
         	�迭�� �����ϸ� �̷���
         	�������� Ȯ���� ���Ҵ� �������ϴµ�
         	list.set(i,0) �̷������� �����ϰ� if(list.get(i) !=0 �� �ƴϸ� �̷������� ������ �ؾ��Ѵ�.
         	������ ����.
         	�׷��� stack�� �̿�����
         	
         	�ٽ� �����ڸ�
         	stack�� �տ��� �ڷ� �����ϸ� 
         	Ư�������� ������ �տ������� �ڿ� �ִ� ���Ҹ� �����س��ư��� Ǯ���ϱ⿡ �����ϴ�.(Ȯ���ϸ� ����⵵ �����ϴ�)
         	O(n)
         	
         	
         	for(int i = 0; i <list.size(); i++) {
         		for(int j=i; j<list.size(); j++) {
         		
         		}
         	}
         	
          
         */
        
        
        
        // �Ųٷ� �����ؾ��Ѵ�. ������ ����ϱ� ����
        for(int i = progresses.length - 1; i >= 0; i--) {
            // ����
            // (100 - �۾�����) / �۾��ӵ� =  �۾� �� ��
            int cnt  = (100 - progresses[i]) / speeds[i];
            if( (100 - progresses[i]) % speeds[i] != 0 ){
                cnt++;
            }
            stack.add(cnt);
        }
        
        // �۾��ϼ� ����Ʈ�� ������ٸ� �ϼ��� �մ°��� üũ
        // �ٽɿ��� : �տ� �մ� ���Ҵ� (����) �ڿ� �ִ� ���Ұ� ������ ������ ������
        // ����Ʈ�� ��������� ������ ���� �����ΰ��� �����Ѵ�.
        // �տ� ���� ��� x
        
        // stack ���� ó���� �̾� ����
        int standard = stack.pop();
        int num = 1;
        
        while(!stack.isEmpty()){
          
            if(standard >= stack.peek()){
               num++; // ���� ���������� cnt++
               stack.pop(); //Ȯ���޴� �����(�迭�� ��� �ϴ°ͺ��� ������)
            }
            else{
                standard = stack.pop(); // ū���ҷ� ������ �ٲ۴�.
                // ���ݱ��� ������ num�� ����
                result.add(num);
                num = 1; //  num �ʱ�ȭ
                
            }
            
        }
        //stack�� �����ϸ� ����� �մ���Ȯ�� �ʿ�(���� ���� ���)
        result.add(num);
        
        
        
        
        
        int[] answer = new int[result.size()];
        for(int i = 0; i <result.size(); i++){
            answer[i] = result.get(i);
        }
        
        
        return answer;
    }
}