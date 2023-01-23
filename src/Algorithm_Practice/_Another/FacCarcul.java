package Algorithm_Practice._Another;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class FacCarcul {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int n=Integer.parseInt(br.readLine());
		BigInteger N=new BigInteger("1");
		for(int i=1;i<=n;i++) {
			N=N.multiply(new BigInteger(""+i));
			if(i>=(n-100)) System.out.println(i+"!:	"+N);
		}
	}
}

/*
1!:		1
2!:		2
3!:		6
4!:		24
5!:		120
6!:		720
7!:		5040
8!:		40320
9!:		362880
10!:	3628800
11!:	39916800
12!:	479001600
13!:	6227020800
14!:	87178291200
15!:	1307674368000
16!:	20922789888000
17!:	355687428096000
18!:	6402373705728000
19!:	121645100408832000
20!:	2432902008176640000
21!:	51090942171709440000
22!:	1124000727777607680000
23!:	25852016738884976640000
24!:	620448401733239439360000
25!:	15511210043330985984000000
*/