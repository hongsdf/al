package backjun;

import java.util.Scanner;

public class Back8958 {

	public static void main(String[] args) {
		// "OOXXOXXOOO"�� ������ 1+2+0+0+1+0+0+1+2+3 = 10���̴�.
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String arr[] = new String[n];
	
		for(int i = 0; i<n;i++) {
			int tot = 0;
			int cnt = 0;
//			sc.next();// : ������ �Է�
//			sc.nextInt(); // ���� ���� �Է�
			arr[i] = sc.next(); // n �� ������ �´� �迭 ������
			for(int j =0; j <arr[i].length(); j++) {
//				arr[i].charAt(i) char -> String : ���� (asc�ڵ�) -> ���ڿ�
			if(arr[i].charAt(j) == 'O') {
				cnt++;
				tot += cnt;
			}else {
				cnt = 0;
			}
	
			}
			System.out.println(tot);
		}
		
		
		
	}

}
