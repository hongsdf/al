package backjun;

import java.util.Scanner;

public class Back1193 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int pre_cnt_tot = 0; // ������
		int cross_num = 1;
//		T == 1+1 = 2, T 1+2 /2+1 == 3,T : 1+3,2+2 4
//		T-1 : ���� ���� 
		
		int n = sc.nextInt();
		while(true) { // n == 8
			// �Է��� ��  <= �밢���������� ������ + �Է��Ѽ��� �밢������ ���� cross_num : 2 ==> 1
			if(n <= pre_cnt_tot + cross_num) { 
				if(cross_num % 2 == 1) { // Ȧ�� �ϴ� ���ʾƷ�����
					// �и� ū������ ����
					System.out.println((cross_num -(n-1-pre_cnt_tot)) +"/"+ (n - (pre_cnt_tot)));
					break;	   	       
				}else { // ¦�� ������ ��
					// ���ڰ� ū������ ����4
				} System.out.println((n - (pre_cnt_tot)) +"/" +(cross_num -(n-1-pre_cnt_tot)) );
				break;    
				// cross_count������ ���� T(�밢��)�� ���� ����,
				// cross_num + 1 -n + pre_cnt_tot
//				3 <= 1 + 2;
//				4 <= 3 +3;
//				7 <= 6 + 4;
//				14 <= 10 + 5;
				
//				cross_num ==7 �϶�
//				16 <= 15 + 6;
//				17 <= 15 + 6;
//				18 <= 15 + 6;
//				19 <= 15 + 6;
//				20 <= 15 + 6;
//				21 <= 15 + 6;
				
//				cross_num == 8 �϶�
//				22 <= 21 + 7;
				
				
//				1 < = 1+0;
				
				
				
				
			}else {
				// tot : 0 , cross = 1,
				// tot : 1  , cross =2,
				// tot : 3,  cross = 3,
				// tot : 6,  cross = 4
//				cross_num : 1���� += �� ���� ����
//				cross2 += cross1;
//				cross3 += cross2;
				pre_cnt_tot += cross_num;
				// cross_num(2) ���� ���� ����
				cross_num++; // 3
			}
			// pre_cnt_tot    cross_num
			//     0              1
			//     1              2
			//     3              3
			
		}
		
		
	}
}
