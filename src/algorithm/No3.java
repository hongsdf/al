package algorithm;

import java.util.Scanner;

public class No3 {
//�ֺ�� ���ϱ�
	/* �ٽ� �ֿ� ����
	 * �� �ڸ����� ������ �Ͽ� Ȱ���Ϸ��� �迭(�ڷᱸ��) �� ���� ����
	 * 1.mode[arr[i]]++ ���߹迭
	 *  1 1 0
	 * arr[0] == 1 , arr[1] == 1, arr[2] == 0
	 * mode[arr[0]]++ => mode[1] == 0 -> 1
	 * mode[arr[1]]++ => mode[1] == 1+1 --> 2
	 * mode[arr[2]]++ => mode[0] == 0-> 1
	 * 
	 * mode�� 1~9 ���� for���� ���� if���� Ȱ���Ͽ� ����
	 * 
	 * 
	 * */
	public static void main(String args[]) {
//		1 1 2 0 1
//		1 : 3 (�ֺ��)
//		2 : 1
//		0 : 1
		Scanner sc = new Scanner(System.in);
		
		int arr[]  = new int[10];
		for(int i = 0 ; i<10; ++i) { // index[0] ~ index[9] : 10����
			arr[i] = sc.nextInt();
			
		}
		
		int mode[] = new int[10];
		
		// mode[i] == 3
		
//		 1 2 1 1 2 3 4 1 1 4
//		mode[1] == 5
//		mode[2] == 2
//		mode[3] == 1
//		mode[4] == 2
		for(int i = 0; i <arr.length; i++) {
			mode[arr[i]]++; // arr[i] : �� �ڸ��� ���ڸ� �������ִ°� => mode[arr[i]]++ ���ڰ� 1�� ������

//			System.out.println(arr[i]+"�� ������ ���� Ƚ��"+mode[arr[i]]);
		}
		
		int modeCnt = 0 ; //Ƚ��
		int Num = 0 ; //�ֺ��

		for(int i = 0 ; i < 10; i++){
			if(modeCnt < mode[i]) { // 0 < 0�� ����Ƚ��(0)
				Num = i; 
				modeCnt = mode[i];
				
			}
		}
		System.out.println("�ֺ�� : "+Num +"����Ƚ�� :"+modeCnt);
		
		

	}
}
