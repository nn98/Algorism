package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

public class P9252 {
	static int i,j,c[][]=new int[1001][1001];
	static StringBuffer f;
	static void o(int i,int j) {
		f.append(0);
		System.out.println(f);
	}
	public static void main(String[]z){
		Scanner s=new Scanner(System.in);
		String a=s.next(),b=s.next(),r="";
		for(;++i<=a.length();)for(j=0;++j<=b.length();)c[i][j]=a.charAt(i-1)==b.charAt(j-1)?c[i-1][j-1]+1:Math.max(c[i-1][j],c[i][j-1]);
		System.out.print(c[i-1][j-1]);
		o(0,0);
	}
}