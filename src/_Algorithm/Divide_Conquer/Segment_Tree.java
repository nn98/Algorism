package _Algorithm.Divide_Conquer;

import java.util.Arrays;

public class Segment_Tree {

	static long n=6,m,h,i,j,a[]={3,1,6,4,5,2},t[];
	static long o(int n,int s,int e) {
		System.out.println(n+" "+s+" "+e+" "+Arrays.toString(t));
		if(s==e)return t[n]=a[s];
		else return t[n]=o(n*2,s,(s+e)/2)+o(n*2+1,(s+e)/2+1,e);
//		int m=(s+e)/2;
//		return t[n]=o(n*2,s,m)+o(n*2+1,m+1,e);
	}
	public static void main(String[] args) {
//		System.out.println(Math.round(Math.log(n)));
//		System.out.println(Math.pow(2,Math.round(Math.log(n))+1)-1);
//		t=new long[(int)Math.round(Math.pow(2,Math.round(Math.log(n))+1)-1)];
//		t=new long[(int)(2*n-1)];
//		���� �ڹٿ� log2�� ����! �ù�
		h=Math.round(Math.log(n)/Math.log(2));
		m=(1<<(h+1));
		System.out.println(m);
		t=new long[(int)m];
//		o(0,0,(int)m-1);
		o(1,0,5);
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(t));
	}

}