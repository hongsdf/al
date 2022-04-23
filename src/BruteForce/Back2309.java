package BruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
/*
 * 20
	7
	23
	19
	10
	15
	25
	8
	13
 * 
 * 
 * 
 * */
 
public class Back2309 {
	public static int ans[];
	public static int temp[];
	static int n = 7;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int arr[] = new int[9];
		ans = new int[n];
		temp = new int [n]; // ans�� ���纻 �߰� : �ʿ��� ���� ans�� �����ϰ��� ���Խ�Ű�� �����ϴ� ���Ҵ� �ٽ� �����Q���ϴµ� �̹� ����Ǿ��ִ�.
		// �ؿ� ����
		// arr = 1,2,3,4,5
		// ans = [1,2,3]�� �����ϰ� k = 3�̹Ƿ� 3���� Ȯ���ϰ� �ٽ� �����Q���Ѵ�. => [1,2,0] �̷���
		// ������ ���� ���������۾��� ���� �ʴ°�� [1,2,3]���� �Ǿ��ְ�, ���ſ� ������ �߻��Ѵ�.
		// �׷��� ans������ ������ ==> temp[]��� �迭�� �ٽ� ��Ƽ� ����ϸ� ans[] �迭�� �����ϰ� ���
		
		// Arrays.copyOf( int [] a  , a)
		// Arrays.copyOf(�����迭, ������ ����);
		// Arrays.copyOfRange(���� �迭, ������ �����ε���, ������ ���ε���) �ε����� 0���� �����ϴ°� ����

		
		
		
		for(int i = 0; i <9; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(arr);
		combine(0,0,arr); // ù���� �Ű����� : ��(üũ) , �ι�° �Ű����� : ���۳��
		
		for(int a : temp ) System.out.println(a);
		
		
		
		
		
		
	}

	private static void combine(int cnt, int start,int arr[]) {
		// base-case : 7���� �� ã������ üũ
		if(cnt == 7) {
			int sum = 0;
			for(int i = 0; i <7; i++) {
				sum += ans[i];
			}
			if(sum == 100) {
//				for(int a:ans) System.out.println(a);
				temp = Arrays.copyOf(ans, n);
			}
			return;
		}
		// ��Ͱ� �ʿ��� ���:
		// 7 20 23 19 10 15 .. ���� �̿��� ���ҿ� ���ϴ� ���� �ƴ϶�
		// 7 23 19 15 �� ������ �ִ� ����� ���յ� ��������Ѵ�.
		// �̷��� ��͸� ������ ����
		// ������ 
		// 7 20 23
		// 7 20 19
		// 7 20 15 ��  ��� ���� Ž�� ���� 
		for(int i = start; i<arr.length; i++) {
//			ans[i] = arr[i]; // outBound ���� �ֳĸ�? : ans[]�� 7�����ε� arr[] : 9�����̹Ƿ�
			// ans[9] = arr[9]�� ���� ���� �ʴ´�.
			// �ذ� ���
			ans[cnt] = arr[i];
			
			combine(cnt+1,i+1,arr);
		}
		
		
		
	}
}
