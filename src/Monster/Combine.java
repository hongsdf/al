package Monster;

import java.util.PriorityQueue;

public class Combine {
	public static void main(String[] args) {
		int arr[] = {6,10,2};
		int n = arr.length;
		int r = 2;
		boolean visit[] = new boolean[n];
		int output[] = new int[r];// ���� ����
		// ��Ʈ��ŷ ������� ���� ����
//		for(int i = 1; i<=n; i++) {
//			// ��� ���� ã�� 1~r����
//			System.out.println(i+"�� ����");
//			comb(arr,visit,0,n,i); // �����迭,�湮����,������ġ,n��,i ���ռ�(����)
//		}
		// Ư�� r���� ���� �� ã��
		comb(arr,visit,0,n,r); // �����迭,�湮����,������ġ,n��,r���ռ�
		
	}

	private static void comb(int[] arr, boolean[] visit, int pos, int n, int r) {
		// nCr:=����
		if(r == 0) { // r:=�� �ٿ����� , ������ġ�� �����ϸ�
			save(arr,visit,n);
			return;
		}
		// ��Ʈ��ŷ
		for(int i = pos; i<n; i++) {
			visit[i] = true; // üũ
			comb(arr,visit,i+1,n,r-1);
			visit[i] = false;
		}
	}

	private static void save(int[] arr,boolean visit[],int n) {
//		PriorityQueue<int[]> pq = new PriorityQueue<int[]>((a,b) ->(a[0]-b[0]) );
		for(int i= 0; i<n; i++) {
			if(visit[i]) {
				System.out.print(arr[i]+" ");
			}
		}
		System.out.println();
		
	}
}
