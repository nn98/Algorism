package BaekJoon.Segment_Tree;

import java.io.*;
import java.util.*;
public class P3653_2 {

	static int n,m,i,j,k,p,e,a[],b[];
	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter w=new BufferedWriter(new OutputStreamWriter(System.out));
		for(n=Integer.parseInt(r.readLine());n-->0;) {
			StringTokenizer t=new StringTokenizer(r.readLine());
			m=Integer.parseInt(t.nextToken());
			a=new int[m];
			for(j=0;j<m;a[m++]=m);
			i=Integer.parseInt(t.nextToken());
			t=new StringTokenizer(r.readLine());
			for(;i-->0;) {
				j=Integer.parseInt(t.nextToken());
			}
		}
	}

}
