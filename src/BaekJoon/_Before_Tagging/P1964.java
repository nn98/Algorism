package BaekJoon._Before_Tagging;

class P1964 {
	public static void main(String[]z) {
		long n=new java.util.Scanner(System.in).nextInt(),r=5,a=3,b=1;
		for(;--n>0;r%=45678)r+=a++*2+b++;
		System.out.print(r);
	}
}