package datastructure;

import java.util.*;
import java.util.Scanner;
public class DataStructure_1D_Array {
	
	// Queue : Ž�� �Ҷ� ���  �ߺ����� --> ������ ���� ���纻�� ����� �ߺ��� �����Ѵ�.
	// ����(while���� ���) *ó���� q�� �� �ϳ��̻��� �����ؾ���  *while(!q.isEmpty()){ }
	// q�ȿ� ���Ұ� �����δ�. �Ѱ���
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(n-->0) {
			int a = sc.nextInt(); //�迭ũ��
			int leap = sc.nextInt(); //���� ũ��
			int game[] = new int[a]; //����
			boolean visited[] = new boolean[a]; //���纻 ����
			for(int i =0; i< game.length;i++) {
				game[i] = sc.nextInt();
				visited[i] = false;
			}
			// ����
			visited[0] = true;
			boolean flag = false;
			Queue<Integer> q = new LinkedList<>(); // queue�� LinkedList�� �����ؾ���
//			q.offer(null) //queue�� �ڷ� �߰� ��� 1.add(), 2.offer() --> ������ true��ȯ, ���н� IllegalStateException�� �߻� : �޸� ���� ����
			q.add(0); //     0  1  0       
					  //    
//			6 3             2 2
//			0 0 1 1 1 0     0 0
//          T T F F F F
			while(!q.isEmpty()){
				int v = q.poll(); // poll() : ù��° ���� ��ȯ�ϰ� ����
				//queue.peek() : ù��° �� ����(������ ������ ù��°)
				if(v+1 >= a || v+leap>= a){ //���� ��������ĭ || ����ĭ������ ��ǥ��ġ(a)�迭�� �����ϸ� �ؼ� ==> ���� ��ġ���� ������ ��ĭ || ���� �ص� ���� ������  �ִ� ��
					flag = true;
					break; // ���⼭ while���� ����
				}
				if(v-1 >= 0 && !visited[v-1] &&	game[v-1] == 0 ){ // �ڷ� ���� ���(��,��ĭ�� == 0 , �湮 ���� ����ĭ && visited[] ������ ����� �ȵ�
					visited[v-1] = true;
					q.add(v-1);
				}
				if(v+1 < a && !visited[v+1] && game[v+1] == 0){ // ������ ���� ���(��,visited[] ������ , �湮���� �ʰ� ��ĭ
					visited[v+1] = true;
					q.add(v+1);
				}
				if(v+leap < a && !visited[v+leap] && game[v+leap] == 0){ // �����ϴ� ���
					visited[v+leap] = true;
					q.add(v+leap);
				}
			}
			System.out.println(flag ? "YES" : "NO");
			
		}
		
		
	}
}

