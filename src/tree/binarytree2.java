package tree;

class treenode1{
	int data;
	treenode1 leftChild;
	treenode1 rightChild;
	
	treenode1(int data){
		this.data = data;
		
	}
	
	
}

public class binarytree2 {
	public static int n = 15;
	
	public static void main(String[] args) {
		treenode1 t[] = new treenode1[n+1];
		
		for(int i =1; i <= n; i++) {
			t[i] = new treenode1(i); //���� �ڱ� ��� ����
			// �ʱ⼳��
			t[i].leftChild = null; //  ���� ��� null
			t[i].rightChild = null; //  ������ ��� null
			
				
		}
		
		
		for(int i=2; i <=n; i++) {
			if(i %2 == 0) { //���� ���
				t[i/2].leftChild = t[i];
			}else { //������ ���
				t[i/2].rightChild = t[i];
			}
		}
		preoder(t[1]);
		
	}
	// ���� ��ȸ
	public static void preoder(treenode1 node) {
		if(node != null) {
			System.out.print(node.data + " ");
			preoder(node.leftChild);
			preoder(node.rightChild);
			
		}
	}
	
	
	// ���� ��ȸ
		public static void inneroder(treenode1 node) {
			if(node != null) {
				inneroder(node.leftChild);
				System.out.print(node.data + " ");
				inneroder(node.rightChild);
				
			}
		}
		
		//  ���� ��ȸ
				public static void postoder(treenode1 node) {
					if(node != null) {
						postoder(node.leftChild);
						postoder(node.rightChild);
						System.out.print(node.data + " ");
						
					}
				}
				
	
}
