package BaekJoon.Math;

import java.util.Scanner;

public class P15501 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),i=0,a[]=new int[n],b[]=new int[n],j=0,r=0,x=0,y=0,X=0,Y=0;
		for(;i<n;) {
			a[i]=s.nextInt();
			if(a[i++]==1)X=x=i;
		}
		for(i=0;i<n;) {
			b[i]=s.nextInt();
			if(b[i++]==1) {
				y=i;
				Y=i-2;
			}
		}
		System.out.println(x+" "+y);
		for(i=0;++i<n;) {
			if(x>=n)x-=n;
			if(y>=n)y-=n;
//			r+=a[x]==b[y]?1:0;
			if(a[x]==b[y])r++;
			else break;
			x++;
			y++;
		}
		System.out.println("Straight: "+r);
		if(r==n-1) {
			System.out.println("good puzzle");
			return;
		}
		r=0;
		System.out.println(X+" "+Y);
		for(i=0;++i<n;) {
			if(X>=n)X-=n;
			if(Y<0)Y+=n;
//			r+=a[x]==b[y]?1:0;
			if(a[X]==b[Y])r++;
			else break;
			X++;
			Y--;
		}
		System.out.println("Back: "+r);
		System.out.println(r==n-1?"good puzzle":"bad puzzle");
//		System.out.println(x);
	}

}