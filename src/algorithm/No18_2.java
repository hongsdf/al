package algorithm;

public class No18_2 {
	public static void main(String[] args) {
		// *****  0�� ���� 0
		//  ****  1�� ���� 1 + *
		//   ***  2�� ���� 2
		//    **
		//     *
		int n =5;
		for(int i = 0; i < n; i++) {
			for(int j=0; j < n; j++) { 
				if(j+1 > i) {
					System.out.print("*");
					
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
