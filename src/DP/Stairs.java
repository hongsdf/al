package DP;

import java.util.Scanner;

/*
  45656이란 수를 보자.

	이 수는 인접한 모든 자리의 차이가 1이다. 이런 수를 계단 수라고 한다.

	N이 주어질 때, 길이가 N인 계단 수가 총 몇 개 있는지 구해보자. 0으로 시작하는 수는 계단수가 아니다.
  
  	문제를 보고 '인접'이라는 단어를 살펴보자 
  	연속이라는 단어와 비슷하여 해당 인덱스 +1,-1만 비교하는 것이다.
  	
  	n= 1이면 답이 9이다.
  	이유는 ? _ 한칸을 채울수 잇는 것은 0~9중 숫자인데 0으로 시작하는 것은 없다하여 1~9
  	
  	
  	 일단 
  	 2D 다이나믹이다 이유?
  	 [i]칸을 기준으로 이웃한 []가 여러가지올 수 잇으므로 문제에서 제시하는 변수는 2가지
  	 그래서 2D를 구현
  	 
  	 n :  N은 1보다 크거나 같고, 100보다 작거나 같은 자연수
  
  	number123과차이
 	d[i][2] = d[i-2][1] + d[i-2][3];
 	d[i-2][1] :이 부분에서 [i-2][] 한칸 전단계를 의미하며 , 직전단계에서 2를 사용하지 x은경우 1,3사용 
 	한칸전에 1,3을 사용했고, i-2 : 2를 사용하지 x 
 
 	d[i][j] += d[i-1][j-1];
 	d[i-1][j-1] : d[i-1] :한칸 전 단계에 j-1을 사용했다.
 
 * */
public class Stairs {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt() ;
		int d[][] = new int[n+1][10];
//		한칸 초기화 1~9
		for(int i = 1; i<=9; i++) {
			d[1][i] = 1;
			// [ _ ][] : 첫번째 칸에는 1~9
		}
		
		for(int i = 2; i<=n; i++) {
			for(int j =0; j<=9; j++) {
				/* i번째를 j로 완성했다면, i-1은 j-1 || j+1 로 완성할 수 있다. */
				if(j -1 >=0) { // 예외 처리
					d[i][j] += d[i-1][j-1]; 
				}
				if(j+1 < 10) {
					d[i][j] += d[i-1][j+1];
				}
				d[i][j] %= 1000000000L;
				
			}
		}
		long ans = 0;
		// n까지 의 모든 경우의수
		for(int i = 0; i<=9; i++) {
			ans += d[n][i]; // n자리까지 오기까지 i는 0~9 숫자가 온다
			// 앞에는 완성되어잇는 나머지 부분
		}
		System.out.println(ans % 1000000000L);
		
	}
}
