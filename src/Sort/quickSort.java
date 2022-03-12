package Sort;

public class quickSort {
	public static void main(String[] args) {
		int arr[] = {3, 2, 1, 6, 9, 5, 4, 7, 8};
		int n = arr.length;
		quick(arr,0,n-1);
		for(int i =0; i<n-1; i++) {
			System.out.print(arr[i]+" ");
		}
	}

	private static void quick(int[] arr, int start, int end) {
		if(start >= end) { // �� ĭ�� �Ǹ� : ��� �Լ��� ������ ���̸� �ᱹ start �� end�� ���� �ȴ� �׶� �� ��ĭ
			return;
		}
		
		int pivot = start; // ����
		int i = start+1; // ó�� �ε���
		int j = end; // ������ �ε���
		int temp;
		// base-case
		
		while(i <= j) { // i�� j�� �������� ���������� ����
			System.out.println("���");
		
		// i�� ���������� ���� ���� ���غ��� ū ���� �ε��� ���� �����
		while(i <= end && arr[i] >= arr[pivot] ) { // arr[i] <= arr[pivot]
			// i <= end �̰� �� �ڿ� ������ �ȵɱ�? if(arr[i] <= arr[pivot] && i <= end)
			i++;
		}

		// j�� �������� ���� ���� ���غ��� ���� �� �ε������� �����
		while(arr[pivot] >= arr[j] && j > start) {
			j--;
		}
		if(i > j) {// �� ������ pivot �ڸ��� j �� �ٲ۴�
			temp = arr[j];
			arr[j] = arr[pivot];
			arr[pivot] = temp;
		}else { // �ƴ϶�� i �� j�� �ٲ۴�
			temp = arr[j];
			arr[j] = arr[i];
			arr[i] = temp;
		}
	}
		// �ᱹ �������� �ϳ��� ���ϰ� �Ǹ� j�� �����̵ȴ�(j == ����) j�� �������� �� ������ ������ ��� ȣ��
		quick(arr,start, j-1);
		quick(arr,j+1,end);
		
	}
}
