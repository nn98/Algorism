package _Algorithm.Brute_Force;

import java.util.Scanner;

public class P2503_2 {
	static int n,i,j,d[][];
	static char[]a=new char[3],b[];
	static boolean[]c=new boolean[10];
	static void o(int x) {
		if(x==3) {
			System.out.println(a);
		}
		else for(int k=0;++k<10;)
			if(!c[k]) {
				a[x]=(char)(k+'0');
				c[k]=true;
				o(x+1);
				c[k]=false;
			}
	}
	public static void main(String[]z) {
		Scanner s=new Scanner(System.in);
		o(0);
		n=s.nextInt();
		b=new char[n][];
		d=new int[n][2];
		for(;n-->0;b[n]=s.next().toCharArray(),d[n][0]=s.nextInt(),d[n][0]=s.nextInt());
	}
}