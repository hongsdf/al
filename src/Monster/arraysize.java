package Monster;

import java.io.*;
import java.lang.*;
import java.util.*;


public class arraysize {
	public static final Scanner scanner = new Scanner(System.in);

	/**
	 * �迭�� N���� ���Ұ� �������� ���� ������ ǥ���� �� �ִ��� �Ǵ��ϴ� �Լ�
	 * @param data
	 * @param n
	 * @return
	 */
	public static boolean isConsecutive(int[] data, int n)
	{
		// ���� ������ Ǯ�� o(n^2)
    // �ٽ� �迭 ��ȸ o(n)�� �Ͽ� 
		//data[i]+1 == data[i+1] �� o(n^2) 
		
		// �ִ� , �ּҰ��� ���ؼ� �׻��� ������ ���� M
		// M ĭ�ȿ� ���Ұ� �� �־����Ѵ�.
		
		// M = G + L -1 : ĭ��
		
		// M < N
		// [1,2,3]
		// N : 4 �̰� M : 3+1-1 = 3
		// [1,2,2,3]�ߺ� ������ ä�����Ѵ�.
		
		
		// M > N
		// [1,2,3,4,5]
		// N = 3, m =4+1-1 = 4
		// 3ĭ�� 4���� ä��� ? => ũ�� �ʰ�
		
		// M == N
		// [1,2,3,4,5]
		int l,g,m;
		l = data[0];//�ּҰ�
		g = data[0];//�ִ� ��
		
		for(int i = 0; i<n; i++){
			if(l > data[i]){
				l = data[i];
			}
			// esle if�� ������� �ʴ´� ���Ұ� �ϳ���� �����Ǵ� �ش� �ǹǷ�
			if(g < data[i]){
				g = data[i];
			}
		}
		m = (g - l + 1); // �󱸰� ��� ���� [a,b] = a + b - 1
		if(m == n){
			return true; 
		}
		return false;
	}

	public static void main(String[] args) throws Exception {
		int n = scanner.nextInt();
		int[] data = new int[n];
		for(int i = 0 ; i < n ; i ++)
		{
			data[i] = scanner.nextInt();
		}

		boolean result = isConsecutive(data, n);

		if(result)
		{
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}
	}
}
