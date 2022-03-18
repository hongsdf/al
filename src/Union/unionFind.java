package Union;
// union (��ġ��) + Find(ã��)
// union find : ���� ���� �θ� ����Ű��? , ���� ����Ǿ��ֳ�?
public class unionFind {
	public static void main(String[] args) {
		int array[] = new int[11];
		for(int i =1; i<array.length; i++) {
			array[i] = i;
		}
		union(array,1,2);
		union(array,2,3);
		union(array,3,4);
		union(array,7,8);
		union(array,8,5);
		union(array,9,10);
		
		boolean flag = SameNode(array,1,8);
		System.out.println(flag);
	}
	
	// union(�� ���� ������ ��ġ��)
	public static void union(int[] array, int a, int b) {
		a = getParent(array,a);
		b = getParent(array,b);
		if(a < b) array[b] = a;
		else array[a] = b;
		
	}
	
	// �θ� ã��
	// ��ͽ�
	public static int getParent(int[] array , int a) {
		if(array[a] == a) return a; // �迭�� == �ڽ��� ���� ������ �θ�
		return array[a] = getParent(array, array[a]) ;
	}
	
	// ���� �θ�����(���� �� ���� �Ǵ�)
	public static boolean SameNode(int[] array, int a, int b) {
		a = getParent(array, a);
		b = getParent(array, b);
		if(a == b) return true; // ���� ���� �θ�(��)
		else {
			return false;// ���� �ٸ� �θ�(��)
		}
		
	}
}
