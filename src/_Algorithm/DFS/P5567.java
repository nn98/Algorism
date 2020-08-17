package _Algorithm.DFS;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class P5567 {

	static int n,m,a[][],h[],i,j;
	static void o(int x,int c) {
		for(int i=0;i<n;i++) {
			if(a[x][i]>0) {
				if(h[i]==0) {
					m++;
					h[i]++;
				}
				if(c>0)o(i,0);
			}
		}
	}
	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter w=new BufferedWriter(new OutputStreamWriter(System.out));
		n=Integer.parseInt(r.readLine())+1;
		m=Integer.parseInt(r.readLine());
		a=new int[n][n];
		h=new int[n];
		while(m-->0) {
			char[]b=r.readLine().toCharArray();
			i=b[0]-'0';
			j=b[2]-'0';
			a[i][j]=a[j][i]=1;
		}
		for(int[]b:a)System.out.println(Arrays.toString(b));
		m=0;
		h[1]++;
		o(1,1);
		System.out.println(m);
	}

}
