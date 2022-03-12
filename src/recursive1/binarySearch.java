package recursive1;

import java.util.Arrays;


// ������ �����ϴ� ���
// ������������ ������ �Ǿ��־�� ������ �����ϴ�.

// ���� �ؾ��ϴ� �� :  ��ǻ�Ͱ� ������ �ϳ��� ���Ƿ� �����Ͽ� ���߱� ���α׷� ����

class Main1{
	// -1 0 1 2 3 4 7 9 10 20
	public int solution(int arr[], int left,int right, int x) {
		// ã���� �ϴ� ���� ���� ���
		if(left > right) { return -1;}
		
		// 0 1 2 3
		// 0 1 2 3 4 5 6 7 8 9 
		// 4 5 6 7 8 9 
		// ������ �߰�����
		int range = (left + right)/2;
		// 4
		
		// ���� ã���� �ε��� ���� ����
		if(x == arr[range]) {
			return range;
		}
		
		// range-1 : -1�� �ϴ� ���� : ���� ���� x==arr[range]���� �ɷ�����
		// ã���� �ϴ� ���� �߰� �������� ������� �߰��� �������� ������ ������ ������.
		if(x < arr[range]) {
			return solution(arr,left,range-1 ,x);
		}
		
		
		// ������ �ٿ����� �Ѵ�.
		// 4 ~ 9
		// range+1 : +1�� �ϴ� ���� :  ���� ���� x==arr[range]���� �ɷ�����
		// ã���� �ϴ� ���� �߰� ������ ū ��� ���� ������ ������.
		return solution(arr,range+1 ,right,x);
	}
	
	
	
}







public class binarySearch {
	public static void main(String[] args) {
		Main1 m = new Main1();
		int arr[] = {-1, 0, 1, 2, 3, 4, 7, 9, 10, 20};
		Arrays.sort(arr);
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		int x = 13;
		int res = m.solution(arr,0,arr.length-1,x);
		
		System.out.println("\n"+res);
	}
}
