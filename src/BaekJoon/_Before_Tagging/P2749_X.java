package BaekJoon._Before_Tagging;

import java.util.Scanner;

public class P2749_X {
	public static void main(String[]v){
		long n = new Scanner(System.in).nextLong();
		int f0=0, f1=1, f2=1, d=1000000, repeat=0;
		for(int i=2; i<=n; i++){
			f2 = (f1+f0)%d;
			if(f2%d==1 && f1%d==0){
				repeat = i-1;
				break;
			}
			f0 = f1;
			f1 = f2;
		}
		if(repeat>0){
			int newN = (int)(n%repeat);
			f0=0;
			f1=1;
			f2=1;
			for(int i=2; i<=newN; i++){
				f2 = (f1+f0)%d;
				f0 = f1;
				f1 = f2;
			}	
		}
		System.out.print(f2);
	}
}