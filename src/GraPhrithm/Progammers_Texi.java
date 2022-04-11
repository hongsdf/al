package GraPhrithm;

public class Progammers_Texi {
	public static void main(String[] args) {
		int n = 6;
		int s = 4;
		int a = 6;
		int b = 2;
		int [][] fares = { 
			{4, 1, 10},
			{3, 5, 24},
			{5, 6, 2},
			{3, 1, 41},
			{5, 1, 24},
			{4, 6, 50},
			{2, 4, 66},
			{2, 3, 22},
			{1, 6, 25}
		};
		Solution3_3_3 m = new Solution3_3_3();
		m.solution(n, s, a, b, fares);
	}
}
class Solution3_3_3 {
    int d[][] = new int[200][200]; // 200 * 200
    int INF = 98765421;
    public int solution(int n, int s, int a, int b, int[][] fares) {
        
        // �ʱ�ȭ
        d = new int[n][n];
        for(int i = 0; i <n; i++){
            for(int j = 0; j <n; j++){
                if(i == j) d[i][j] = 0;
                else d[i][j] = INF;
            }
        }
        
        //fares�� �մ� ���� ��� �ֱ�
        for(int[] fare : fares) {
            // �����
            d[fare[0] -1][fare[1] -1] = fare[2];
            d[fare[1] -1][fare[0] -1] = fare[2];
        }
        
        
        // ���� �����鳢�� �����ϸ� ª�� �Ÿ��� ��ģ�� (�ϼ�)
        for(int k = 0; k<n; k++){
            for(int i = 0; i <n; i++){
                for(int j = 0; j<n; j++){
                    // ���� ���� �߰������� ���� ���� �ִ� ���̰ų� �� ª�� �Ÿ��� �ִٸ�
                    if(d[i][j] > d[i][k] +d[k][j] ){
                        d[i][j] = d[i][k] + d[k][j] ;
                    }
                }
            }
        }
        // �迭�� 0������ ����Ѵ�
        // ����ڴ� 1������ ~ n�����̹Ƿ� ������ ���߱� ���� --
        s--;
        a--;
        b--;
        
        int answer = INF;
        // � �߰������� Ÿ�� �̵��ұ�?
        for(int k = 0; k <n; k++){
            answer = Math.min(answer,d[s][k] + d[k][a] + d[k][b]);
        }
        // floyd warshall
        
        
        return answer;
    }
}