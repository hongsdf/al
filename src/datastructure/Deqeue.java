package datastructure;

import java.util.*;
public class Deqeue {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
//            Deque deque = new ArrayDeque<>();
            Deque<Integer> deaue = new LinkedList<>();
   
            int n = in.nextInt();
            int m = in.nextInt();

            for (int i = 0; i < n; i++) {
                int num = in.nextInt();
                deaue.add(num);
            }
//            System.out.println(deaue.offerFirst()); // ù��° ���� boolean
            System.out.println(deaue.getFirst());
            System.out.println(deaue.getLast()); //������ ����
            System.out.println(deaue.getClass()); // class Ȯ�� : java.util.LinkedList
            System.out.println(deaue.peek()); //peek() : �˻� ���-- ��ǥ���� �˻�(�Ϲ������� ù��° ���) �տ��� ����
            // ���� ��� �ִٸ� null 
            System.out.println("poll:"+deaue.poll()); // �˻� + ���� --> �˻��� �ϰ� �����Ѵ� (queue ����)
            System.out.println("pollFirst :"+deaue.pollFirst()); //ù��° ��Ҹ� �˻�+����
            System.out.println("pollLast :"+deaue.pollLast()); // ������ ��Ҹ� �˻� +����
            System.out.println("pop :"+deaue.pop()); // E : ��Ҹ� ���� �ϰ� ��ȯ�Ѵ� (stack ����)
            deaue.push(2); //stack ���� void (ù��° �ڷῡ �߰�)
            deaue.push(50);
            System.out.println(deaue);
            
            // 1
            // 2
            // 0
            // 3
            List<Integer> list = new ArrayList<>(m);
            for(int i=0; i<list.size(); i++) {
//            	list.add(dea)
            }
            
            // stack ������ �ױ� [6,5,4,3,2,1]
            for (int i = 0; i < n; i++) {
                int num = in.nextInt();
                deaue.push(num);
            }
            System.out.println(deaue);
            // List �߰� [1,2,3,4,5,6]
            for (int i = 0; i < n; i++) {
                int num = in.nextInt();
                deaue.add(num);
            }
            System.out.println(deaue);
        }
    }

	
	

