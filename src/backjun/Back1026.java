package backjun;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// Gredy
public class Back1026 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int arr1[] = new int[N];
		int arr2[] = new int[N];

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < N; i++) {
			arr1[i] = Integer.parseInt(st.nextToken());
		}

		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < N; i++) {
			arr2[i] = Integer.parseInt(st.nextToken());
		}

		solution(arr1, arr2, N);

	}

	private static void solution(int[] arr1, int[] arr2, int N) {
		Arrays.sort(arr1); // ���� �������� ����
//		for (int a : arr1) System.out.print(a + " ");
//		System.out.println();
		
//		int max = -1; ����� �����ϸ� �ȵ� x
		int idx = 0;
		int sum = 0;
		//O(n^2)
		// �ѹ迭�� �������� �ٸ� �迭���� �ִ�,�ּҰ��� ã�Ƴ��� max��ġ�� ������ ����!!!
		for(int z = 0; z < arr1.length; z++) { //arr1[] N�� ��Ī
			int max = -1; // ����� �������� ������ ��� {2 7 8 3 1} ���� 8�� ������
			// arr2[]���� ���� ū ���� ����
			for(int i = 0; i < arr2.length; i++) { // arr2[] �� ��Ī
				if (max < arr2[i]) {
					max = arr2[i];
					idx = i; // ���� ū �� ��ġ�� �̾� ����
				}
				
			}
			
			sum += arr1[z] * arr2[idx]; // arr1[0] * ���� ū ����
			
//			System.out.println(arr1[z]);
//			System.out.println(arr2[idx]);
			arr2[idx] = 0; // ���� ū ���� Ȱ���ϰ� ����ߴ� ����
			
		
//			for (int a : arr2) System.out.print(a + " ");
//			System.out.println();
		}
			System.out.println(sum);
		
	}
}
