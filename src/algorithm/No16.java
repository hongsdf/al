package algorithm;

public class No16 {
	public static void main(String[] args) {
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j <i+1; j++) { 
				System.out.print("*"); // �� + 1 
				// 0�� : 1
				// 1�� : 2
				// 2�� : 3
				// 3�� : 4
				// 4�� : 5
			}
			System.out.println("");
		}
	}
}
