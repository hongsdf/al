package bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class node_bfs2 {
	public static int N,E,cost;
	public static ArrayList<Integer>[] arr;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		N = Integer.parseInt(st.nextToken());
		E = Integer.parseInt(st.nextToken());
		
		// ���� ����Ʈ �������
		ArrayList<Integer>[] arr = new ArrayList[N+1];
		// ��� ������ŭ�� ���� �ʿ���
		for(int i = 1 ; i <= N; i++) {
			arr[i] = new ArrayList<Integer>(); // �迭�� ��ĭ���� ArrayList�� ����
		}
		// 0  new ArrayList<>()
		// 1  new ArrayList<>()
		// 2  new ArrayList<>()
		
		
		for(int i = 0 ; i <E; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			// ����� �׷���
			arr[u].add(v); // u��忡 v��带 ����
			arr[v].add(u);
		}

		Queue<Integer> q = new LinkedList<>();  // BFS�� ���� ť
		boolean[] visited = new boolean[N+1]; // �湮üũ
		// �ʿ��� ArrayList�� �� �ະ�� ������ �� �ִ�.
		int[] dist = new int[N+1];  // �Ÿ�����
		// dist�ʱ�ȭ
		Arrays.fill(dist,0);
		q.add(1); // q�� ���۳�带 ��´�
		visited[1] = true;
		dist[1] = 0; // �Ÿ������� ��� �迭 dist�� ���۳�带 0���� �ʱ�ȭ (�ֳĸ� �ڱ��ڽŰ��� �Ÿ��� 0)
		while(!q.isEmpty()) {
			int curr = q.poll();
			System.out.print(curr+" ");
			for(int next : arr[curr]) {
				if(visited[next]) continue;
				q.add(next); // ����� ��带 ��´�
				visited[next] = true;
				dist[next] = dist[curr] +1;
			}
					// ���� ���� ����� ������ �ִٸ�(���� �������� �˼� �ֽ��ϴ�)
		}
	}
     

   

     
}
