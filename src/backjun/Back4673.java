package backjun;

import java.io.*;

public class Back4673 {
//	static int mode[] = new int[1000];

//	static boolean flag[] = new boolean[10001];
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		boolean flag[] = new boolean[num +1];
		for(int i = 1; i <num+1;i++) {
			int n = d(i);
			
			if(n < num+1)
			flag[n] = true;
		}
		
		
		
		for(int i = 1; i< num+1; i++) {
			if(!flag[i]) {
				System.out.println(i);
			}
		}
		
		
		
		
		
	}
	
		
	
	


		public static int d(int n){ // 17 ���⼭ �ɸ��� ���� �����ڰ� �ִ� ���� �̴�
			int sum = n;
		    
			while(n != 0){
				sum = sum + (n % 10); // ù ° �ڸ��� , 17 + 7 = 24 25
				n = n/10;	// 10�� ������ ù ° �ڸ��� ���ش� 1 0
			}
		    
			return sum; // 25
		}
	

}
