package _Algorithm.Two_Pointer;

// �� ������ �̸����� �����غ��� ������ s ���� e �ΰ� �ϳ��� ���������鼭 ���� ��

import java.io.*;
import java.util.*;
public class P2531 {

	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer t=new StringTokenizer(r.readLine());
		int n=Integer.parseInt(t.nextToken()),d=Integer.parseInt(t.nextToken()),
				k=Integer.parseInt(t.nextToken()),c=Integer.parseInt(t.nextToken()),
				a[]=new int[n],i=0,j,R=0;
		for(;i<n;i++) {
			a[i]=Integer.parseInt(r.readLine());
			if(i+1>-k) {
				HashSet<Integer>s=new HashSet();
				for(j=i;i-j!=k;s.add(a[j--]));
				s.add(c);
				R=R>s.size()?R:s.size();
			}
		}
		System.out.println(R);
		for(i=0;i<k;i++) {
			
		}
	}

}
