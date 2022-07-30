package _Algorithm.DFS;
import java.io.*;
import java.util.*;
public class P1245 {
	static int n,m,i,j,a[][],R,p[]= {1,1,1,0,0,-1,-1,-1},q[]= {1,0,-1,1,-1,-1,0,1},h[][];
	static boolean o(int x,int y,int v) {
		h[x][y]++;
		int i=0,X,Y,Z=a[x][y];
		boolean c=true;
		for(;i<8;) {
			X=x+p[i];
			Y=y+q[i++];
			if(X>=0&X<n&Y>=0&Y<m)
				if(h[X][Y]<1)
					if(a[X][Y]>v) {
						o(X,Y,a[X][Y]);
						return false;
					}else if(a[X][Y]==v) {
						c=o(X,Y,v);
					}
		}
		return c;
	}
	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer t=new StringTokenizer(r.readLine());
		n=Integer.parseInt(t.nextToken());
		m=Integer.parseInt(t.nextToken());
		a=new int[n][m];
		h=new int[n][m];
		for(;i<n;i++) {
			t=new StringTokenizer(r.readLine());
			for(j=0;j<m;a[i][j++]=Integer.parseInt(t.nextToken()));
		}
		for(i=0;i<n&R<2;i++) {
			for(j=0;j<m&R<2;j++) {
				if(h[i][j]<1) {
					System.out.print("o in "+i+","+j);
					o(i,j,a[i][j]);
				}
			}
		}
		System.out.println(R<2?"YES":"NO");
	}

}
/*
3 5
1 1 1 2 2
1 1 1 2 2
1 1 1 1 1
1 1 1 2 2
1 1 1 2 2
1 1 1 2 2

3 5
1 1 1 2 2
1 1 1 2 2
1 1 1 2 2
1 1 1 2 2
1 1 1 2 2
1 1 1 1 1
*/