package backjun;

import java.util.*;

public class Back2231 {
	static int divNum(int n) {
		int ans = 0;
		for(int i =1; i< n; i++) { // 155 = 1 + 5 + 5 166
			int number = i; //155
			int sum = 0; // ����� �����ϴ� ���� while���ȿ� �����ϸ� ���������� �ǹǷ� ���� ������ if()���� int sum = 0
			
			while(number !=0) {
				 sum += number%10;// 5 5 1	
				number /=10;
			}
			// number == 0 
			if(i + sum == n) {		
				ans = i;
				break;
			}
				
		}
		return ans;	
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ans1 = divNum(n);
		System.out.println(ans1);
		sc.close() ;
	}
}
