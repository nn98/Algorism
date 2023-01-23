package BaekJoon._Before_Tagging;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// ��Ʈ��ŷ DFS BFS

public class P6443 {

	static BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter w=new BufferedWriter(new OutputStreamWriter(System.out));
	static int n,m,k;
	static char[]p=new char[26],f=new char[1001],a;

	static void D(int x,int d)throws Exception{
		if(d==m) {
			System.out.println(String.valueOf(f));
			return;
		}
		for(int i=0;i<26;i++)
			if(0<p[i]) {
				p[i]--;
				f[d]=(char)('a'+i);
				D(i,d+1);
				p[i]++;
			}
	}

	public static void main(String[] args)throws Exception{
		n=Integer.parseInt(r.readLine());
		for(;k<n;k++) {
			a=r.readLine().toCharArray();
			m=a.length;
			for(char j:a)p[j-'a']++;
			D(0,0);
			for(int G=0;G<26;G++)p[G]=0;
		}
	}

}
