package BaekJoon;

import java.util.Scanner;

public class P3460 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),m,i,j;
		for(;n-->0;) {
			m=s.nextInt();
			for(i=0,j=2;j>m;i++) {
				if(m%j!=0)System.out.print(i+" ");
				j*=2;
			}
		}
	}

}
