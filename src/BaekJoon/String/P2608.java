package BaekJoon.String;

import java.util.Scanner;

public class P2608 {
	static class N{
		int v;
		String s;
		N(int v,String s){
			this.v=v;
			this.s=s;
		}
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String a[]=new String[2],d;
		int i=0,j,v=0,x=0,r=0,p=11;
		N c[]=new N[p];
		for(;i<2;a[i++]=s.next());
		i=0;
		boolean e;
		c[i++]=new N(1,"I");
		c[i++]=new N(4,"IV");
		c[i++]=new N(5,"V");
		c[i++]=new N(10,"X");
		c[i++]=new N(40,"XL");
		c[i++]=new N(50,"L");
		c[i++]=new N(100,"C");
		c[i++]=new N(400,"CD");
		c[i++]=new N(500,"D");
		c[i++]=new N(900,"CM");
		c[i++]=new N(1000,"M");
		for(;x<2;x++) {
			System.out.println(x);
			for(i=0;i<a[x].length();i++) {
				v=0;
				e=true;
				if(i==a[x].length()-1) {
					d=a[x].substring(i);
					for(j=0;j<p;j++)
						if(c[j].s.equals(d)) {
							System.out.println(d+" "+c[j].v);
							v+=c[j].v;
							break;
						}
				}else {
					d=a[x].substring(i,i+2);
					for(j=0;j<p;j++)
						if(c[j].s.equals(d)) {
							System.out.println(d+" "+c[j].v);
							v+=c[j].v;
							i++;
							break;
						}
					if(j==p){
						d=a[x].substring(i,i+1);
						for(j=0;j<p;j++)
							if(c[j].s.equals(d)) {
								System.out.println(d+" "+c[j].v);
								v+=c[j].v;
								break;
							}
					}
				}
				r+=v;
			}
			System.out.println(r);
		}
		System.out.println(r);
	}
}
