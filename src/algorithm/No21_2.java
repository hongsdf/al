package algorithm;

/*�ߺ��� �� ����*/
/*
 * �ֿ� ���� ����
 * brr[arr[i]] : ���� �迭
 * boolean[] brr = 1 ~ n ���� ������ 0 or 1 Ȯ�� ���� ;
 * int arr[] : �迭
 * brr[i] ���� i�� ��½� brr[i] : (== 1 �̶��)�� ���� ������ ��µȴ�
 * 
 */
public class No21_2 {
	public static void main(String[] args) {
		 // 0 1 8 9
		boolean[] brr = new boolean[101]; // 100 ���� �� TRUE OR FALSE Ȯ�� ����
		int arr[] = new int[101]; // 100 ����
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 13;
		arr[3] = 20;
		arr[4] = 11;
		arr[5] = 21;
		arr[6] = 11;
		arr[7] = 21;
//		for(int i = 0; i <arr.length; i++) {
//			System.out.print(arr[i] + " ");
//			
//		}
		
		for(int i = 0; i <= 100; i++) {
			// brr[i] = arr[i]
			brr[arr[i]] = true; // brr[arr[0] : 1 ]  : true;
			
		}
		for(int i = 1; i <= 100; i++) {
			if(brr[i]) {
				System.out.print(i+" ");
			}
			
		}
		
		// 1 2 13 20 11 21 11 21
		// 1 2 11 13 20 21
		// �ѹ��̶� �����ϸ� true
		
//		
//		ArrayList<Integer> list = new ArrayList<>();
//		list.add(1);
//		list.add(2);
//		for(Integer e: list) {
//			System.out.println(e);
//			
//		}
//		
//		
		
		
	}
}
