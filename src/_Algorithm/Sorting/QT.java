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
		if(s<e) {
			System.out.println("o\t"+s+" "+e);
			System.out.println(Arrays.toString(a));
			int m=(s+e)/2;
			o(s,m-1);
			o(m+1,e);
			p(s,e,m);
			System.out.println("\t"+Arrays.toString(a));
		}
	}
	static void p(int s,int e,int m) {
		System.out.println("\tp\t"+s+" "+e+" "+m);
		int x=a[m];
		w(m,e);
		int i=-1,j=0;
		for(;s<e;s++) {
			if(a[s]<x)w(++i,s);
			else j++;
			System.out.println("\t"+Arrays.toString(a));
		}
		w(++i,e);
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		a=new int[n];
		for(;i<n;a[i++]=s.nextInt());
		o(0,n-1);
	}

}
// 6 2 1 4 6 5 3
// 6 6 4 5 2 1 3