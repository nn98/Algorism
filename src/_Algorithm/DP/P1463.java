package _Algorithm.DP;

public class P1463 {

	public static void main(String[] args) {
		int n=new java.util.Scanner(System.in).nextInt(),i=2,d[]=new int[n+1];
		for(;i<=n;i++) {
			d[i]=d[i-1]+1;
			if(i%2==0)d[i]=Math.min(d[i],d[i/2]+1);
			if(i%3==0)d[i]=Math.min(d[i],d[i/3]+1);
		}
		System.out.println(d[i]);
	}

}
