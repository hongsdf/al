package algorithm;

public class No18_3 {
	public static void main(String[] args) {
		// *****  0�� * 5 + a*0
	    // ****a  1�� * 4 + a*1
		// ***aa  2�� * 3 + a*2
		// **aaa
		// *aaaa
		
		int n=7;
		for(int i = n ; i > 0; i--) {
			for(int j=0; j < n; j++) {
				if(j < i ) { // 
					System.out.print("*");
					
				}else
					System.out.print(" ");
				
			}
			System.out.println();
		}
	}   
}
