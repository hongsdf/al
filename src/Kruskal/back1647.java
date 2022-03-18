package Kruskal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;
class village{
	int node[] = new int[2]; // �θ��� �� ������ ��� �迭
	int cost; // ���� �Ÿ�
	
	village(int a, int b, int cost) {
		this.node[0] = a; // ��� ����
		this.node[1] = b; // ���� ����
		this.cost = cost; // ���� �� �Ÿ�
	}
	
}


public class back1647 {
	public static int N; // ���� ��
	public static int M; // ���� �� �Ÿ� ��
	
	public static int array[];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		// �Ÿ��� ����� ������ ����
		PriorityQueue<village> q = new PriorityQueue<village>((a,b)->(a.cost - b.cost));
		
		for(int i = 0; i <M; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			int cost = Integer.parseInt(st.nextToken());
			q.add(new village(u,v,cost));
		}
		// ���� �ʱ�ȭ 
		array = new int[N+1];
		for(int i = 1; i<=N; i++) {
			array[i] = i;
		}
		int sum = 0;
		int max = -1; // ���� �������� �ִ� �Ÿ��� ã��
		// �� ������ �и��� �ϱ����ؼ� �ּ� ��������� *�ϳ��� �游 ���* �ΰ��� ������ �и��ȴ� 
		// �׷��� �ִ� ����ũ�⸦ ��� �ΰ��� ������ ����� ���� ���� �ּ� ����� �ȴ� 
		// ����? :��
		// �ּ� ��������� ������ ���������� ��� ������ �ּ� ������� ���� �Ǿ����� ���̴�.
		// �ű⼭ �ִ� ������ �ϳ��� �ڸ��� 2���� ������ �и��� �ɻ����� *�и� �ȿ����� ������ ������ ������ �Ǿ��ִ�.*
		while(!q.isEmpty()) {
			village curr = q.poll();
			int v = curr.node[0];
			int u = curr.node[1] ;
			int cost = curr.cost;
			// �θ����� ������ �Ǿ����� ������ 
			if(!Connect(array,v,u)) {
				// �����Ѵ�
				 union(array,u,v);
				  sum += cost;
				  max = Math.max(max, cost); // �ִ� ����ũ�� ã��
			}
		}
		System.out.println(sum - max);
		
	}
	private static void union(int[] array, int u, int v) {
		u = getParent(array,u);
		v = getParent(array,v);
		if(u < v) array[v] = u;
		else array[u] = v;
		
	}
	private static boolean Connect(int[] array, int v, int u) {
		v = getParent(array,v);
		u = getParent(array,u);
		if(v == u) return true; //����o
		return false; // ���� x
	}
	private static int getParent(int[] array, int v) {
		if(array[v] == v ) return v;
		return array[v] = getParent(array, array[v]);
	}
}
