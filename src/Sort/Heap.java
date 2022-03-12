package Sort;

public class Heap {
	public static void main(String[] args) {
		int arr[] = {10, 26, 5, 37, 1, 61, 11, 59, 15, 48, 19};
		int n = arr.length;
		for(int i=1; i<n; i++) { // 1 2 3 4 5 6
			int c= i;
			do {
				int root = (c-1)/2; // �� ����� �ڽ� ã�� // 0���� �ڽ��� 1,2 [ 1�����ڽ� 3,4 ] [2���� �ڽ��� 5,6
				if(arr[root] < arr[c]) { // �ڽ� ��� �� ���� �� ũ�� arr[root] < arr[c] ��ȯ
					int tmp = arr[c];
					arr[c] = arr[root];
					arr[root] = tmp;
				}
				c = root; // 1�� ��� 3,4�ڽĳ�带 Ž���ϰ� �θ��� 0������ Ž��
				
			}while(c != 0);
		}
		
		for(int i= n-1; i>=0; i--) {
			int tmp = arr[0];
			arr[0] = arr[i];
			arr[i] = tmp;
			int root = 0;
			int c = 1;
			
			do {
				c = root * 2 +1;
				
				if( c<i-1 && arr[c] < arr[c+1]) { // ��ū �ڽĳ���� ������ ���Ǳ� (1�� ����̸� 3,4) , (2����� �̸� 5,6)
					c++;
				}
				if(c<i && arr[root] < arr[c]) { 
					tmp = arr[c];
					arr[c] = arr[root];
					arr[root] = tmp;
				}
				root = c; //  �ڽ� ��尡 �θ��尡 �ȴ� (�� 2�� �ڽ�,5,6) => 5,6�� Ž���ҽ� 2���� ��Ʈ�̴�.
				
			}while(c<i);
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		for(int a:arr)
		System.out.print(a+" ");
		
	}
}
