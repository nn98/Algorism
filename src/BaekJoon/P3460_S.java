package BaekJoon;

import java.util.Scanner;

public class P3460_S {
	public static void main(String[]z){
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0) {
			int n=sc.nextInt(), i=0;
			while(n>0) {
				if((n&1)==1)
					System.out.print(i+" ");
				i++;
				n = n>>1;
			}
			System.out.println();
		}
	}
}
