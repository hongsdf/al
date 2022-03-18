package Kruskal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

//��Ʈ��ũ ���� ���� : ��� ��ǻ�͸� �ּ� ������� ����
class Computer{
	int node[] = new int[2]; // �δ��� ��ǻ�� ��ȣ
	int cost; // ���� ���
	
	Computer(int a,int b, int cost) {
		this.node[0] = a;
		this.node[1] = b;
		this.cost = cost;
	}
	
}


public class Back1922 {
	public static int N; // ��ǻ�� ��
	public static int M; // ���� ��
	public static int [] array; // ���� ��ǻ�� ����
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)) ;
		N = Integer.parseInt(br.readLine());
		M = Integer.parseInt(br.readLine());
		PriorityQueue<Computer> q = new PriorityQueue<Computer>((a,b) -> (a.cost-b.cost));
		for(int i= 0 ; i < M; i++ ) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			int cost = Integer.parseInt(st.nextToken());
			// �ּ� ����Ʈ���� �Ÿ��� ª�� ������� �����Ͽ��� �Ѵ�.
			q.add(new Computer(u,v,cost));
		}
		//���� ��ǻ�� ���� �ʱ�ȭ
		array = new int[N+1];
		for(int i =1; i<=N; i++) {
			array[i] = i;
		}
		int sum = 0;
		while(!q.isEmpty()) {
			Computer curr = q.poll();
			int com1 = curr.node[0];
			int com2 = curr.node[1];
			int cost = curr.cost;
			// ���� ������ �Ǿ����� �ʰ� (����Ŭ ���� x) :  �������� ���� ���͵� if���� �����ϸ� ����Ǿ �ߺ� ���ŵ�
			if(!Connect(array,com1,com2)) {
				// ��ǻ�͸� �����Ѵ�
				union(array,com1,com2); 
				sum += cost;
			}
			
			
		}
		System.out.println(sum);
		
		
	}
	private static void union(int[] array, int com1, int com2) {
		com1 = getParent(array,com1);
		com2 = getParent(array,com2);
		if(com1 < com2) array[com2] = com1;
		else array[com1] = com2;
		
	}
	// ����Ŭ�� ���� ���� �ʴ� ���� �Ǵ� �Ϸ��� ���� �θ� ����Ű�� �־�� �Ѵ�
	private static boolean Connect(int[] array, int com1, int com2) {
		com1 = getParent(array,com1);
		com2 = getParent(array,com2);
		if(com1 == com2) return true; // ���� �θ��̸� �̹� ����Ǿ� �ִ�.
		else {
			return false; // ������ �Ǿ��� �ʴ�.
		}
	}
	private static int getParent(int[] array, int x) {
		if(array[x] == x) return x;
		return array[x] = getParent(array, array[x] );
	}
}
