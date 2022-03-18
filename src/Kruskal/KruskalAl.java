package Kruskal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

// ��뿹��: �� ������ ��� ������ �����ϱ� ���� �ּ� ���,�Ÿ�
// ũ�罺Į �˰����� union find �� ������� ���� �Ѵ�.
// ������ ����Ŭ�� ������������ �͸� ������ �����Ѵ�.
// �Ÿ��� ª�� ������� ������ �Ѵ�.
class Edge{
	int node[] = new int[2];
	int cost ;
	
	public Edge(int a, int b, int cost) {
		this.node[0] = a;
		this.node[1] = b;
		this.cost = cost;
	}
}


public class KruskalAl {
	public static int N ; // ����
	public static int E; // ���� ����
	public static int [][]board; // ���� ���
	
	public static int []array; 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)) ;
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		 N = Integer.parseInt(st.nextToken()); 
		 E = Integer.parseInt(st.nextToken()) ;
		 // ����� ����
		PriorityQueue<Edge> q = new PriorityQueue<Edge>((a,b) ->(a.cost - b.cost));
		 
		for(int i = 0; i <E; i++) {
			 st = new StringTokenizer(br.readLine(), " ");
			 int u = Integer.parseInt(st.nextToken()); 
			 int v = Integer.parseInt(st.nextToken()) ;
			 int distance = Integer.parseInt(st.nextToken()) ;
			 q.add(new Edge(v,u,distance));
		}
		array = new int[N+1] ;
		// array �ʱ�ȭ
		for(int i =1; i<=N; i++) {
			array[i] = i;
		}
		int sum = 0;
		while(!q.isEmpty()) {
			Edge curr = q.poll();
			int start = curr.node[0];
			int end = curr.node[1];
			int cost = curr.cost;
			if(!SameFind(array,start,end)) { //���� �θ� �ƴϿ������� ����(����Ŭ ������ ���� �ʴ� ��츸 ���� )
				union(array,start,end);
				sum += cost;
			}
		}
		System.out.println(sum);
		
		
	}
	// ��ġ��
	private static void union(int[] array, int a, int b) {
		a = getParent(array, a);
		b = getParent(array, b);
		if(a < b) array[b] = a;
		else array[a] = b;
		
	}
	private static boolean SameFind(int[] array, int a, int b) {
		a = getParent( array, a);
		b = getParent( array, b);
		if(a == b) return true;
		else {
			return false ;
		}
	}
	// �θ� ã��
	private static int getParent(int[] array, int a) {
		if(array[a] == a) return a;
		return array[a] = getParent(array,array[a]);
	}
	
	
	
}
