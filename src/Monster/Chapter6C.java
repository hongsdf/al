package Monster;

import java.io.*;
import java.util.*;
import java.lang.*;

class Utility {
	/**
	 * arr[l] ~ arr[r] ���̿� target�� �����ϴ��� ��ȯ�ϴ� �Լ�
	 * 
	 * @param arr    ������������ ���ĵ� �迭
	 * @param target Ž���ϰ��� �ϴ� ��
	 * @param l      Ž�������� ���� �� �ε���
	 * @param r      Ž�������� ������ �� �ε���
	 * @return arr���� target�� �����ϸ� true, �׷��� ������ false
	 */
	public static boolean binarySearch(int[] arr, int target, int l, int r) {
		// implement here
		if(l == r) {
			if(arr[l] == target) return true;
			else {
				return false ;
			}
		}
		
		int mid = (l+ r)/2;
		if(arr[mid] == target) {
			return true;
		}
		else if(arr[mid] > target) {
			return binarySearch(arr,target,l,mid-1);
		}else {
			return binarySearch(arr,target,mid+1,r);
		}
		

	}
}

public class Chapter6C {
	/**
	 * ���� �Լ��� �����Ӱ� �����ϸ� �׽�Ʈ �ص� �˴ϴ�
	 */
	public static void main(String[] args) {
		int[] arr = new int[] { 1, 3, 7, 8, 9, 20, 30, 50, 70, 120 };
		int target = 121;
		// Arrays.sort(arr);

		boolean result = Utility.binarySearch(arr, target, 0, arr.length - 1); // ������ �Լ��� ���

		if (result) {
			System.out.println("�迭 ���� �����մϴ�");
		} else {
			System.out.println("�迭 ���� �������� �ʽ��ϴ�");
		}

	}
}