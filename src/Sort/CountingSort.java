package Sort;

public class CountingSort {
	public static int temp[] = new int[30];
	public static void main(String[] args) {
		int arr[] = {1,2,1,1,1,1,3,5,3,3,4,5,30};
		for(int i=0; i<temp.length;i++) {
			temp[i] =0;
		}
		for(int a:temp) {
			System.out.print(a +" ");
		}
		System.out.println();
		
		for(int i=0; i<arr.length; i++) {
			temp[arr[i] - 1]++; // 1���� 0���� , 2���� 1���� .. 3���� 2���� 5���� 4����
		}
		for(int a:temp) {
			System.out.print(a +" ");
		}
		System.out.println();
		 // �� �ε����� ���� ���� ����ϴ� ���
		for(int i =0; i<temp.length; i++) { // temp ������ �a��
			if(temp[i] !=0) { // 0���� �ƴ� temp�����̸�
				for(int j =0;  j < temp[i] ; j++) { // �ش� temp[i]���� ���� ��� �̶� �ؿ� ���ϰ�� ���x, Ƚ����
					System.out.print((i+1)+ " ");
				}
			}
		}
	}
}
