package tree;
// ����ü : ����ü�� Ŭ������ ����� �����̳� �����ڿ� �ʵ常 ���� �Ǿ��ִ� ��
class treenode{
	int data;
	treenode leftchild;
	treenode rightchild;
	
	public treenode(int data) {
		this.data = data;
	}
}


public class binarytree {
	public static int num = 15;
	
	// ���� ��ȸ
	// �ڱ� �ڽ� ��带 ����ϰ�
	// ���� �ڽ� Ȯ��
	// ������ �ڽ� Ȯ��
	public static void preorder(treenode n) {
		if(n != null) {
			System.out.print(n.data+" ");
			preorder(n.leftchild);
			preorder(n.rightchild);
		}
	}
	// ���� ��ȸ
	// ���� �ڽ� Ȯ��
	// �ڱ� �ڽ� ���
	// ������ �ڽ� Ȯ��
	public static void midorder(treenode n) {
		if(n != null) {
			midorder(n.leftchild);
			System.out.print(n.data+" ");
			midorder(n.rightchild);
		}
	}
	
	// ���� ��ȸ(���� ���� ���Ǵ� ����)
	// ���� ��带 ��ȸ
	// ������ ��带 ��ȸ
	// �ڱ� �ڽ� ���
	public static void postorder(treenode n) {
		if(n != null) {
			postorder(n.leftchild);
			postorder(n.rightchild);
			System.out.print(n.data+" ");
		}
	}
	
	
	public static void main(String[] args) {
		// Generic Ÿ���� �ƴ� : ����ü �迭 ���� ���
		treenode nodes[] = new treenode[num+1];
		for(int i=1; i <= num; i++) {
			treenode t1 = new treenode(i);
			nodes[i] = t1;
			nodes[i].leftchild = null;
			nodes[i].rightchild = null;
			
		}
		
		for(int i =2; i<=num; i++ ) {
			if( i %2 == 0) {
				nodes[i/2].leftchild = nodes[i];
			}else if(i %2== 1){
				nodes[i/2].rightchild = nodes[i];
			}
		}
		System.out.println("���� ��ȸ ");
		preorder(nodes[1]);
		System.out.println();
		
		System.out.println("���� ��ȸ ");
		midorder(nodes[1]);
		System.out.println();
		
		System.out.println("���� ��ȸ ");
		postorder(nodes[1]);
	}
}
