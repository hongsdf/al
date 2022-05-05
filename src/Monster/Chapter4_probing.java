package Monster;

import java.io.*;
import java.lang.*;
import java.util.*;

// ���� Ƽ���� �������ִ� �ڵ� ���α׷� �ϼ��ϱ�

public class Chapter4_probing {
	public static final Scanner scanner = new Scanner(System.in);

	/**
	 *
	 * @param n     ��ü Ƽ���� ��
	 * @param m     ��û ���� ��
	 * @param ids   �� ������ ȸ����ȣ
	 * @return
	 */
	public static ArrayList<Integer> getTicketNumbers(int n, int m, int[] ids)
	{
		ArrayList<Integer> tickets = new ArrayList<>();

		TicketTable table = new TicketTable(n);

		for(int ticket : ids){
			// Ƽ�� �ο�
			int number = table.findEmptyIndexByUserId(ticket);
			tickets.add(number);
			table.setUsed(number,true);// ���Ȯ�� üũ
		}
		
		return tickets;
	}

	public static void main(String[] args) throws Exception {
		int n = scanner.nextInt(); // ��ü Ƽ���� ��
		int m = scanner.nextInt(); // ��û ���� ��

		int[] ids = new int[m];

		for(int i = 0 ; i < m ; i ++)
		{
			ids[i] = scanner.nextInt();
		}

		ArrayList<Integer> tickets = getTicketNumbers(n, m, ids);

		for(int index : tickets){
			System.out.println(index);
		}
	}

}


class TicketTable
{
	private final boolean[] used; //Ƽ�� ��� ���ι迭
	public final int length;

	public TicketTable(int length)
	{
		this.length = length;
		this.used = new boolean[length];
	}

	/**
	 * ������� ȸ�� ��ȣ�� ���޹ް� �� ���� ��ȣ�� ����ϴ� �޼ҵ�
	 */
	public int findEmptyIndexByUserId(int userId)
	{
		// ����ȣ�� �������� % �迭�� ���̷� ����� Ƽ�Ϲ�ȣ�� �ο��Ѵ�
		int number = userId%length;
		// �ο��� Ƽ�Ϲ�ȣ�� ���� Ƽ���̸� ������ �������� +1 �Ͽ� Ƽ���� ����Ѵ�
		while(isUsed(number) == true){
			number = (number + 1) % length;
			
			 /* n-1���� Ȯ�� �ϰ� 0���� �ٽ� ��ȯ�Ѵ�. , �̰��� �������൵ �ȴ� ��? := number-1 �� ����� Ƽ���̶��+ 1�Ͽ�  n, length�� n%n == 0 �̹Ƿ� ��ȯ�� �ȴ�.
				if(number == length-1){
				 	number = 0;
			 	
			 	}
			 
			 */
		}
		// n-1���� Ȯ�� �ϰ� 0���� �ٽ� ��ȯ�Ѵ�.
		return number; // := ������� �����ϸ� ��밡���� Ƽ���� ã����
	}

	/**
	 * �ش� ���� ��ȣ�� �̹� ��� ������ ���θ� ��ȯ�ϴ� �޼ҵ�
	 */
	public boolean isUsed(int ticketIndex)
	{
		return used[ticketIndex]; // true := ����� Ƽ��, false := ��밡���� Ƽ��
	}

	/**
	 *  Ƽ�� ��� ���θ� �����ϱ� ���� �޼ҵ�
	 */
	public void setUsed(int index, boolean status)
	{
		used[index] = status; // Ƽ�� ��뿩�� üũȮ��
	}
}
