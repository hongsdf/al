package backjun;

import java.util.*;

public class Back {
	static final int height = 100;
	public static void main(String[] args) {
		/*
		 * �պ� ���� �ϰ� �����̵�� �Բ� ��ȭ�Ӱ� ��Ȱ�ϰ� �ִ� �鼳���ֿ��� ���Ⱑ ã�ƿԴ�. �ϰ��� ��ġ�� ���ƿ� �����̰� �ϰ� ���� �ƴ� ��ȩ
		 * ���̾��� ���̴�.
		 * 
		 * ��ȩ ���� �����̴� ��� �ڽ��� "�鼳 ���ֿ� �ϰ� ������"�� ���ΰ��̶�� �����ߴ�. �پ ������ �������� ������ �ִ� �鼳���ִ�,
		 * ���ེ���Ե� �ϰ� �������� Ű�� ���� 100�� ���� ����� �´�.
		 * 
		 * ��ȩ �������� Ű�� �־����� ��, �鼳���ָ� ���� �ϰ� �����̸� ã�� ���α׷��� �ۼ��Ͻÿ�.
		 */
		Scanner sc = new Scanner(System.in);

		
		int sum = 0;
		
		List <Integer> arr = new ArrayList<>();
		arr.add(sc.nextInt());
		arr.add(sc.nextInt());
		arr.add(sc.nextInt());
		arr.add(sc.nextInt());
		arr.add(sc.nextInt());
		arr.add(sc.nextInt());
		arr.add(sc.nextInt());
		arr.add(sc.nextInt());
		arr.add(sc.nextInt());
	
		
		for(int i = 0; i<arr.size(); i++) {
			sum	+= arr.get(i); //140
		}
//		int tot = sum - height; //40
//		System.out.println(tot);
		
		int t = 0;
		for(int i = 0; i<arr.size(); i++) {
			for(int j = i+1; j<arr.size(); j++ ) {
				if(sum - arr.get(i) - arr.get(j) == 100) {
//				System.out.println(arr.get(i));
				int a = arr.get(i);
				int b = arr.get(j);	
//				System.out.println(arr.get(j));		
				arr.remove(Integer.valueOf(a));
				arr.remove(Integer.valueOf(b));
				}
				break;
				
			}
			
		}
//		System.out.println(arr);
		sc.close();
//		arr.remove(a1);
//		System.out.println(arr);
		
		
		// ArrayList.remove() : idx���� ���� 
		// 1.  remove(int idx) : �ش� �ε��� ����, 2. remove(Object) : �ش� ��ü�� ���� => ��ü�� �������ϰ��
		// ù��° ��ü�� ���� (monkey,monkey....) ù° monkey�� ����
		
		
		// arrayList.remove(Integer.ValueOf()) : Ư�� ���� ����
		// arrayList.removeAll() : �ش� ������ ���� ����
		
		// Iterator.remove()
		
	}
}
