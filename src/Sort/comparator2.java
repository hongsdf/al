package Sort;

import java.text.ParseException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class comparator2 {
	public static void main(String[] args) {
		// 2���� �迭 comparator�� �����ϱ� ����
		String [][] str = { {"���ѵ���", "��ȫö"}, {"���ѵ���", "��ȫĥ"}, {"���", "���缮"}, {"���ѵ���", "����"}, {"���", "��ȫö"}};
		System.out.println("������");
		
//		for(int i =0; i<str.length; i++) {
//			List<String> nstr = Arrays.asList(str[i]); //Arrays : �迭,���ڿ��� Ÿ���� �Ű����� �޾�list�����ι�ȯ
//			for(String s:nstr) {
//				System.out.println(s);
//			}
//			
//		}
		
		for(int i =0; i<str.length; i++) {
			System.out.println(Arrays.asList(str[i])) ;
		}
		
		Arrays.sort(str,new Comparator<String[]>() { // Arrays.sort(������ �迭, ���ı����� ������� �ִ� )

			@Override
			public int compare(String[] str1, String[] str2) {
				if(str1[0].toString().contentEquals(str2[0].toString())) { // 2�����迭 ���� ù��° ���Ұ� ������
					return str1[1].toString().compareTo(str2[1].toString()); // �ι�° ���Ҹ� ���Ѵ�
					// str[1].toString.compareTo(Str[1].toString()) ����� �����̸� �������� , ����̸� ��������
				}else {
					return str1[0].toString().compareTo(str2[0].toString());
				}
				
				
			}
			
			
			
			
		});
		System.out.println("������ ");
		for(int i =0; i<str.length; i++) {
			System.out.println(Arrays.asList(str[i]));
		}
		
		
//		for(int i=0; i<str.length; i++) {
//			for(int j=0; j<str[i].length; j++) {
//				System.out.print(str[i][j]);
//			}
//			System.out.println();
//		}
		
		
		
	}
}
