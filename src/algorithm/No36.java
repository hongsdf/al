package algorithm;

import java.util.Scanner;

/*��ȭ�� ����(DP)*/
/* 1,2,3 ���ڷ� n�� ǥ���ϴ� ����� ��
	1 = 1  : 1����
	
	(2) : 2����
	'1' + 1
	 2
	
(3) : 4����
'1 + 1'  +1
'2 + 1'
1 + 2
3
(4) : 7 ����
'1 + 1 + 1'+ 1
'2 + 1' + 1
'1 + 2' + 1
'3' + 1

1 + 1 + 2
1 + 3
2 + 2
(5) 
'1 + 1 + 1 + 1' + 1
'2 + 1 + 1' + 1
'1 + 2 + 1' + 1
'3 + 1' + 1
'1 + 1 + 2' + 1
'1 + 3'+1
'2 + 2'+1
	
'1 + 1'  +1 + 2
'2 + 1' + 2
1 + 2 + 2
3 + 2

'1' + 1 + 3
	2 + 3




* [n] = [n-1] + [n-2] + [n-3] 

5C2  = 5 4 3 2 1/ 3 2 1 * 2 1 = 8
3C2 =  3 2 1 /  1 * 2 1
	 
	  	_ _
	  	a b
	  	b a
	  	a c
	  	c a
	  	c b
	  	b c 
*/



public class No36 {
	
	static int func(int n) {
		if(catche[n] != 0) { //catche[4] �� �Է��ϸ� ó������ catche[4] : 0 �̹Ƿ�
			return catche[n]; // ���⼭ Ż��
		}
		// ���� ����
		//  4  = 1�� ����Ǽ� + 2�� ����Ǽ� + 3�� ����� �� : 7
		return catche[n] = func(n-3) + func(n-2) + func(n-1);
	}
	
	static int catche[] = new int [1000];
	
	public static void main(String[] args) {
		 // 7���� ���
		/* �ֿ� ����
		 * cathe[n] = ? : n�� ǥ���Ҽ� �ִ� ����� ��
		 * 
		 * 
		 * */
		
		catche[1] = 1; // 1�� ǥ���Ҽ� �ִ� ����� �� 
		catche[2] = 2; // 2�� ǥ���Ҽ� �ִ� ����� ��
		catche[3] = 4; // 3�� ǥ���Ҽ� �ִ� ����� �� 
		// catche[4] = cathe[1] + cathe[2] + cathe[3] 
		// cathe[n] : n�� ǥ���Ҽ� �ִ� ����� ��
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int answer = func(n);
		System.out.println(answer);
		
		
	}
	
	
	
	
}
