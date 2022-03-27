package Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Back1541 {
//	55-50+40 = 55 - 90  = -35
//	55 -(50+30+60)
//	55 -(50+30+60) -60-70
//	50 -140 -130 = -220
	
	
//	55 -(50+30+60-60-70)
//	50 -140 -130 = -220
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		String[] s1 = s.split("-");
//		for(String s2:s1) System.out.println(s2);
		
		//------------------------------------------
		// ù���� ����̱� ������ �̸� �ְ� �����Ѵ� : ������ �̰͵� ������ �߻��Ѵ�
		// ���� ? : 10+20+30+40 ó������ - ��ȣ�� ������ �и��� ���� ���� �����̹Ƿ� 10+20+30+40���� ���ڿ��� ���Ҽ� ����
		// java.lang.NumberFormatException : �ѹ� ���� ����
		// int answer = Integer.parseInt(s1[0] );
	    //	------------------------------------------------
		
		int answer = Integer.MAX_VALUE;
		
		
		for(int i = 0; i<s1.length; i++) {
			int sum = 0;
			// -�������� �и��� �迭�ȿ��� �ٽ� +�� �迭�� ������ �ٽ�
			String[] s3 = s1[i].split("\\+"); // ���Խ� ����
			for(int j =0; j <s3.length; j++) {
				// +���� �����迭�� ���Ҹ� ���Ѵ�.
				sum += Integer.parseInt(s3[j]);
			}
			
			// ���� : java.util.regex.PatternSyntaxException
			// String[] s3 = s1[i].split("+"); �̷��� �ڸ��� �ȵ� : ���Խ� �����߻�
			
			if(answer == Integer.MAX_VALUE) { // �� ����� ù���� �ִ� �۾�
				answer = sum;
			}else {
				answer -= sum; // ���� ������ ����.
				
			}


		}
		
		System.out.println(answer);

	}
	
}
