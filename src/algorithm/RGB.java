package algorithm;
import java.util.Scanner;
public class RGB {
		// DP ?κΈ°ν ?? : ??? ???΄ κ°??₯ μ΅μ ? κ²½μ°??λ₯? μ°Ύλ κ²μ΄ μ€μ??€
		// ?κΈ°ν λ¬Έμ  : μ΄κΈ°? ???΄ μ€μ??€
		// min() λ©μ?λ₯? κ΅¬ν?κΈ? ??¨ ?°κ°μΌλ‘? μ΄κΈ°? ?΄?κ³? ?€? ex) int a = 9999;
		// μ£Όμ ?? 
		// int(int j = R; j <=B; j++) {
		//		int(int k =R; k <=B; K++){
		// 			if( j != k){ // κ°μ? ?? ? ??? κ²μ λ°©μ?  
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
			int input = sc.nextInt(); // N ?? ₯
			for(int i = 1; i<=input; i++) { //input : 3 ?΄λ©? 3 x 3 ?? ¬ ?? ₯
				for(int j = 1; j <=input; j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			// μ΄κΈ°?
			for(int i = 1; i<=3; i++ ) {
				for(int j = R; j<=B; j++) {
					ans[i][j] = 9999;
				}
			}
			// ?¬κΈ°κΉμ§?
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
			// 1? R,G,B? κ·Έλ?λ‘? ???₯
			// 2? λΆ??° ? ?
			for(int i = 2; i<=input; i++) {
				for(int j = R; j<=B; j++) {
					/* ?΄? ?€λ₯? κ²μ κ³ λ₯΄κΈ? ??΄ 3μ€? forλ¬?*/
					for(int k = R; k <=B; k++) { // ?€? ? RGBλ₯? ? ? ?€λ₯? μΉΌλΌ? ? ???λ‘? 
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
