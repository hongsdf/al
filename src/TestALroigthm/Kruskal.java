package TestALroigthm;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class di implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		if(o1 - o2 > 0) {
			return 1;
		}
		return 0;
	}
	
}



public class Kruskal {
	static int V, E;
	static int graph[][];
	static int parent[];
	static int sum = 0;

	public static void main(String[] args) {
		
			// �׷����� �������(���1, ���2, ���)�� �ʱ�ȭ.
			Scanner sc = new Scanner(System.in);
			V = sc.nextInt(); // ��� ����
			E = sc.nextInt(); // ���� ����
			graph = new int[E][3];
			for (int i = 0; i < E; i++) {
				graph[i][0] = sc.nextInt(); // 0���� 5 ,1���� : 25, 2���� : 37 ...
				graph[i][1] = sc.nextInt();
				graph[i][2] = sc.nextInt();
			}
//			Arrays.sort(graph, (o1, o2) -> Integer.compare(o1[2], o2[2]));
			// �ذ��ؾ���
			Arrays.sort(graph, (o1,o2) -> Integer.compare(o1[2], o2[2]));
			parent = new int[V];
			sum = 0;
			for(int i =0; i <V; i++) {
				parent[i] = i;
			}
			
			
			// ���� ��
			for(int i =0; i <E; i++) {
				// ���� �θ� ����Ű�� ���� �ʴ� == ����Ŭ
			if (getParent(parent,graph[i][0] - 1) != getParent(parent,graph[i][1] - 1)) {
				uni(parent, graph[i][0] - 1 , graph[i][1] - 1);
				sum += graph[i][2];
				continue;
			}
		}
		System.out.println(sum);
	}	

	public static int same(int[] parent2, int i, int j) {
		i = getParent(parent, i);
		j = getParent(parent, j);
		if (i == j)
			return 1;
		else
			return 0;
	}

	public static int getParent(int[] dist, int i) {
		if (dist[i] == i)
			return i;

		return dist[i] = getParent(dist, dist[i]);

	}

	public static void uni(int[] dist, int i, int j) {
		// TODO Auto-generated method stub
		i = getParent(dist, i);
		j = getParent(dist, j);
		if (i < j)
			dist[j] = i; // dist[j] --> i
		else
			dist[i] = j; // dist[i] -- >j
	}
}
