package BaekJoon.Math;
import java.util.*;
public class P3474{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		long n=s.nextInt(),a,b,c,d,e,f;
		while(n-->0) {
			a=s.nextInt();
			c=0;
			b=d=1;
			while(++b<=a){
				System.out.print(b+": "+d+" * "+b+" = "+d*b+" "+" -> ");
				d*=b;
				e=1;
				f=0;
				while(d%(e*=10)==0)f++;
//				c+=d%10==0?1:0;
				c+=f;
				while(d%10==0)d/=10;
				if(d>10)d%=10;
				System.out.println(d+" ++"+f+" r="+c);
			}
			System.out.println(c);
		}
	}
}