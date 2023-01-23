package BaekJoon.Stack;

import java.util.Stack;

public class P2504_2 {

	public static void main(String[] args) {
		char b;
		int c=0,d=0,r=0;
		Stack<Character>s=new Stack();
		for(char a:new java.util.Scanner(System.in).next().toCharArray()) {
			System.out.println(a+" "+c+" "+d+" "+r);
			switch(a) {
			case '(':
				s.push(a);
				if(c!=0) {
					d+=c;
					c=0;
				}
				break;
			case '[':
				s.push(a);
				if(c!=0) {
					d+=c;
					c=0;
				}
				break;
			case ')':
				b=s.pop();
				if(b=='[') {
					System.out.print(0);
					return;
				}
				if(c==0)c=2;
				else {
					if(s.isEmpty()) {
						r+=c;
						c=0;
					}
//					if(d!=0)c+=d;
//					d=0;
					c*=2;
				}
				break;
			case ']':
				b=s.pop();
				if(b=='(') {
					System.out.print(0);
					return;
				}
				if(c==0)c=3;
				else {
					if(s.isEmpty()) {
						r+=c;
						c=0;
					}
//					if(d!=0)c+=d;
//					d=0;
					c*=3;
				}
				break;
			}
		}
		r+=c;
		System.out.print(r);
	}

}
