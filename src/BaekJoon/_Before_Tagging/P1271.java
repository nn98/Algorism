package BaekJoon._Before_Tagging;

import java.math.*;
import java.util.*;
public class P1271 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		BigInteger m=new BigInteger(s.next()),n=new BigInteger(s.next());
		System.out.print(m.divide(n)+"\n"+m.mod(n));
	}
}