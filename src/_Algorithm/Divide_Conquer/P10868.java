package _Algorithm.Divide_Conquer;

import java.util.Arrays;
import java.util.Scanner;

public class P10868 {

	static int n,m,i,a[];
	static long[]t;
	static long o(int n,int s,int e) {
		if(s==e)return t[n]=a[s];
		int m=(s+e)/2;
		return t[n]=o(n*2,s,m)+o(n*2+1,m+1,e);
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		n=s.nextInt();m=s.nextInt();
		a=new int[n];
		for(;i<n;a[i++]=s.nextInt());
		for(i=1;i<n;i*=2);
		i*=2;
		t=new long[i];
		System.out.println(Arrays.toString(t));
	}

}
