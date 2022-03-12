package Sort;

public class heap1 {
	public static void main(String[] args) {
		int arr[] = {10, 26, 5, 37, 1, 61, 11, 59, 15, 48, 19};
		int n = arr.length;
		for(int i=1; i<n;i++) { // 0   1 ~ 9  10
			int childnode = i;
			do { // heaf ���� : �ִ밪/�ּҰ��� ã�� ��Ʈ�� ����ø���
				// childnode 1���̶��  1���� �θ� ã��
				int root = (childnode-1)/2;
				// childnode ��尡 �� ũ�ٸ� root�� ��ȯ
				if(arr[root] > arr[childnode]) {
					int tmp = arr[childnode];
					arr[childnode] = arr[root];
					arr[root] = tmp;
				}
				childnode = root;
				
			}while(childnode !=0);
			
		}
		
		
		// ���� ��Ʈ�� �����ϰ� ��ȯ�ϴ� �۾�
		for(int i =n-1; i >=0; i--) {
			// arr[0] : root
			int tmp = arr[0];
			arr[0] = arr[i];
			arr[i] = tmp;
			
			int root = 0; // root: 0
			int c =1; // �ڽ��� 1����� ����
			
			do {
				c = 2 * root +1; // 2 * : �ڽ� ��尡 2���� �̹Ƿ� ����, ����Ʈ���̸� 3*root +1
				// �� ����� �ڽĳ�� 2���� ū �� ã��
				if(c < i-1 && arr[c] > arr[c+1]) {
					// ���� ��尡 arr[c]�� ũ�� �� ���� ���� ���� ���� ����
					// ������ ��尡 ũ�� ���� 2�� �ڽ� ��带 ã�� 5,6��
					// �� �ڽ��� ū ���� ����
					c++;
				}
				//
				// ū �ڽ� ���� root�� ��ȯ heaf ����
				if( c <i && arr[root] > arr[c]) {
					tmp = arr[c];
					arr[c] = arr[root];
					arr[root] = tmp;
				}
				// �ڽ��� ��Ʈ�� �Ǿ� �ڽ��� ����� �ڽ� ������� Ž���� ���� 0->1 || 2 ->3,4 || 5,6
				// ���� ��� ���� Ž��
				root = c;	
			}while(c < i); //c < 9(1~8) // c < 8 (1~7) .... c < 2 ( 1 ~ 2)
			// �� ��� 1~9 , 1~8, 1~7 ... 1~2
		}
		
		for(int i =0; i<arr.length; i++) {
			System.out.print(arr[i] +" ");
		}
		
	}
}
