package algorithm;

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

class Res1 {

	/*
	 * Complete the 'miniMaxSum' function below.
	 *
	 * The function accepts INTEGER_ARRAY arr as parameter.
	 */

	public static void miniMaxSum(List<BigInteger> arr) {
		// Write your code here
		BigInteger result1 = new BigInteger("");
		BigInteger result2 = new BigInteger("");

		Collections.sort(arr);
		for (int i = 0; i < arr.size() - 1; i++) {
			result1.add(arr.get(i));
		}
		for (int i = 1; i < arr.size(); i++) {
			result2.add(arr.get(i));
		}
		System.out.print(result1 + " " + result2);

	}

}

public class No1 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		long sum = 0;
		long max = 0;
		long min = 1000000000;
		while(sc.hasNext()) { // hasNext() : �Է³����� �޴´� ���� ��ư ������ �� ����
			Long n = sc.nextLong();
			// �ٽ� �˰��� ���� : ��ü ��� �� �ϳ�(���� ū��, ���� ���� ��)�� �Ÿ��� *��ü - �� = ���ϴ� ��
			sum += n ; // ��ü �����
			if(min > n) { // �� �����
				min = n;
			}
			if(max < n) { // �� �����
				max = n;
			}
		}
		// �ٽ�  result2 = ��ü - ���� ���� �� �ϳ�
		// result1 = ��ü - ���� ū �� 
		System.out.print((sum-max) +" "+(sum-min));
		sc.close();
		
		
	}

}
