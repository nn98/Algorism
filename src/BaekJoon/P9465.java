package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P9465 {

	static int n,m,a[][],l,i,j;
	static boolean[][]h;
	static void o(int x,int v,int c) {
		if(x==m)l=l>v?l:v;
		else {
			o(x+1,v,0);
			if(c!=1)o(x+1,v+a[0][x],1);
			if(c!=2)o(x+1,v+a[1][x],2);
		}
	}
	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		n=Integer.parseInt(r.readLine());
		m=Integer.parseInt(r.readLine());
		for(;n-->0;) {
			a=new int[2][m];
			h=new boolean[2][m];
			for(i=0;i<2;i++) {
			StringTokenizer t=new StringTokenizer(r.readLine());
			for(j=0;j<m;a[i][j]=Integer.parseInt(t.nextToken()));
			o(0,0,0);
			System.out.println(l);
			l=0;
			}
		}
	}
}