package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Hap {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken()); 
		int K = Integer.parseInt(st.nextToken()); // ���� ����
		
		// 2D DP
		long d[][] = new long[K+1][N+1];
        
        // �ʱ�� || ��ȭ���� �߿��ϴ�
        d[0][0] = 1; // �ƹ��͵� �����ʰ� 0�� ����� ��� 1���� (������ �ǹ�) : ����� �� �������� ������ �ʿ��ϴ�.
        
        
        for(int k1 = 1; k1<=K; k1++){
        	// 0���� N����
            for(int i = 0; i<=N; i++){
                // �׷��� �ѹ������ؼ� 0�� ������� �մ�.
                for(int j =0; j<=i; j++){
                   d[k1][i] += d[k1-1][i-j];  //����Ǽ� �̴ϱ� jȽ���� ++ (���� ���ϴ� ���� �ƴ�)
                   d[k1][i] %= 1000000000L;
                }
              
                    
                    
              //  0~n���� �ϼ� 
              //  0~1���� ���� 0,1
              //  0~2���� ���� 0,1,2
              //  0~3���� ���� 0,1,2,3
                    
              //  0~N���� ���� 0,1 2 3 .. N
               
              //  O+O+O+ j   = N
              //  O+O+O = N -j
              //  D[N] = N���� ����Ǽ� 
              //  D[N-j] = N-j ���� ����� �� 
              //  ������ j�� ���� �ൿ�� +1 
              //  �׷��� k���忡�� -1
                    
            }
        }
        System.out.println(d[K][N]%1000000000L);
        
    }
}
        
		