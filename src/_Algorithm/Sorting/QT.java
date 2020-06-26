package _Algorithm.Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class QT {

	static int n,a[],m,i,t;
	static void w(int i,int j) {
		t=a[i];
		a[i]=a[j];
		a[j]=t;
	}
	static void o(int s,int e) {
		if(s==e)return;
		int m=(s+e)/2;
		p(s,e,m);
		o(s,m-1);
		o(m+1,e);
	}
	static void p(int s,int e,int m) {
		int x=a[m];
		w(m,e);
		int i=-1,j=0;
		for(;s<e;s++) {
			if(a[s]>x)j++;
			else w(++i,j);
		}
		w(++i,e);
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		a=new int[n];
		for(;i<n;a[i++]=s.nextInt());
		System.out.println(Arrays.toString(a));
		o(0,n-1);
		System.out.println(Arrays.toString(a));
	}

}
// 6 2 1 4 6 5 3