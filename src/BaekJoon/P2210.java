package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2210 {

	static boolean[][]h=new boolean[5][5];
	static String[][]a=new String[5][];
	static int i=0,l=6,r,x[]= {0,1,0,-1},y[]= {1,0,-1,0};
	static void o(int x,int y,StringBuffer f) {
		f.append(a[x][y]);
		if(f.length()==6);
	}
	public static void main(String[] args) throws IOException {
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		for(;i<5;a[i++]=r.readLine().split(" "));
	}
}