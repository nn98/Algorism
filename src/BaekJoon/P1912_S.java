package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1912_S {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine()),arr[]=new int[n],r=0;
		StringTokenizer st=new StringTokenizer(br.readLine());
		for(int i=0;i<n;i++) arr[i]=Integer.parseInt(st.nextToken());
		r=arr[0];
		for(int i=1;i<n;i++) {
			if(arr[i-1]<0);
			else arr[i]+=arr[i-1];
			r=r>arr[i]?r:arr[i];
		}
		System.out.print(r);
	}
}