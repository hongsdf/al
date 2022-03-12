package recursive1;

// ���� ���� -> ū ������ ���� ������� �ذ�
public class MergeSort {
	public static void main(String[] args) {
		int arry[] = new int[] {-5,20,2,3,10,0};
		MergeSort(arry,0,arry.length-1);
		for(int a:arry) {
			System.out.print(a+" ");
		}
	}
	
	
	
	public static void MergeSort(int arr[], int s, int e) {
		if(s < e) {
			int m = (s+e) /2;
			// ���� �۾�
			MergeSort(arr,s,m); // ���� 
			MergeSort(arr,m+1,e); // ������ +1 ����: ���ʹ迭�� �� �۱� ���� +  �߰������� ��ġ�� ������
			// ���� ����
			Merge(arr,s,m,e);
		}
		
	}



	public static void Merge(int[] arr, int start, int mid, int end) {
		// �ӽ� �迭 : temp ������������ �ջ��� ���� �ʱ����� �ϼ� �ǰ� ������ �ٽ� �ִ´�
		int temp[] = new int[end-start+1];
		// int temp[] = new int[arr.lenght];
		
		// ���� ���� �ܰ� ��ĭ -> ���� �ö󰡴� �ܰ�� �����Ұ��̴�
		int i = start;
		int j = mid+1;
		int k =0;
		
		
		// �� ���� ����,������ �迭�� ���� �����͸� �ΰ� �����ϱ����ؼ� temp �� ä���ֱ�
		//   ���� �迭  && ������ �迭  (&& ������ ���� merge ������ �� �迭�� ���� �ȴ�.
		while(i<=mid && j<=end) {
			if(arr[i] <= arr[j]) {
				temp[k] = arr[i];
				i++;
				k++;
			}else {
				temp[k] = arr[j];
				j++;
				k++;
			}
		}
		// ���� ���� �迭���� �ӽ�������� ���� ä���
		while( i<= mid) {
			temp[k] = arr[i];
			k++;
			i++;
		}
		
		while(j<= end) {
			temp[k] = arr[j];
			j++;
			k++;
		}
		// �ӽ� ������ �������� �ű��
		for(int v =start; v<=end; v++) {
			arr[v] = temp[v-start]; // temp[v-start] : �� ���� 
			// -5 0 2 3 10 20 �迭���� 1���ε������� 4�����̱����� �����ϰ� ���� ���
			// 0 2 3 10 �迭�� temp[0]�� 0�ϰ��̴� ������ ���� �����ʹ� arr[1] = temp[0]�� ���� �ϹǷ�
			// temp[i-start] :  arr[1] = temp[1-1] �� ���̴�.
			// arr[3] = temp[(0) :  3 - 3]
			// arr[4] = temp[(1) :  4 - 3]
			
			// ���� �ʿ�
		}
		
	}
}
