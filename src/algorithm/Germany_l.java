package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Germany_l {
	
	public static List<Integer> list;
	public static int N;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			N = sc.nextInt();
			if(N == 0) break;
			
			list = new ArrayList<Integer>();
			for(int i=0;i<N; i++) {
				list.add(sc.nextInt());
			}
			boolean visited[] = new boolean[N];
			solve2(list,visited,0,N,6);
			
			System.out.println();
		}
		
	}

	private static void solve2(List<Integer> list, boolean[] visited, int pos,int n, int cnt) {
		if(cnt == 0) {
			print(list,visited,n);
			return;
		}
		
		//�ٽ��� �Ѹ� �� �ִ�.
		// ����Լ��� �ܺο��� ����Ǿ� ���´� �װ� ���� ū ����
		// ��ͳ����Լ��� �ݺ����� ������ ������ ����� ��� ������̴�
		// ex) for(int i=0;i<4; i++) ����Լ��� ������ �ڽ� 4��(���)
		// ���� -> 1 --> 2  ---> 3  ----> 4  1234  123 234 124 134
		//				   ---> 4
		//		    
		//          --> 3  ---> 4

		//          --> 4
		
		//     -> 2   --> 3  ---> 4
		//		      --> 4
		
		
		//	   -> 3 --> 4
		
		
		//     -> 4
		//
		for(int i = pos; i< n; i++) {
			visited[i] = true;
			solve2(list,visited,i+1,n,cnt-1);
			visited[i] = false;
		}
		
		
		
	}

	private static void print(List<Integer> list, boolean[] visited, int n) {
		StringBuilder sb = new StringBuilder();
		for(int i=0; i< n; i++) {
			if(visited[i]) {
				sb.append(list.get(i)).append(" ");
			}
		}
		sb.append("\n");
		
		System.out.print(sb.toString());
		
	}

//	private static void solve(List<Integer> list, int pos, StringBuilder sb) {
//		if(pos >= list.size()) { // ��ü ���Ҹ� ���Կ��� ������� �� Ȯ�� �ؾ���
//			if(sb.length() == 6) System.out.println(sb);
//			
//			return; // ��� �ε����� �� Ȯ�� ������ ����
//		}
//		
//		
//		// ���� �Լ��� ����(�ش� �ڷ�, �ε��� ��ġ ����, �̾� ���� �޸𸮰���)
//		solve(list,pos+1,sb.append(list.get(pos)));
//		sb.setLength(sb.length()-1);
//		solve(list,pos+1,sb);
//		
//	}
}
