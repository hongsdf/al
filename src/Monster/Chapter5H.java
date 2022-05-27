package Monster;

import java.io.*;
import java.lang.*;
import java.util.*;


public class Chapter5H {
	public static final Scanner scanner = new Scanner(System.in);
	public static final BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws Exception {
		int N = scanner.nextInt();

		// �� <����, �󵵼�> ���·� key-value�� ������ Map �ڷᱸ��
		TreeMap<Integer, Integer> frequencyMap = new TreeMap<>();

		for(int i = 0 ; i < N; i+= 1){
			// frequencyMap := ������ �Էµ� �������� �󵵼��� �����ϰ� �ִ�.
			int X = scanner.nextInt();
			// HashMap�� �ʱ�ȭ �ʿ��ϴ�
			if(!frequencyMap.containsKey(X)) {
				frequencyMap.put(X, 0);
			}
			int f = frequencyMap.get(X) + 1;
			frequencyMap.put(X, f);
			int num = frequencyMap.size();
			writer.write(String.format("%d %d\n",num,f));
		}

		writer.flush();
		writer.close();
	}

}
