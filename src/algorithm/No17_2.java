package algorithm;

public class No17_2 {

	public static void main(String[] args) {
		int  n = 5;
		for(int i=0 ; i < n; i++) {
				// 1행 n :1
				// 2행 n :2

				for(int j = 0; j < n ; j++) { // j = 0 일때 끝남
					if(j < i) {
						System.out.print(" ");
					}
					else {
						System.out.print("*");
					}
				
				
			
			
			
			
				}
				System.out.println();
		}

	}

	

}
