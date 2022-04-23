package Strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*���� ���, "Baekjoon Online Judge"�� ROT13���� ��ȣȭ�ϸ� "Onrxwbba Bayvar Whqtr"�� �ȴ�.
  ROT13���� ��ȣȭ�� ������ ���� �������� �ٲٷ��� ��ȣȭ�� ���ڿ��� �ٽ� ROT13�ϸ� �ȴ�.
   �տ��� ��ȣȭ�� ���ڿ� "Onrxwbba Bayvar Whqtr"�� �ٽ� ROT13�� �����ϸ� "Baekjoon Online Judge"�� �ȴ�.

    ROT13�� ���ĺ� �빮�ڿ� �ҹ��ڿ��� ������ �� �ִ�.
     ���ĺ��� �ƴ� ���ڴ� ���� ���� �״�� ���� �־�� �Ѵ�. ���� ���, "One is 1"�� ROT13���� ��ȣȭ�ϸ� "Bar vf 1"�� �ȴ�.
     
      �빮�ڴ� �빮�ڳ��� += 13 || -= 13
      �ҹ��ڴ� �ҹ��ڳ��� -= 13 || -= 13
      
     */
public class StringMehod {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String ans = "";
		for( char c : str.toCharArray()) {
			if(c >= 'A' && c <= 'Z' ) { // �빮��
				if( c -'N' >= 0) {
					c -= 13;
					ans += c;
				}else {
					c += 13;
					ans += c;
				}
			}else if(c >= 'a' && c <='z') {// �ҹ���
				if( c - 'n' >= 0) {
					c -= 13;
					ans += c;
				}else {
					c += 13;
					ans += c;
				}
			}else { //����
				ans += c;
			}
		}
		System.out.println(ans);
	}
}
