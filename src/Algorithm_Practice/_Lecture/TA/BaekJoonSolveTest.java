package Algorithm_Practice._Lecture.TA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoonSolveTest {

	/***
	 
	 nahyunho1030
	 */
	public static void main(String[] args) throws IOException {
		String[]tesk= {"17293","10987","11024","10173","2864"},
				py= {"11720","5218","1718"};
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(r.readLine()),c,p,a;
		while(n-->0) {
			c=0;
			p=0;
			a=0;
			String in=r.readLine();
			boolean rr[]=new boolean[20000];
			while(!in.equals("0")) {
				boolean C=true,P=true;
				int t=Integer.parseInt(in);
				if(rr[t]) {
					System.out.println(in);
				}
				else {
					rr[t]=true;
					for(String i:tesk) {
						if(i.equals(in)) {
							C=false;
							break;
						}
					}
					if(C)
						c++;
					for(String i:py) {
						if(i.equals(in)) {
							P=false;
							break;
						}
					}
					if(P)
						p++;
					a++;
				}
				in=r.readLine();
			}
			System.out.println("총: "+a+", 대생세: "+c+", 파이썬: "+p);
			System.out.println(a+"\t"+p);
			System.out.println(a+"\t"+c);
		}
	}

}
