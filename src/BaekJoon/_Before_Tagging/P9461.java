package BaekJoon._Before_Tagging;

import java.util.Scanner;

public class P9461 {
	//One try
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),i=2;
		long[]a=new long[100];
		a[0]=a[1]=a[2]=1;
		for(;++i<100;a[i]=(a[i-3]+a[i-2]));
		for(;n-->0;)System.out.println(a[s.nextInt()-1]);
	}
}