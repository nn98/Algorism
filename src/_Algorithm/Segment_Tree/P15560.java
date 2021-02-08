package _Algorithm.Segment_Tree;

import java.util.*;
import java.io.*;

public class P15560 {

	static int n,m,l,i,j,u,v,a[];
	static void o() {
		for(;j>1;j/=2,a[j]=a[j*2]+a[j*2+1]);
	}
	static int p(int n,int s,int e) {
		if(i>e|s<j)return 0;
		if(i<=s&e<=j)return a[n];
		int m=(s+e)/2;
		return p(n*2,s,m)+p(n*2+1,m+1,e);
	}
	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter w=new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer t=new StringTokenizer(r.readLine());
		n=Integer.parseInt(t.nextToken());
		m=Integer.parseInt(t.nextToken());
		u=Integer.parseInt(t.nextToken());
		v=Integer.parseInt(t.nextToken());
		for(l=1;l<n;l*=2);
		a=new int[l*2];
		t=new StringTokenizer(r.readLine());
		for(;i<n;j=l+i++,a[j]=Integer.parseInt(t.nextToken()),o());
		for(;m-->0;) {
			System.out.println(Arrays.toString(a));
			t=new StringTokenizer(r.readLine());
			n=Integer.parseInt(t.nextToken());
			i=Integer.parseInt(t.nextToken());
			j=Integer.parseInt(t.nextToken());
			switch(n) {
			case 0:
				
				break;
			default:
				n=l+i-1;
				a[n]=j;
				j=n;
				o();
			}
		}
		w.flush();
	}

}
