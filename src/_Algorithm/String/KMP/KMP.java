package _Algorithm.String.KMP;

import java.util.Scanner;

public class KMP {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String[]a=s.next().split(""),b=s.next().split("");
		int n=s.nextInt(),h=a.length,g=b.length,f[]=new int[n],r[]=new int[h-g+1],be=0,m=0,i=0;
		while(be<=h-g) {
//			��ġ ���� m < ���� ���� g
//			a[be+m]�� ���� ��ġ
			if(m<g&a[be+m]==b[m]) {
				m++;
				if(m==g)r[i++]=be;
			}else
				if(m==0)be++;
				else {
					be+=(m-f[m-1]);
					m=f[m-1];
				}
		}
	}

}
