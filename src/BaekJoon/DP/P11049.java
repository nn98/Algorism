package BaekJoon.DP;

import java.util.Scanner;
public class P11049 {
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),a=s.nextInt(),b=s.nextInt(),c=s.nextInt(),d=s.nextInt(),e=s.nextInt(),f=s.nextInt();
		System.out.println(Math.min(a*b*d+a*d*f,c*d*f+a*b*f));
	}
}