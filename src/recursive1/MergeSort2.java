package recursive1;

public class MergeSort2 {
	public static void main(String[] args) {
		int arr[] = {-1,7,3,20,1,0,0,19,1,-3};
//		Mergesort(arr,0,arr.length-1);
		Mergesort(arr,1,arr.length-1);

		for(int a:arr) {
			System.out.print(a+" ");
			
		}
		
	}

	public static void Mergesort(int[] arr, int start, int end) {
		// if ���� �迭�� ��� �۾����� �� ĭ���� ��ĭ�̸� start = 0 , end  = 0 �� �ǹǷ� if���� �������� ����
		// �̶��� recursive�� ����
		if(start < end) {
			int mid = (start + end) /2;
			Mergesort(arr,start,mid); // ���� ������ ���� ���� �������� �ذ��ϰ� �ؿ� �մ� ���� ����
			Mergesort(arr,mid+1,end); // ������ ���� +1�� ���������� StackOverflowError�߻� : mid�� ��ġ�� ������,
			// �߰��������� ������ ������ 
			
			// �ᱹ �� ���� ���� ��������
			
			// ���� �� (�� ���ҳ��� �ϳ��� �� �ϴ� ����)
			merge(arr,start,mid,end);
			
			
		}
		
	}

	public static void merge(int[] arr, int start, int mid, int end) {
		// �ӽ� �迭 
//		int temp[] = new int[arr.length+1];
		int temp[] = new int[end - start +1];
		int i = start;
//		int j = end;
		int j = mid+1; // mid+1 ������ : 
		// +1�� ���������� mid�� �ѹ��� ����.
		int k = 0; // �ӽ������ �ε���
		while(i <= mid && j<=end) { // &&�����̱� ������ �ϳ��� Ʋ���� ���� �����ʴ´�
			// �ΰ��� ������ ���������� : ����,������ �迭���� ������ �ϸ� �ᱹ �ϳ��� �迭�� ���� ������.
			if(arr[i] < arr[j]) {
				temp[k] = arr[i];
				i++;
				k++;
			}else {
				temp[k++] = arr[j++];
//				j++;
//				k++;
			}
			
		}
		// ������� ������ ������ ���� �迭�� ������ �����ִ� ���� ������ ����,������ �� �ϳ��� ���� �ִ� ���� �̹Ƿ� ��� ���� �ؾ� �Ѵ�.
		// ���� �迭�� �����ִٸ� �̰��� ����
		while(i<=mid) {
			temp[k] = arr[i];
			k++;
			i++;
		}
		// ������ �迭�� ���� �ִٸ� �̰��� ����
		while(j<=end) {
			temp[k] = arr[j];
			k++;
			j++;
		}
		
		// �ӽ� �迭 --> ���� �迭�� ��ġ�� ����
		for(int v = start; v<=end; v++) {
			arr[v] = temp[v-start];
//			arr[v] = temp[v] �� �ƴ����� : ���� ���� �迭�� 1~9 ������ �� ���� �ϰ� ���� ���
//			0�� �ε����� 10������ �ε����� �ǵ��� ���ƾ��Ѵ�.
//		    �׷��� ����[1]���� temp(�ӽ����� ����)�� 0��° ���� �־�� �Ѵ�
							
		}
		
		
		
	}
	
	
}
