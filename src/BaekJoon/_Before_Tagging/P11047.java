package BaekJoon._Before_Tagging;

import java.util.Scanner;

public class P11047 {
	//�� �Է´پȹ޾Ƶ� �ǳ�
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),k=s.nextInt(),a[]=new int[n],c=0;
		for(int i=0;i<n;i++)if(k<=(a[i]=s.nextInt()))break;
		for(int i=0;i<n;i++)if(a[i]>k)n=i;
		while(k>0){
			c+=k/a[--n];
			k%=a[n];
		}
		System.out.print(c);
	}

}
