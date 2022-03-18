package djk;

public class Floyd_mid {

}
class Solution {
    // floyd
    int Board[][] = new int[200][200];
    static final int INF = 4000000; // �ִ� ����� 100,000 // �ι迭�� �����ϱ� ������ �������� �Ÿ�100,000
    public int solution(int n, int s, int a, int b, int[][] fares) {
        int answer = INF;
        // ���� �ʱ�ȭ
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                if(i == j) Board[i][j] = 0;
                else Board[i][j] = INF;
            }
        }
        // Board�� fares���� ����
       // fares�� �ִ� ���� �ű�
        
        // �Ű������� 2���� �迭�̸� ==> * Ȯ�� �ݺ������� ������.*
     // fares[] = {c,d,f}���·� �־�����.
        for(int[] edge : fares) {
               // 1 (edge[0]) 2 (edge[1]) 5 (edge[2])
               // ����� �׷���
               Board[edge[0]-1][edge[1]-1] = edge[2];
               Board[edge[1]-1][edge[0]-1] = edge[2];
            
         }
        
        floyd(n);
        // s,a,b������ ������ Board�� ���� �ֱ�
        // s : 1 -->  Board[0]
        // s : 5, a :3 --> Board[5-1][3-1] 
        s--;
        a--;
        b--;
        //  0 0 0 0 0 0
        //  0 0 0 0 0 0
        //  0 0 0 0 0 0
        //  0 0 0 0 0 0
        //  0 0 0 0 0 0
        
        // ��� ��尡 �߰������� �ȴ�
        for(int k = 0; k < n;k++){
            // ������� -> �߰����� -> a���� -> b����
          answer  = Math.min(answer , Board[s][k] + Board[k][a] + Board[k][b]);  
        }
       
        
        
        return answer;
    }
 
    public void floyd(int n){
        for(int k = 0; k< n; k++){ 
          for(int i = 0; i <n; i++){
             for(int j = 0; j<n; j++){
                 if(Board[i][j] > Board[i][k] + Board[k][j]){
                     Board[i][j] = Board[i][k] + Board[k][j];
                 }
             }
          }
        }
		
    }
}