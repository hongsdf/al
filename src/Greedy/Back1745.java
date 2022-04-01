package Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;

public class Back1745 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)) ;
		int N = Integer.parseInt(br.readLine());
		/* ���� ������ ���		
		long arr[] = new long[N];
		for(int i=0;i<N; i++) {
			arr[i] = Long.parseLong(br.readLine());
		}
		Arrays.sort(arr);
		long standard = arr[0];
		long ans = 0;
		for(int i =1; i<N; i++) {
		
			// ans, standard�� ���� ���������� ����(�������)
			 
			ans += standard + arr[i];
			standard = standard + arr[i];
		}
		System.out.println(ans);
	 */
		
		PriorityQueue<Long> pq = new PriorityQueue<Long>(); // q�� ������������ ����
		
		for(int i =0; i <N; i++) {
			pq.add(Long.parseLong(br.readLine()));
		}
		
		long ans = 0;
		while(pq.size() > 1) { // *2�� �̻���� ������ ���ϴ� ���� �ǹ̰� �ִ�. // 1����� �� �Ұ��� ���� 0
			long temp1 = pq.poll();
			long temp2 = pq.poll();
			ans += (temp1 + temp2); //  *ans�� ���� ����� ���´�
			
			pq.add(temp1+temp2); // *2���� ���� ���ؼ� �ٽ� ��ť 
		}
		
		System.out.println(ans);
		
		
		
		
		
		
	}
}
