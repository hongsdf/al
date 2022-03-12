package Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Merge {
	// �ӽ� ���� ����
	public static int N;
	public static int temp[] = new int[10000001]; // �ӽ� ���� ������ ����������
	public static int arr[];

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		for (int i = 0; i < N; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("�պ� ��");
		Merge1(arr, 0, N - 1);
		for (int i = 0; i < N; i++) {
			System.out.print(arr[i]+" ");
		}
	}

	private static void Merge1(int[] arr, int i, int j) {
		// TODO Auto-generated method stub
		if (i < j) { // ��ĭ���� �ɰ��� start< end �����϶��� ����
			int mid = (i + j) / 2;
			Merge1(arr, i, mid);
			Merge1(arr, mid + 1, j);
			MergeSort(arr, i, mid, j);
		}
	}

	public static void MergeSort(int[] arr, int start, int mid, int end) {

//		int temp[] = new int[end-start+1];
		// int temp[] = new int[arr.lenght];
//		temp = new int[N];
		// ���� ���� �ܰ� ��ĭ -> ���� �ö󰡴� �ܰ�� �����Ұ��̴�
		int i = start;
		int j = mid+1;
		int k = start;
		
		
		while(i <= mid && j <= end) {
			if(arr[i] <= arr[j]) {
				temp[k] = arr[i];
				i++;
			}else {
				temp[k] = arr[j];
				j++;
			}
			k++;
		}
		// ���� ������ �ű��
		if( i > mid) {
			// j <= end�� �̵� �ñ�Ű�� ����
			for(int t = j; t<=end; t++) { //[1,2] [3,4]
				temp[k] = arr[t];
				k++;
			}
		}else { //if(i <= mid )
			for(int t = i; t <= mid; t++) {
				temp[k] = arr[t];
				k++;
			}
		}
		

		for(int v= start; v<=end; v++) {
			arr[v] = temp[v];
		}
		
		
	}
}
