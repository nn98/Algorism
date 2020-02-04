package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

public class P14501_3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
	    int[] t = new int[n + 1];
	    int[] p = new int[n + 1];
	    int[] dp = new int[n + 1];
	 
	    // http://mygumi.tistory.com/151
	 
	    for (int i = 1; i <= n; i++) {
	        t[i] = sc.nextInt();
	        p[i] = sc.nextInt();
	 
	        dp[i] = p[i];
	    }
	 
	    // dp[n] = n�϶����� ���� ����
	 
	    for (int i = 2; i <= n; i++) {
	 
	        for (int j = 1; j < i; j++) {
	 
	            if (i - j >= t[j]) {
	                dp[i] = Math.max(p[i] + dp[j], dp[i]);
	            }
	 
	        }
	 
	    }
	 
	    int max = 0;
	 
	    for (int i = 1; i <= n; i++) {
	        if (i + t[i] <= n + 1) {
	            if (max < dp[i]) {
	                max = dp[i];
	            }
	        }
	    }
	    System.out.println(Arrays.toString(t));
	    System.out.println(Arrays.toString(p));
	    System.out.println(Arrays.toString(dp));
	    System.out.println(max);
	}

}
