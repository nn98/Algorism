package _Algorithm.Sorting;

import java.util.Scanner;

public class P10825 {

	static String w;
	static int x,y,z;
	static class P implements Comparable<P>{
		String n;
		int a,b,c;
//		p(int a,int b,int c){
//			a=a;
//		}
		P(){
			n=w;
			a=x;
			b=y;
			c=z;
		}
		@Override
		public int compareTo(P p) {
			if(a==p.a) {
				if(b==p.b) {
					if(c==p.c)
						return n.compareTo(p.n);
					return c-p.c;
				}
				return p.b-b;
			}
			return a=p.a;
		}
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
	}

}
