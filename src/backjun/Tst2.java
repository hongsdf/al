package backjun;

public class Tst2 {
	public static void main(String[] args) {
		int max = Integer.MAX_VALUE; //  2,147,483,647
		int min = Integer.MIN_VALUE; // -2,147,483,648
		
		System.out.println("max : " +max);
		System.out.println("min : " +min);
		
		
		System.out.println("===���� �߻�======");
		
		
		
		System.out.println("���� max : " +(max+1)); //overflow : int�� ���Ѽ��� ��� �߸��� �� ���
		System.out.println("���� min : " +(min-1)); // underflow : int�� ���Ѽ��� ��� �߸��� �� ���
		
	}
	
	
}
