package datastructure;

import java.util.LinkedList;
import java.util.Queue;

public class queue1 {
	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<>();
		q.add(3);
		q.add(1);
		q.offer(2);
		boolean flag = q.contains(3); //contains(a) : a�� �����ϰ� �ִ°�?
		int num = q.peek();
		System.out.println(num);
		System.out.println(flag);
		q.remove(); //remove() : ť�� ���� ���� ����	
		int val = q.poll(); //ù��° ���� �����ϰ� ��ȯ
		System.out.println(q);
		System.out.println(val);
	}
	

}
