package BaekJoon._Before_Tagging;

import java.math.BigInteger;
import java.util.Scanner;

public class P1225_2 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int i=0,j=0,a[][]=new int[2][10];
		for(;i<2;i++)
			for(char c:s.next().toCharArray())
				a[i][c-'0']++;
//		for(int[]c:a)System.out.println(Arrays.toString(c));
//		char[]a=s.next().toCharArray(),b=s.next().toCharArray();
//		Arrays.sort(a);
//		Arrays.sort(b);
		BigInteger r=BigInteger.ZERO;
		for(i=1;i<10;i++)
			for(j=1;j<10;j++)
				r=r.add(new BigInteger(""+i*j*a[0][i]*a[1][j]));
//		r=new BigInteger(""+(a[i]-'0')*(b[j]-'0'));
		System.out.print(r);
	}

}