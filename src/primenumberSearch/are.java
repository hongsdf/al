package primenumberSearch;

import java.io.BufferedReader;

public class are {
	public static void main(String[] args) {
		int n =97 ;
		boolean flag = prime2(n);
		System.out.println(flag);
		int Num = 10000;
		int arr[] = new int[Num+1];
		for(int i =1; i<arr.length; i++) {
			arr[i] = i;
		}
		for(int i=1; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		method(arr,Num);
		System.out.println();
		for(int i=1; i<arr.length; i++) {
			if(arr[i] !=0)
			System.out.print(arr[i] + " ");
		}
	}	
	// �ѹ��� �������� �Ҽ����� �Ǵ� �Ҷ� ���
	private static void method(int[] arr, int Num ) {
		for(int i =2; i <=Num; i++) {
			if(arr[i] == 0) continue; //����� ���� ���̶� �ؿ��� ���� ���̶� �ð� ���̰� ����.  ���⼭ ������ 2�� �����,3�ǹ���� �̷������� �ѹ��� continue
			for(int j = i+i; j <=Num; j+= i) { // 2: 4 6 8 12... 3: 6 9 12 ....
//				if(arr[j] == 0) continue; // ���� ����� ������ continue;
				// ����� ������ ������ �����Ҷ����� continue�� �ؾ���
				arr[j] = 0; //�ƴϸ� �����
			}

		}
		
	}
	// �̰� ������ ���� :
	// ex) 8 = 1 * 8 , 2 *4 ����� �̷��� �����Ѵ�
	// ����  2 * 4 == 4 * 2 �� �����Ƿ� 2�� ã�Ҵٸ� ����  4 * (2) ������ 2�� �� �ʿ� ����(�̹� �տ��� �ɷ��� ������)
	// �ð� ���⵵ o(n/2) : �������� ����
	private static boolean prime2(int n) {
		for(int i=2; i<=(int)Math.sqrt(n); i++) {
			if(n % i == 0) return false;
		}
		return true;
	}
	// ��ǥ���� �Ҽ� �Ǻ� �ð� ���⵵ o(N) : n���� Ȯ�� �ؾ��Ѵ�
	private static boolean prime(int n) {
		for(int i=2; i<n; i++) {
			if(n %i ==0) return false;	
		}
		return true;
	}
	// �����佺ü
	
	
}
