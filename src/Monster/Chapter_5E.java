package Monster;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Chapter_5E {
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) throws Exception {
		
		int caseSize = sc.nextInt();

		for (int caseIndex = 1; caseIndex <= caseSize; caseIndex += 1) {
			testCase(caseIndex);
		}

	}

	private static void testCase(int caseIndex) {
		
		int n = sc.nextInt(); // ��ź��
		int m = sc.nextInt(); // ���� ���� ���� ��
		
		// n�� ��ź ����
		Bomb[] bomb = new Bomb[n];
		for(int i = 0; i<n; i++) {
			bomb[i] = new Bomb(i);
		}
		// ���� ���� ����
		for(int i = 0; i<m; i++) {
			int a = sc.nextInt()-1; // 1 :=�� ������ 0�̴�.
			int b = sc.nextInt()-1;
			Bomb parent = bomb[a];
			Bomb child = bomb[b];
			
			child.addParnet(parent); // �θ� ����

		}
		
		// ����
		boolean flag = istrue(n,bomb);
		if(flag) {
			System.out.println("YES");
		}else {
			System.out.println("No");
		}
	}

	private static boolean istrue(int n, Bomb[] bomb) {
		Queue<Bomb> q = new LinkedList<>();
		ArrayList<Bomb> list = new ArrayList<>(); // ���ŵ� ��ź ���
		// ��ź�� ���Ǵٰ� �ش� ��ź�� count�� 0�̸� ť�� �ִ´�. ==> ���Ű��� ��ź�̶�� ��
		for(Bomb b : bomb) {
			if(b.getCount() == 0) {
				q.add(b);
			}
		}
		while(!q.isEmpty()) {
			Bomb b1 = q.poll();
			list.add(b1); // ������ ��ź�� �ٸ� ������ ����
			b1.remove(); 
			 // �ش� ��ź b�� �����ϸ� b�� �θ� �迭�� �������־���Ѵ�.
			for(Bomb p : b1.getParentBomblist()) {
				 int cnt = p.getCount();
				 // �̶� count == 0 �̸� �ٽ� ť�� �־� �ش�(���Ű����� ��ź�� ��)
				 if(cnt == 0) {
					 q.add(p);
				 }
			}
			
		}
		
		
		
		// ����� ���� ť�� �������� n�� �Ǿ��ٴ� ���� ��� ���� �Ҽ� �ִٴ� ���̴�.
		if(n == list.size()) {
			return true;
		}
		
		// �ݴ�� n�� �ƴϸ� ��� ��ź�� �Դٰ��� �����Ƿ� ���� �Ҽ� ������ �ǹ�
		
		
		
		
		return false;
	}

}

class Bomb{
	// �ε���
	int index;
	// count : ���� ���߽�Ű�� ����
	private int count;
	// ���� ���õ� �θ� �迭
	private ArrayList<Bomb> ParentBomblist;
	
	public Bomb(int index) {
		this.index = index;
		this.count = 0;
		this.ParentBomblist = new ArrayList<>();
	}
	// private ������ count�� ������ public �޼���
	public int getCount() {
		return count;
	}
	// private ������ �θ�迭 ���� ����
	public ArrayList<Bomb> getParentBomblist(){
		// ���� �θ� �迭�� 
		return this.ParentBomblist; 
	}
	
	// ���� �۾�(�ܹ���)
	public void addParnet(Bomb b) {
		this.ParentBomblist.add(b); // �ش� ��ź��ü�� �θ�迭�� ä���ֱ�
		b.count++; // �θ� �߰��Ǵ� b���忡���� ���߽�ų ������ 1�� �����ߴ�.
		
	}
	
	public void remove() {
		for(int i = 0; i<ParentBomblist.size(); i++) {
			ParentBomblist.get(i).count--;
		}
	}
}