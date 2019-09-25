package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class P9935_T {
	//�ù�
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//		Scanner sc = new Scanner(System.in);
		String input = br.readLine();
		String bomb = br.readLine();

		Stack<Character> stack = new Stack<>();

		for(int i=input.length()-1; i>=0; i--) {
			boolean isBomb = false;
			char c = input.charAt(i);

			stack.push(c);

			if(c == bomb.charAt(0) && stack.size()>= bomb.length()) {
				isBomb = true;
				for(int j=0 ;j<bomb.length() ;j++) {
					if( bomb.charAt(j) != stack.get(stack.size()-1-j)) {
						isBomb = false;
						break;
					}
				}
				if (isBomb) {
					for(int k=0; k<bomb.length(); k++) {
						stack.pop();
					}
				}
			}
		}

		StringBuffer sb = new StringBuffer();
		if(stack.isEmpty()) System.out.println("FRULA");
		else {
			for(int i=stack.size()-1 ; i>=0 ; i--) {
				//				System.out.print(stack.get(i));
				sb.append(stack.pop());
			}
		}
		System.out.println(sb);


	}
}