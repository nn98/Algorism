package _Algorithm.Two_Pointer;

import java.util.Arrays;
import java.util.Scanner;

public class P8726 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),m=s.nextInt(),i=0,j,c=1,v=0,r=n;
		s.nextLine();
		String[]a=s.nextLine().split(" ");
		for(;i<n;) {
			if(a[i].equals("0")) {
				j=i+1;
				while(c<m&j<n) {
					if(a[j].equals("1")) {
						v++;
					}else {
						c++;
					}
					j++;
				}
				r=r<v?r:v;
				System.out.println(v);
			}
			for(;++i<n-1&a[i].equals("1");v--);
			c--;
		}
		System.out.println(r);
	}

}
