package _Algorithm.Segment_Tree;

import java.io.*;
import java.util.*;

public class Test03 {
	static int n,m,i=1,j,k,x,y,v,a[],b[],t[];
	static void o() {
		for(;x>1;x/=2,t[x]=t[x*2]+t[x*2+1]);
	}
	static void p() {
		if(x>=j)y=x-j;
		else {
			y=t[x*=2];
			if(v>=y) {
				x++;
				v-=y;
			}
			p();
		}
	}
	public static void main(String[]z)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter w=new BufferedWriter(new OutputStreamWriter(System.out));
		n=Integer.parseInt(r.readLine());
		a=new int[n];
		b=new int[n];
		for(;i<n;i*=2);
		j=i;
		t=new int[i*2];
		for(i=0;i<n;t[x=j+i++]=1,o());
		StringTokenizer T=new StringTokenizer(r.readLine());
		for(;k<n;b[k++]=Integer.parseInt(T.nextToken()));
		for(;--k>=0;) {
			v=b[k];
			p();
			a[y]=k;
			t[x=j+y]=0;
			o();
		}
		for(i=0;i<n;w.write(a[i++]+"\n"));
		w.flush();
	}
}