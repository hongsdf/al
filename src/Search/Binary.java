package Search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//����Լ��� ����� ������ ������ �ٿ����� �����Ѵ� 
//�ð� ���⵵ O(log2^N)
public class Binary {
	public static int count = 1;

	public static void main(String[] args) throws NumberFormatException, IOException {
		int arr[] = { 1,2,3,4,5,6,7,8,9,10 };
		Arrays.sort(arr);
		for(int a:arr) {
			System.out.print(a+" ");
		}
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int goal = (int) (Math.random()*10);
		System.out.println("���䰪 :" + goal);
		int target = Integer.parseInt(br.readLine());

		int n = arr.length;
//		int res = solution(arr,0,n-1,target);
//		if(res != -1)
//		System.out.println(res+"��° ���� ã�ҽ��ϴ�");

		while (goal != target) {
			System.out.println("���ڸ� ���Ͻÿ�");
			target = Integer.parseInt(br.readLine());
			count++;
			if(goal < target) {
				System.out.println("down");
			}else if(goal > target) {
				System.out.println("up");
			}
			
		}
		System.out.println("�����Դϴ�.  ����Ƚ�� >>"+ count);
		
		
	}
}
