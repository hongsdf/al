package algorithmpRO;

import java.util.*;

public class Editor {
	public static void main(String[] args) {
		Solution2 m = new Solution2();
		String[] cmd = { "D 2", "C", "U 3", "C", "D 4", "C", "U 2", "Z", "Z" };
		m.solution(8, 2, cmd);
	}
}
class Solution2 {
    /* ���Ḯ��Ʈ�� ����Ұ��̴�. 
        ����,������ �� �����Ƿ� �ð� ������ ���̱� ���� ���Ḯ��Ʋ �������
    
    
    */
    class Node{
        boolean check; // �����尡 ���� �Ǿ����� Ȯ�� ����
        Node pre; // ���� ���
        Node next; // ���� ���
    }
    
    public String solution(int n, int k, String[] cmd) {
        Node[] nodeArr = new Node[1000000];
        
        Stack<Node> st = new Stack<>();
        // Node[] nodeArr = new Node[n];
        
        for(int i = 0; i <n; i++){
            nodeArr[i] = new Node(); // ���� �� n��ŭ ��� ����(�ϳ��� ����)
        }
        
        //�����۾�
        for(int i =1; i<n; i++){
            // �׻� ��������� ����
            nodeArr[i-1].next = nodeArr[i];
            nodeArr[i].pre = nodeArr[i-1];
        }
        
        Node curr = nodeArr[k]; /* k ��° [] �ε����� �ִ� ���� ���� ���(Ŀ��) �̴�*/
        for(String command : cmd){
           char c = command.charAt(0);
            
           switch(c){
               case 'U': // X ĭ Ŀ���� ���� �̵�
                int x = Integer.parseInt( command.substring(2) );
                while(x --> 0){
                    curr = curr.pre; // ����Ŀ���� �̵��Ұ� U : ��������
                }
                 break;
               case 'D': // X ĭ Ŀ���� �Ʒ��� �̵�
                x = Integer.parseInt( command.substring(2) );
                while(x --> 0){
                    // ������ ������ ���簡 �ȴ�
                    curr = curr.next; // ����Ŀ���� �Ʒ��� �̵�
                    
                }
                    break;
                 case 'C': // Ŀ���ִ� ĭ�� ����
                    curr.check = true; //���� ǥ��
                    st.push(curr);
                   
                   // ���� Ŀ���� ���õ� ����,���� ��� ����
                   Node up = curr.pre;
                   Node down = curr.next;
                   
                   //up�� down�� ���� ��Ű��
                   if(up != null) up.next = down;
                   if(down != null) { 
                     down.pre = up;
                   } // ��, ������ ���� ���� ������ ���� ��� �ٷ� �� ��
                   /*������ ���� ���� �Ǹ� curr��������, down�� null up <-> curr <-> null(down)*/
                   else{
                       curr = up;
                   }
                
                break;
               case 'Z':
                   Node re = st.pop(); //st���� pop�ؼ�
                   re.check = false; // �ٽ� ���� ǥ��
                   
                   // �׶� ��ġ�� ���ư�
                  // re:������̰�
                  // up,down�� null�� ���� �ִ�.
                   
                  up = re.pre;
                  down = re.next;
                   
                  if(up != null) up.next = re;
                  if(down != null) down.pre = re;
                   
                   
                   
                 break;  
                   
           } 
        }
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i<n; i++){
            if(nodeArr[i].check){
                sb.append('X');
            }else{
                sb.append('O');
            }
        }
        
        
        
        return sb.toString();
    }
}