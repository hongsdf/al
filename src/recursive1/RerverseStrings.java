package recursive1;

import java.io.BufferedReader;

public class RerverseStrings {
	public static void main(String[] args) {
		
		String s = "dcba";
		String ans = reverse(s,"");
		System.out.println(ans);
	}
	public static String reverse(String s,String res) {
		// base-case
		if(s.equals("")) {
			return res;
		}
		res += s.charAt(s.length()-1); // abcd
		return reverse(s.substring(0,s.length()-1),res) ;
		
		
		
		
	}
//	 ����
//	res(���ڿ��� ���ϳ�)   reverse(,)
//	a 				   dcb(0���� ������������) res : a
//  b 				   dc(0���� ������������) 	res : ab
//	c				   d(0���� ������������) 	res : abc
//	d				   (0���� ������������) 	res : abcd
//                     
//	��� : return abcd
}
