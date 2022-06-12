package Monster;

import java.util.*;
import java.io.*;
import java.util.*;
import java.lang.*;

public class Chapter6D {
	public static void main(String[] args) {
		// ��Ʈ��ŷ�� �̿��� ��� ���� ã��
		int n = 3;
		int arr[] = {10,20,30};
		boolean visit[] = new boolean[n];
		
		// arr �迭���� 2���� ������ ����� �ִ� ��� ���
		
		int r = 2;
		
		combine(arr,visit,0,arr.length,r);
		
		
	}

	private static void combine(int[] arr, boolean[] visit, int start, int n, int r) {
		// base-case
		if(r == 0) {
			print(arr,visit,n);
			return;
		}
		// implement
		// ������ ���� ~  n���� ������ ���ư��� �� �ε����� ���Խ�Ű�ų�, ���Խ�Ű�� ������ ��ȸ
		for(int i = start; i < n; i+=1) {
			visit[i] = true; // ���� ���״�.
			combine(arr,visit,i+1,n,r-1); // 3,5��° �Ű������� �������� ���Ѵ�. 
			// r-1�� �����Ѵٴ� ���� 1���� ���Խ�Ų�ٴ� �ǹ� ==> r == 0 �̵Ǹ�(������ ������ �� ã�Ҵ�) 
			visit[i] = false; // ���� ��Ű�� �ʾҴ�.
		}
		
	}

	private static void print(int[] arr, boolean[] visit, int n) {
		List<Integer> list = new ArrayList<>();
		for(int i = 0; i <n; i+=1) {
			if(visit[i] == true) {
				// �������� ����
				list.add(arr[i]);
				System.out.print(arr[i]+" ");
			}
		}
		Collections.reverse(list);
		for(int i = 0; i <list.size(); i++) {
			System.out.print(list.get(i) +" ");
		}
		System.out.println();
		
	}

	// ��� �Լ��� ��� ���� ���ϱ� 
	
//public class Chapter6D {
//	public static void main(String[] args){
//		Scanner sc = new Scanner(System.in);
//		int r = sc.nextInt();
//		char[] items = new char[]{'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
//		int n =items.length; // 26
//		boolean visit[] = new boolean[n];
//		
//		combine(items,visit,0,n,r);
//	}
//	
//	
//	
//	private static void combine(char[] items, boolean[] visit, int depth, int n, int r) {
//		if(r == 0){
//			print(items,visit,n);
//			return;
//		}
//		
//		if(depth == n){
//			return;
//		}
//		visit[depth] = true;
//		combine(items,visit,depth+1,n,r-1);
//		
//		// ���� ���� ���� ���
//		visit[depth] = false;
//		combine(items,visit,depth+1,n,r); 
//		
//	}
//
//
//
//	
//	private static void print(char[] items, boolean[] visit, int n) {
//		for(int i = 0; i < n; i++){
//			if(visit[i] == true){
//				System.out.print(items[i] + " ");
//			}
//		}
//		System.out.println();
//	}
//		
//	
//
//
//
//
//}
//
//
//
//
