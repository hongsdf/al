package backjun;

import java.util.*;

public class Sort1 {
	public static void main(String[] args) {
		
//		********** �߿�
		
		// Collections.reverseOrder �Ұ�
//		int arr[] = {1,4,5};
//		Arrays.sort(arr,Collections.reverseOrder()); // �Ұ� : primativeŸ���� �Ұ��ϹǷ� boxing �ʿ�
		
		//----  ���� �ѵ�
		Integer N[] = {1,4,5};
		Arrays.sort(N,Collections.reverseOrder());
		// -------
		for(int n:N) {
			System.out.print(n);
		}
		System.out.println();
		
//		 *****************
		
		
		List<Integer> list = new ArrayList<>(Arrays.asList(1,4,5));
		Collections.reverse(list);
		for(int s1:list) {
			System.out.print(s1);
		}
	}
}
