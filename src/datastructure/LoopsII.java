package datastructure;

import java.util.*;
import java.io.*;

public class LoopsII {
public static void main(String []argh){
		 Scanner in = new Scanner(System.in);
		 int t = in.nextInt();
		 for(int i=0;i<t;i++){
			 int a = in.nextInt(); // ù°��
			 int b = in.nextInt(); // ����
			 int n = in.nextInt(); // ���� ����
			 int num = 0;
			 int j =1;
			 while(n >0) {
				 num +=  j*b; 
				 System.out.println(num+a);
				 j *= 2;
				 n--;
				 
			 }

			
		 }
		 in.close();
	 }
}		            
		            
	