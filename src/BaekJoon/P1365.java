package BaekJoon;

import java.util.Scanner;

public class P1365 {

	//LIS ���������κм���
	//LIS������ �˾Ҿ��;
	static int n,a[],h[],i=0,r;
	static void o(int x,int v) {
		h[x]=v;
		r=h[x]>r?h[x]:r;
		for(int j=x+1;j<n;j++) {
			if(a[j]>a[x]&&h[j]<=v) {
				o(j,v+1);
			}
		}
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		a=new int[n];
		h=new int[n];
		for(;i<n;a[i++]=s.nextInt());
		for(i=0;i<n;i++)if(h[i]<1)o(i,1);
		System.out.print(n-r);
	}
}