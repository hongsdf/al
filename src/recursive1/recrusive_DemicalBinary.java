package recursive1;

import java.util.*;

// 10������ 2������
public class recrusive_DemicalBinary {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String ans = find(N,"");
		System.out.println(ans);
		
	}
	
	
	public static String find(int demical,String rs) {
		// base-case :Ż�� ����
		if(demical ==0) { // ���� 0�� �Ǿ�����
			return rs;
		}
		rs = demical%2 + rs;
		
		return find(demical/2,rs);
	
	}
	// ���� ����
//	num  demical%2  rs -> 	rs
//	54      0       ""   	"0"
//	27      1       "0"   	"10"
//	13      1       "10"   "110"
//	6       0      "110"   "0110"
//  3	    1      "0110"  "10110"
//  1	    1     "10110"  "110110"
//  0	          "110110"
}
