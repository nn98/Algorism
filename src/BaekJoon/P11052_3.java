package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

public class P11052_3 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),a[]=new int[n+1],h[]=new int[n+1],i=0,j;
		for(;i++<n;a[i]=s.nextInt());
		h[1]=a[1];
		for(i=2;i<=n;i++) {
			for(j=1;j<=i-j;j++) {
				h[i]=a[i]>h[j]+h[i-j]?a[i]:h[j]+h[i-j];
				
			}
		}
		System.out.print(Arrays.toString(h));
	}
}