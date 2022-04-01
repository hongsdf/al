package Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;
// 100,000 * 100,000 = 10000000000
public class Back1946 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		while(T --> 0) {
			int N = Integer.parseInt(br.readLine());
			int arr[][] = new int[N][2];
			for(int i = 0; i <N; i++ ) {
				StringTokenizer st = new StringTokenizer(br.readLine(), " ");
				int u = Integer.parseInt(st.nextToken());
				int v = Integer.parseInt(st.nextToken());
				arr[i][0] = u;
				arr[i][1] = v;
				
			}
			int cnt = solution2(arr,N);
			System.out.println(cnt);
			
			
		}
	} 
	// �ð� �ʰ� ���� ����:
	// N : 100,000�̶�� ����
	// �׷��� 2�� for���̿��� 100,000 * 100,000 �ð��ʰ�
	
	
	
	private static int  solution1(int[][] arr, int n) {
		int cnt = 0;
		for(int i =0; i <n; i++ ) {
			boolean flag = true; // ������ ���õǾ� �ִ�.
			for(int j = 0; j <n; j++) {
				if(i == j) continue;
				if(arr[i][0] > arr[j][0] && arr[i][1] > arr[j][1]) { // �������� ���ϴٰ� ���غ��� ���ڰ�ũ��(���ٶ�� �ǹ� ���⼱!)
					flag = false; // �� ������ ���� ������ false �ϰ� 
					break; // �ٷ� ���� �ص� �ȴ�(�� �ٷ� ã��) ������ �� ���ʿ� ����
				}
			}
			if(flag) cnt++; // ��� �����ִٸ� cnt++
		}
		
		return cnt;
	}
	
	// 1�� for������ �ذ��ؾ��Ѵ� �׷��� �ð��ʰ��ذ�
	
	private static int  solution2(int[][] arr, int n) {
		Arrays.sort(arr,new Comparator<int[]>() { // int[][] --> int[], int[] -> Integer

			@Override
			public int compare(int[] o1, int[] o2) {
				
				return o1[0] - o2[0];
			}
			
		});
		// �ϳ��� ����[0]���� �����ϰ� ������ �ѹ迭[1]�θ� �����ϱ�
		
		int cnt = 1;
		// ������ �����Ұ��̴�
		// [0]������ ������������ ������ �̹� �Ǿ� �ִ�.
		// 1 4
		// 2 5
		// 3 7
		// ù��° ���� ����
		int standard = arr[0][1]; // arr[0][1]�迭�� ù��°�� ������ ��Ƴ��´�
		for(int i=1;i<n; i++) { // ������ �迭�� ��ȸ�ϴ�
			if(arr[i][1] < standard) { // ���غ��� �켱���� ��(���� ������)�� �ִٸ� ���� ����
				// ���� ����
				standard = arr[i][1];
				
				cnt++;
			}
		}
		
		
		
		return cnt;
	}
	
	
	
}
