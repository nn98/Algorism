package _Algorithm.Binary_Search;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P1654 {

	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		String[]s=r.readLine().split(" ");
		int n=Integer.parseInt(s[0]),m=Integer.parseInt(s[1]),a[]=new int[n],i=0,M=0,N=1,D;
		for(;i<n;a[i]=Integer.parseInt(r.readLine()),M=M>a[i]?M:a[i],i++);
		for(;N<M;) {
			D=N+(M-N)/2;
			long c=0;
			for(i=0;i<n;c+=a[i++]/D);
			if(c<m)M=D;
			else N=D+1;
		}
		System.out.println(M);
	}

}