package Monster;

import java.util.Scanner;
import java.util.Stack;

// ��ü ���� ������ ����
public class Chapter5B2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		//Ÿ�� ���� �Է�
		Tower[] towers = new Tower[N];
		for(int i = 0; i<N; i+=1) {
			int height = sc.nextInt();
			// �迭�ȿ� �ϳ��� Ÿ�� ������ �Է�
			towers[i] = new Tower(i+1,height); 
		}
		
		// �� Ÿ������ �����ϴ� Ÿ��ã��
		findtarget(towers);
		
		for(Tower t : towers) {
			if(t.getTower() == null) {
				System.out.print(0+" ");
			}else {
				// ����Ű�� ���� ������ Ÿ��Ÿ���� ���
				System.out.print(t.getTower().index+" ");
			}
		}
	}

	private static void findtarget(Tower[] towers) {
		// �� Ÿ������ �����ϴ� ���� ã��
		Stack<Tower> towerStack = new Stack<>();
		for(Tower t : towers) {
			Tower target = null; // private ������ class���� ���� �ϸ� ����
			// �ڽź��� ���� ������ Ÿ������ �����Ѵ�.
			while(!towerStack.isEmpty() && towerStack.peek().height < t.height) {
				towerStack.pop();
			}
			// ������� �°��� ������ ū Ÿ���� ���̸� �����ִ�
			if(!towerStack.isEmpty()) {
				// �� Ÿ���� Ÿ��Ÿ���� �����ϴ� �۾�
				target = towerStack.peek(); // �ڽź��� ū ���� Ÿ���� ���� ���� Ÿ���� �����մϴ�.
			}
			// Ÿ�� ���� Ÿ��Ÿ�� �����ϱ�
			t.setTower(target);
			// stack�� �ش� Ÿ���� �ִ´�. => �׸��� ���� Ÿ���� ����
			towerStack.push(t);
			
		}
		
	}
	
	
}
class Tower {
	// ����
	int height;
	// �ε���
	int index;
	// ������ Ÿ�� ����
	private Tower target;
	
	public Tower(int index,int height) {
		this.index = index;
		this.height = height;
		this.target = null;
	}
	//private���� �ܺο��� ���� �Ұ� , public �޼ҵ�� ���� 
	public void setTower(Tower target) {
		this.target = target;
	}
	// targetŸ�� ��������
	public Tower getTower() {
//		return Tower.target;
		return target; // Ÿ�� ������ �۽��ϴ� Ÿ���� ������� 
	}
	
}
