package backjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Back11720 {

	public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	br.readLine();
	int ans = 0;
	for(byte str : br.readLine().getBytes()) { // byte :  �ƽ�Ű�ڵ� �� .getByte() ->byte
//		System.out.println(str);
		ans += str - '0'; // ascII �ڵ带 ��ȯ�ϴ� ���
	}
	System.out.println(ans);
	
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		String str = sc.next();
//		int ans = 0;
//		for(int i = 0; i < n; i++ ) {
//			ans += str.charAt(i) - '0' ;
//		}
//		System.out.println(ans);
	}

}
