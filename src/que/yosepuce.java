package que;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.StringTokenizer;


public class yosepuce {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," "); //buffer�� ���� �ֱ�
		LinkedList<Integer> q = new LinkedList<Integer>();
		List<Integer> lsi = new ArrayList<Integer>();
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
//		System.out.println(n);
//		System.out.println(m);
		for(int i=0; i<n; i++) {
			q.add(i+1);
		}// 0 1 2 3 4 5 6 
		 // 1 2 3 4 5 6 7 
		 // (1 2) 3 4 5 6 7 1 2 
//		System.out.println(q.get(3));
		// q.size() > 1������ : q.isEmpty()�� �����ص� �ȴ� ������ �̷��� �����ϸ� ������ �Ѹ��� ã���� �ִ�.
		while(q.size() > 1) {
			for(int i =0; i < m-1;i++) { // m �ε����� �ش� ���������� ����ó�� �ڷ� �ѱ��.
				int curr = q.poll(); // ť�� �ش� �����ʴ� ���� ����
				q.add(curr); // �ѱ�� �۾� �ٽ� ť�� �ִ´�
			}
			lsi.add(q.poll() ); // m��° ���� ���� [3���� �ε��� 2]
			
			
		}
		System.out.print("<");
		// �̰��� �����ϸ� �ᱹ �ϳ��� ���´�
		for(int a:lsi) {
			System.out.print(a+", ");
			
		}
		// ������ ���� ���Ҹ� ���⼭ ���
		System.out.print(q.poll() ) ;
		System.out.println(">");
	}
}
