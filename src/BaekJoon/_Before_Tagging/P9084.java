package BaekJoon._Before_Tagging;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//TimeOver

public class P9084 {
	static int n,m,p,a[],h[],i,c;
	static boolean[][]H;
	static void o(int x,int v) {
		if(v==p)c++;
		else if(v>p)return;
		else if(x==m)return;
		else {
			if(H[x][v])return;
			else H[x][v]=true;
			System.out.println(v);
			o(x,v+a[x]);
			o(x+1,v);
			//			o(x+1,v);
		}
	}
	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		for(n=Integer.parseInt(r.readLine());n-->0;) {
			m=Integer.parseInt(r.readLine());
			StringTokenizer t=new StringTokenizer(r.readLine());
			a=new int[m];
			for(i=0;i<m;a[i++]=Integer.parseInt(t.nextToken()));
			p=Integer.parseInt(r.readLine());
			H=new boolean[m][p];
			c=0;
			o(0,0);
			System.out.println(c);
		}
	}
}