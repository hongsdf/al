package backjun;

import java.util.Scanner;

public class Back1193_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int pre = 0; int cross_num = 1; // �ش� �밢�� ���� ����
		while(true) {
			if( n <= pre + cross_num) { //n : 1  0+1, n:2   1+2,
				//n == 5 (2,2) n == 8 ,cross_num : 4  3/2
				if(cross_num%2 == 1) { // 2/2 �Ʒ� ���ʹ��� /^
					/*(cross_num - (n-pre-1)) :  n-���������� �����ϸ� ������ ���´�
					 * ex) n == 8 8����- 6���� 2������ ä�����Ѵ�  (����亯 3/2)
					 * 2������ ä��� ���� ��� ���� ä���� ���� ����
					 * 8�� �ִ� �밢����ġ(cross = 4) 4 - (8-6-1) -> 4 - 1(��ġ) = 3 �� 4���� ������ 1��°
					 * -1�� �ϴ� ���� : �ε����� 0��° ���� �ִٰ� �����ϰ� -1�� �Ѵ�
					 * 3/ n-pre(8���� - ��������(6����)) = 2��ġ
					 * 1��° ��ġ�� 3/2��
					 * O O O O
					 * O O O O
					 * O O O O 
					 * O O O O
					 * */
					System.out.println((n-(pre)) +"/"+ (cross_num - (n-pre-1))); //6-3-2 == 1
					break;
				}else { // ����  �Ʒ�               // 1 / cross(3 - (4-3-1)) 3    3 = 1/3 
					System.out.println((cross_num -(n-pre-1))+"/"+ (n-pre));// n == 7
					break;                   
				}                                // 4 - 0 = 4
													
			
			
			}
			else {
				pre += cross_num;// cross_num�� 2�� �Ǳ��� ���Ұ����� �Ѱ��ش�
				cross_num++;
			}
			
		}

	}

}
