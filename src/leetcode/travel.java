package leetcode;

import java.util.*;

public class travel {
	public static void main(String[] args) {
		Solution40 m = new Solution40();
		int[][] key = new int[][] { { 0, 0, 0 }, { 1, 0, 0 }, { 0, 1, 1 } };
		int[][] lock = new int[][] { { 1, 1, 1 }, { 1, 1, 0 }, { 1, 0, 1 } };
		boolean flag  = m.solution(key, lock);
		System.out.println(flag);

	}
}

class Solution40 {
    
    public void match(int[][] arr,int[][]key,int cycle, int i,int j){
        // i, j�� key�� ��ǥ
        int n = key.length;
        for(int r = 0; r < n;r++){
            for(int c= 0; c < n; c++){
                // ���� �߿� (ȸ��)
                if(cycle == 0){ // ȸ�� 0 
                    // arr[n+r][n+c] ���� arr�� ä����
                    arr[i+r][j+c] += key[r][c];
                }else if(cycle == 1){ //90�� ȸ��
                    //r : 1 ,c : 0
                    arr[i+r][j+c] += key[c][n-1-r];
                    // 0,0 --> 0,2
                    // 1,0 --> 0,1 
                    // 2,0 --> 0,0

                }else if(cycle == 2){ // 180�� ȸ��
                    //r : 2 , c: 2
                    arr[i+r][j+c] += key[n-1-r][n-1-c];
                    
                    // (2,2) -> 0,0
                    // (2,1) -> 1,0
                    // (2,0) -> 0,2
                }else if(cycle ==3){ // 270��
                    // �ݽð������ ����
                    // r : 0, c :2 
                    
                    // 0,2 -> 0,0 
                
                    arr[i+r][j+c] += key[n-1-c][r];
                }
            }
        }
    }
    public boolean correct(int arr[][],int offset,int len){
        for(int i =0; i<len; i++){
            for(int j =0; j<len; j++){
                if(arr[i+offset][j+offset] != 1) return false;
            }
        } 
        return true;
    }
    
    public boolean solution(int[][] key, int[][] lock) {
      // lock�� ū ���� �߰��� ��ġ�Ѵ�
        
      // ó�� �����Ҷ� key���� �ϳ��� �迭�� lock�̶� ���ľ��Ѵ�.
      int offset = key.length - 1; // ��������
        
     
     // ū ������ lock ��ǥ �ø���
     // ū������ lock�ø���  key20 + lock 20������ ���� �ϸ� �ȴ� 
     // ����? �ϳ��� key�� ��ġ�� ������ �Ǳ� ������
        
      for(int i =0; i< offset + lock.length; i++){
          for(int j = 0;j< offset +lock.length; j++){
             // ȸ�� ����
              for(int cycle =0; cycle < 4; cycle++) {
                  // key 20+ lock20 + key20
                  int arr[][] = new int[58][58];
                  // lock ��ǥ �ø���
                  for(int r = 0; r<lock.length; r++){
                      for(int c = 0; c<lock.length; c++){
                          arr[offset + r][offset + c ]= lock[r][c];
                      }
                  }
                  // i,j�� Ű�� �� �� �ִ� ���� ��ǥ
                 match(arr,key,cycle,i,j);
                 // ū����arr, offset(ū������ �ִ� ���� ��ġ), lock�� �����Ұ��̱� ������
                  if(correct(arr,offset,lock.length)){
                      return true;
                  }
                  
              }
                  
             }
              
           
      }

        return false;
    }
}