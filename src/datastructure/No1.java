package datastructure;

import java.util.Scanner;

public class No1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		String str = sc.next();
//		System.out.println(str);
		
//		String str_line = sc.nextLine();
//		System.out.println(str_line);
		
//		String str = "������ ���� �ϻ�";
//		String word[] = str.split(" ");
//		for(String w:word)System.out.println(w);
		
//		for(int i =0; i<word.length;i++) {
//			System.out.println(word[i]);
//		}
		
//		String str2 = "������,���� �ϻ�";
//		String word2[] = str2.split(",");
//		for(String w:word2)System.out.println(w);
//		System.out.println(word2[0]);
		
				String str1 = "The.show game ming .game is back";
				String word1 = str1.split(" ")[0]; // The
				String word2 = str1.split("g")[1]; // show
				String word3 = str1.split(" ")[2]; // is
				String word4 = str1.split(" ")[1]; // show
					
				
				System.out.println("ù��° �ܾ�:" + word1);
				System.out.println("�ι�° �ܾ�:" + word2);
				System.out.println("����° �ܾ�:" + word3);

		
		
		
		
		
		// 2
//		String a = "��������ϰ�,�ǽù�.���� ����";
		
//		String word1 = a.split(",")[0];
//		String word2 = a.split(".")[1];
//		String word3 = a.split("��")[2];
//		String word4 = a.split(" ")[3];
//		String word5 = a.split(" ")[4]; //������ �Ѿ�� outBound error
		
//		System.out.println(word1);
//		System.out.println(word2);
//		System.out.println(word3);
// //		System.out.println(word4);
		
	}
}
