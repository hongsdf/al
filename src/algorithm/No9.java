package algorithm;

public class No9 {
	public static void main(String[] args) {
		int in = 1234;
//		1+2+3+4 = 10
//		1234/10 =123 ...4
  //		123/10 = 12 ...3
//		12/10 = 1 ...2
//		1/10 = 0 ...1
			
//		���1
		int mot = 0; //������ �����ϴ� ����
		int num = 0; // �� �ڸ��� �հ� ����
		while(in > 0) {
			mot = in%10;
			in = in/10;
			num += mot;
		}
		System.out.println(num);
		
		
		String num2 = "1234";
		
		
		char b[];
		b = num2.toCharArray();
		
		int tot = 0;
		for(int i = 0 ; i<b.length; i++) {
			 System.out.print(b[i]);
			 tot += b[i];
		}
		System.out.println(tot);
		
	}
}
