package backjun;

import java.util.*;
import java.util.Scanner;

public class Back1929 {
//	2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79,
	static void primeNumSearch(int n, int m) {
		boolean flag = false;
		List<Integer> arr = new ArrayList<>();
		// 4 5 6 7 8 9 10 11
	for(int j =n; j< m; j++) {
		for(int i=2; i<j; i++) {
			
			if(j%i == 0) {
				flag = false;
				break; // break�� ���ָ� �ߺ����� ��� ����. ex)������ �������� �ٷ� ���� =>
			}
			else {
				flag =true;
			}
		}
		if(flag) arr.add(j);
		

	}
	for(int i=0; i<arr.size();i++) {
		System.out.println(arr.get(i));
	}
		
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();  int m = sc.nextInt();
		primeNumSearch(n,m);
	}
}
