package _Algorithm.Two_Pointer;

public class P2018_2 {

    public static void main(String[] args) {
	int n=new java.util.Scanner(System.in).nextInt(),i=1,j=1,u=0,r=0;
	for(;j<n;) {
	    System.out.println(u);
	    while(u<n)u+=j++;
	    while(u>n)u-=i++;
	    if(n==u) {
		r++;
		u-=i++;
	    }
	}
	System.out.println(r);
    }

}
