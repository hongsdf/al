package algorithm;
import java.util.Scanner;
public class RGB {
		// DP ?��기화 ?��?�� : ?��?��?�� ?��?��?�� �??�� 최적?�� 경우?��?���? 찾는 것이 중요?��?��
		// ?��기화 문제 : 초기?�� ?��?��?�� 중요?��?��
		// min() 메서?���? 구현?���? ?��?�� ?��값으�? 초기?�� ?��?���? ?��?�� ex) int a = 9999;
		// 주요 ?��?��
		// int(int j = R; j <=B; j++) {
		//		int(int k =R; k <=B; K++){
		// 			if( j != k){ // 같�? ?��?�� ?��?��?��?�� 것을 방�?  
	 	// }
		//		}
		// }
		static int arr[][] = new int[1000][4];
		static int ans[][] = new int[1000][4];
		
		static final int R =1;
		static final int G =2;
		static final int B =3;
		
		
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int input = sc.nextInt(); // N ?��?��
			for(int i = 1; i<=input; i++) { //input : 3 ?���? 3 x 3 ?��?�� ?��?��
				for(int j = 1; j <=input; j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			// 초기?��
			for(int i = 1; i<=3; i++ ) {
				for(int j = R; j<=B; j++) {
					ans[i][j] = 9999;
				}
			}
			// ?��기까�?
			// 3
			// 9999 9999 9999
			// 9999 9999 9999
			// 9999 9999 9999
			
			// 13 	40   83
			// 9999 9999 9999
			// 9999 9999 9999
						
			
			
		
			ans[1][R] = arr[1][R]; // ans[2][R] = ans[1][G] || ans[1][B]
			ans[1][G] = arr[1][G]; // ans[2][G] = ans[1][G] || ans[1][G]
			ans[1][B] = arr[1][B]; // ans[2][B] = ans[1][B] || ans[1][B]
			// 1?�� R,G,B?�� 그�?�? ???��
			// 2?�� �??�� ?��?��
			for(int i = 2; i<=input; i++) {
				for(int j = R; j<=B; j++) {
					/* ?��?�� ?���? 것을 고르�? ?��?�� 3�? for�?*/
					for(int k = R; k <=B; k++) { // ?��?�� ?�� RGB�? ?��?�� ?���? 칼럼?�� ?��?��?��?���? 
						if(j != k) {
							ans[i][j] = min(ans[i][j] ,arr[i][j] + ans[i-1][k]); 
							//ans[2][R] = min(ans[i][j],  arr[2][R] + (ans[1][B] || ans[1][G]) )
						}
					}
				}
			}
			// 62
			// ans[3][R], ans[3][G], ans[3][B] : 72;
			System.out.println(min2(ans[input][R],ans[input][G],ans[input][B]));
			
		}

		private static int min(int i, int j) {
			if(i < j) return i;
			else return j;
		}
	
		static int min2(int i, int j, int k) {
			if(i > j) {
				if( j > k) return k;
				else return j;
			}else {
				if(i > k) return k;
				else return i;
			}
		}
}
