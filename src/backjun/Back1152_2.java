package backjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Back1152_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		/* The Curious Case of Benjamin Button  : 6*/
//		String str1 = br.readLine();
		int pre =32;
		int cnt =0;
		int str;
		
		while(true) {
			str = System.in.read();
            
			// �Է¹��� ���ڰ� ������ ��,
			if(str == 32) {
				// ������ ���ڰ� ������ �ƴϸ�
				if(pre != 32) cnt++;
			}
 
			// �� �ٲ��� ������ (������ �Է��� ���ͽ� cnt++)
			else if(str == 10) {
				// ������ ���ڰ� ������ �ƴϸ�
				if(pre != 32) cnt++;
				break;
			}
			
			pre = str;
			
		}
		System.out.println(cnt);
		
		
		
		
		
		
		
		
		
		
//		
//		for(int i = 0; i < str.length(); i++) {
//			
//			if(str.charAt(i) == 32) {
//				if(pre != 32) {
//					cnt++;
//				}
//			}
//			else if(str.charAt(i) == 10) {
//				if(pre != 32) 
//					cnt++;
//				
//				break;
//			}
//			pre = str.charAt(i); // pre : T,h,e
//		}
//		System.out.println(cnt);
		
		
	}
}
