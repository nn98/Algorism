package BaekJoon._Before_Tagging;

import java.util.Scanner;

public class P1021_4 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),m=s.nextInt(),a[]=new int[m],i=0,x=0,j,I,J,k=0,r=0;
		boolean[]b=new boolean[n];
		for(;i<m;a[i++]=s.nextInt()-1);
		for(;m>0;) {
			if(x==n)x=0;
			i=j=x;
			I=J=0;
			for(;;i++,j--,I++,J++) {
				System.out.println(i+" "+j+" "+x);
				if(i==n)i=0;
				if(j<0)j=n-1;
				if(a[k]==i) {
					System.out.println("i: "+a[k]+" "+i+" "+I);
					r+=I;
					m--;
					b[i]=true;
					x=i;
					k++;
					x++;
					break;
				}
				if(a[k]==j) {
					System.out.println("j: "+a[k]+" "+j+" "+J);
					r+=J;
					m--;
					b[j]=true;
					x=j;
					k++;
					x++;
					break;
				}
				if(b[i]) {
					I--;
					i++;
				}
				if(b[j]) {
					J--;
					j--;
				}
			}
		}
		System.out.print(r);
	}
}