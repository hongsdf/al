package Union;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Back1717 {
	public static int n; // n(1 �� n �� 1,000,000) ��� ��
	public static int m; // ���� ��
	public static int array[]; //���� �迭 ��庰 �θ�� �Ǵ��ϱ� ����
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		array = new int[n+1];
		// array �ʱ�ȭ : �ڱ��ڽ��� ����Ű�� �ִ�.
		for(int i =1; i<=n ; i++) {
			array[i] = i;
		}
		
		for(int i = 0; i<m; i++) {
			st = new StringTokenizer(br.readLine()," ");
			int command = Integer.parseInt(st.nextToken());
			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			if(command == 0) {
				union(array,u,v);
			}else if(command == 1) {
				boolean flag = SameFind(array,u,v);
				if(flag) System.out.println("YES");
				else System.out.println("NO");
			}
		}
		
		
	}
	private static boolean SameFind(int[] array, int u, int v) {
		u = getParent(array, u);
		v = getParent(array, v);
		if(u == v) return true;
		else {
			return false;
		}
	}
	private static void union(int[] array, int u, int v) {
		u = getParent(array,u);
		v = getParent(array,v);
		if(u < v) array[v] = u;
		else array[u] = v;
		
		
		
	}
	private static int getParent(int[] array, int x) {
		if(array[x] == x) return x; // �̶��� �θ�
		return array[x] = getParent(array,array[x]) ;
	}
}
