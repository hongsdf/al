package backjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Queue1 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		while(T --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			LinkedList <int[]> q = new LinkedList<>();
			st = new StringTokenizer(br.readLine()," ");
			for(int i = 0; i <N; i++) {
				q.add(new int[] {i,Integer.parseInt(st.nextToken())});
			}
			int cnt = 0;
			while(!q.isEmpty()) {
				int curr[] = q.poll();
				boolean flag = true; // �� ���� ���� ū���̴�.
				for(int i = 0; i <q.size(); i++) {
					if(curr[1] < q.get(i)[1]) {
						q.add(curr);
						for(int j = 0; j<i; j++) {
							q.add(q.get(j));
						}
						flag = false; // ���� ū���� �ƴϴ�.
						break; // ���� ū���� �� �����οŰܾ��Ѵ�.
					}
					
				}
				
				if(flag == false) { // ���� ū���� �ƴϹǷ� �ٽ� ã�ƶ�
					continue;
				}
				cnt++; // ����ū����� ã�Ҵ�
				
				//���� ū���� ���� ã�� ���� ������?
				if(curr[0] == M) {
					break;
				}
				
				
				
			}
			System.out.println(cnt);
			
		
			
		}
		
		
	}
}
