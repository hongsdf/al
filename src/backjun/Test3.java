package backjun;

import java.util.Scanner;


public class Test3 {
	public static boolean[] prime;
	public static void main(String[] args) {
 
		Scanner in = new Scanner(System.in);
		int M = in.nextInt();
		int N = in.nextInt();
		
		prime = new boolean[N + 1]; // ���� ����
		get_prime(); // �۾��� prime������ T,F�� ���� ����
				
		for(int i = M; i <= N; i++) {
			// false = �Ҽ� 
			if(!prime[i]) System.out.println(i);
		}
	}
 
 
	// �����佺�׳׽��� ü �˰���
	public static void get_prime() {
		// true = �Ҽ��ƴ� , false = �Ҽ� 
		prime[0] = true;
		prime[1] = true;
		
		for(int i = 2; i <= Math.sqrt(prime.length); i++) { // ������ �޼���
			if(prime[i]) continue;
			for(int j = i * i; j < prime.length; j += i) { //  4 5 6 8 9
				prime[j] = true;						//     T F T T T
 			}
		}
	}
}