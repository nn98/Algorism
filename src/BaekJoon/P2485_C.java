package BaekJoon;

import java.util.Scanner;

public class P2485_C {

	static int G(int a,int b) {
		for(;;) {
			int c=a%b;
			if(c==0)return b;
			a=b;
			b=c;
		}
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println(G(3,17));
		int n=s.nextInt();
	}

}
