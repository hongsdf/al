package leetcode;

public class zigzag {
	public static void main(String[] args) {
		Solution s = new Solution();
		String str = "PAYPALISHIRING";
		int numRows = 4;
		String ans = s.convert(str, numRows);
		System.out.println(ans);
		
	}
}
class Solution {
    public String convert(String s, int numRows) {
//    	if(s.length() <= 1) return s;
		// StringBuilder sb ���
    	StringBuilder[] sb = new StringBuilder[numRows];
    	// sb�ʱ�ȭ
    	for(int i =0; i <numRows; i++) {
    		sb[i] = new StringBuilder(); // �� �ึ�� �ʱ�ȭ�Ѵ�
    	}
    	// sb[0] 
    	char c[] = s.toCharArray();
    	int len = c.length; //11
    	int idx = 0; // ���ڿ� �迭�ȿ��� �����̴� ������
    	while(idx < len) {
    		int i = 0;
    		// �Ʒ��� �������� �ܰ�
    		while(i<numRows && idx < len && i < len ) { // idx < len �� ������?
    			sb[i++].append(c[idx++]); // p
    		   // sb[0].append(a);
    		   // sb[1].append(b);
    		   // sb[2].append(c);
    		   // sb[3].append(d);
    		}
    		
    		int j = numRows-2; // 3 : �߰� ���� 1 // 4 : �߰�����  : 2 // 5 : �߰����� 3 
    		// �밢�� ��
    		while(j >= 1 && j < len && idx < len) {
    			sb[j--].append(c[idx++]);    		
    		}
		
    	}
    	for(int i =1; i <numRows; i++) {
    		sb[0].append(sb[i]);
    	}
    	
    	
    	
    	
    	return new String(sb[0]);
       
    }
}