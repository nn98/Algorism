package BaekJoon.DP;

import java.util.Scanner;

public class P11066_3 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),m,i,j,k,f[],u[],h[][];
		while(n-->0) {
			m=s.nextInt()+1;
			f=new int[m];
			u=new int[m];
			h=new int[m+1][m+1];
			for(i=0;++i<m;f[i]=s.nextInt(),u[i]=f[i]+u[i-1]);
			for(i=1;++i<m;)
				for(j=i;--j>0;) {
					h[j][i]=Integer.MAX_VALUE;
					for(k=j-1;k++<i;) {
						h[j][i]=Math.min(h[j][i],h[j][k]+h[k+1][i]);
					}
					h[j][i]+=u[i]-u[j-1];
				}
			System.out.println(h[1][m-1]);
		}
	}
}