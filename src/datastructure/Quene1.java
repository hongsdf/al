package datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.*;
import java.util.Queue;

public class Quene1 {
	public static StringBuilder sb = new StringBuilder();
	public static List<Integer> list = new ArrayList<>();
	public static void main(String[] args) throws NumberFormatException, IOException {
		Queue<Integer> q = new LinkedList<Integer>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
//		int front = -1;
//		int rear = -1;
		while(n > 0) {
			String command = br.readLine();
			if(command.contains("push")) {
			  String s = command.substring(5);
			  int num = Integer.parseInt(s);
			  q.add(num);
			}else if(command.contains("pop")) {
				if(q.isEmpty()) sb.append(-1).append("\n");
				else sb.append(q.poll()).append("\n");
//				else System.out.println(q.poll());
			}else if(command.contains("size")) {
//				System.out.println("������"+q.size());
				sb.append(q.size()).append("\n");
			}else if(command.contains("empty")) {
//				if(q.isEmpty()) System.out.println(1);
				if(q.isEmpty()) sb.append(-1).append("\n");
				else sb.append(0).append("\n") ;
			}else if(command.contains("front")) {
//				if(q.isEmpty()) System.out.println(-1);
				if(q.isEmpty()) sb.append(-1).append("\n");
				else sb.append(q.peek()).append("\n");
			}else { // �� ���� rear����
				dequeu(q);
//				for(int i = 0; i <list.size(); i++) {
//					q.add(list.get(i));
//				}
			}
			n--;
		}
		System.out.println(sb);
		
		
//		q.add(4);
//		q.add(6);
//		q.add(7);
//		q.poll();
//		q.add(3);
//		q.poll();
//		while(!q.isEmpty()) {
//			System.out.println(q.poll());
//		}
	}

	private static void dequeu(Queue<Integer> q) {
		// TODO Auto-generated method stub
		int rear = 0;
		List<Integer> list = new ArrayList<>();
		if(q.isEmpty()) {
//			System.out.println(-1);
			sb.append(-1).append("\n") ;
		}else { //21
			// 1
			// 2
			// �Ųٷ� ����ϱ� ���� ArrayList�� ���� ����. 
			while(!q.isEmpty()) { // q ���� �� ������
				int num = q.poll();
				list.add(num); // list �� ���
			} // 2 1
			  // 1 2 
			  // 1 2
//			System.out.println(list.get(list.size()-1)); // list�� ������ ���� ���
			sb.append(list.get(list.size()-1)).append("\n" ) ;
			
			
			for(int i = 0; i < list.size(); i++) { // q�� ��������ϱ� �ٽ� q�� list���� ���� �ֱ�
				 q.add(list.get(i));
			}
		}
	}
}
