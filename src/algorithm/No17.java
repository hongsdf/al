package algorithm;

public class No17 {
	public static void main(String[] args) {
		for(int i = 0; i<5; i++) {
			for(int j = 5; j > i  ; j--) {
				System.out.print("*"); // 0�� + 5 ,1�� : 4 , 2�� :3
			}
			System.out.println();
		}
	}
}
