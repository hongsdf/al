package Sort;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Stringcompar implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		// ���ڿ� ���̰� ������ �� 
		if(o1.length() == o2.length()) {
			// 2��° ���� ���ڿ� ���̰� ���� ���� ��
			for(int i =0; i<o1.length(); i++) {
				// ���Ұ� ���� ������ ��
				if(o1.charAt(i) != o2.charAt(i)) return o1.charAt(i) - o2.charAt(i);
			}
			
		}
		// ���ڿ� ���̰� ���� ������
		else {
			return o1.length() - o2.length();
		}
		// ������ ����
		return 0;

	}

}

class Result {

	static List<String> bigSorting(List<String> unsorted) {
//    	{1,2} => {"a","b"}
		// 6
		
//    	31415926535897932384626433832795
//    	1
//    	3
//    	10
//    	3
//    	5 
		
		Collections.sort(unsorted, new Stringcompar());
		System.out.println(unsorted);
		
		

		return unsorted;
		// Write your code here
		
	}

}

public class Hackker_sort {
	public static void main(String[] args) throws IOException {
		Result r = new Result();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<String> list = new ArrayList<String>();
		while (n-- > 0) {
			list.add(sc.next());

		}
//    	System.out.println(list);
		System.out.println((r.bigSorting(list)));
	}
}
