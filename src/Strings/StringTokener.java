package Strings;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTokener {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // StringTokenizer st : 
        // StringTokenizer(s) : ������ �������� ���ڿ��� ������.
        // StringTokenizer(s, ",") : ,�� �������� s���ڿ��� ������.
        // StringTokenizer(s, ",!|?") : ,!|?�� �������� s���ڿ��� ������.
        // StringTokenizer(s, ",",true) : ,�� �������� s���ڿ��� ������ (true)�����ٿ� �����Ͽ� ���, false(���� x)
        StringTokenizer st = new StringTokenizer(s," !,?._'@",false);
        // countTokens() : ��ū�� ������ ������ִ� �Լ�
        System.out.println(st.countTokens());
        // ��ū ��� ���
        // st.hasMoreTokens() : �ݺ����� ���� Token�� ���������� ����
        // st.nextToken() : ��ū�� �ϳ��� ��ȯ
        while(st.hasMoreTokens()) {
        	System.out.println(st.nextToken());
        }
        
        //  tokenizer.nextToken(); //�� �Ҹ��� ��ü���� ��ū�� �̾Ƴ����� �õ�. ���� �߻�
        //  StringTokenizer�� �������� ���ڿ��� �߶� ����ϸ� �ٽ� ����Ҽ�����. => ���ܹ߻� NoSuchElementException 
        
//        s.split(" ")
        
        scan.close();
    }
	
}
