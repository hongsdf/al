package algorithm;

public class No20 {
	
	
	/*
	 * ���� ����
	 * �޼��� Ÿ�԰� ��ȯŸ���� ���ƾ� �Ѵ�
	 * �׸��� �Ű������� int(String)�� �޴��� �ż��� Ÿ�԰� ��ȯŸ���� �ݵ�� ��ġ
	 * ���� ��ɿ����� String,boolean,int ���� ��� �����ϴ� => �ż��� Ÿ�԰� ��ȯ���� ��ġ�ϸ� �ȴ� 
	 * 
	 * 
	 * */
	
	
	// method 
	
	public static int three369(int n) {
		int cnt = 0;
		
		while(n > 0) {
			// String o = "helloword";  ���� Ŭ�������� ���� Ÿ�� ���� ��� ����
			if(n%10 ==3 || n% 10 == 6 || n % 10 == 9) 
				cnt++;
			// System.out.print(o);
				n /= 10;
			
			
		
		}
		return cnt;
	}
	
	
	
	public static void main(String[] args) {
		/* 1 2 ¦ 4 5 ¦ 7 8 ¦ 10 11 12 ¦ 14 15 ¦ 17 18 ¦ 20 21 22 ¦ 24 25 ¦ 27 28 ¦
		 * ¦ ¦ ¦ ¥¦(33) ¦ ¦ ¦¦(36) ¦ ¦ ¦¦(39) 40 41 42 ¦
		 * 
		 * */
		
		for(int i = 1; i <= 100; i++) {	
			 int v = three369(i);
			 
			 if(v == 0){
				 System.out.print(i+" ");
			 }
			 else{
				 for(int j = 0;  j < v; j++) {
					 System.out.print("¦");
				 }
				 System.out.print(" ");
			 }
			
		}
	}
}
