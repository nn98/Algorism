package BaekJoon;

import java.util.Scanner;

public class P1672 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),i=0;
		char[]a=s.next().toCharArray(),b[]=new char[20][20];
		b[0][0]=b[6][19]=b[19][6]=b[0][2]=b[2][0]=65;
		b[2][2]=b[0][6]=b[6][0]=67;
		b[6][6]=b[0][19]=b[19][0]=b[2][6]=b[6][2]=71;
		b[0][0]=b[0][0]=b[0][0]=84;
		for(;i++<n;a[i]=b[a[i-1]-65][a[i]-65]);
		System.out.println(a[n-1]);
	}
}