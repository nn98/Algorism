package BaekJoon._Before_Tagging;

import java.util.*;

public class P16212_3 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),a[]=new int[n];
		for(;n-->0;a[n]=s.nextInt());
		Arrays.sort(a);
		for(int i:a)System.out.print(i+" ");;
	}
}