package _Algorithm.Simple_Implementation;

import java.util.Arrays;
import java.util.Scanner;

public class P5073 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		for(;;) {
			String[]S=s.nextLine().split(" ");
			Arrays.sort(S);
			int a=Integer.parseInt(S[0]),b=Integer.parseInt(S[1]),c=Integer.parseInt(S[2]),d=(a==b?1:0)+(b==c?1:0);
			if(a+b+c<1)break;
			System.out.println(a+b>c?(d>1?"Equilateral":(d<1?"Scalene":"Isosceles")):"Invalid");
		}
	}

}
