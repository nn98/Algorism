
import java.io.*;
import java.util.*;
public class P21738 {
	static int n,m,i,j,a[][],b[],x,y,d[];
	static void o(int x) {
		j++;
		b[x]++;
		for(int i=0;i<n;i++)if(b[i]<1)o(i);
	}
	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer t=new StringTokenizer(r.readLine());
		n=Integer.parseInt(t.nextToken())+1;
		i=Integer.parseInt(t.nextToken());
		d=new int[i];
		j=Integer.parseInt(t.nextToken());
		a=new int[n][n];
		b=new int[n];
		for(;j-->0;) {
			t=new StringTokenizer(r.readLine());
			x=Integer.parseInt(t.nextToken());
			y=Integer.parseInt(t.nextToken());
			a[x][y]=a[y][x]=1;
		}
		for(;i>0;j=0,o(i),d[i]=j,i--);
		System.out.println(Arrays.toString(d));
	}

}
