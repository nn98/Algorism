package BaekJoon;

public class P1918_4 {
	static N t=null;
	static class N {
		String v;
		N N;
		N(String v){
			this.v=v;
			this.N=t;
			t=this;
		}
		String peek() {
			return v;
		}
		String pop() {
			String v=this.v;
			t=t.N;
			return v;
		}
		boolean isL() {
			return N==null;
		}
	}
	static int O(String s) {
		int r=-1;
		if(s.equals("(")||s.equals(")"))
			r=0;
		if(s.equals("+")||s.equals("-"))
			r=1;
		if(s.equals("*")||s.equals("/"))
			r=2;
		return r;
	}
	public static void main(String[] args) {
//		StringBuffer s=new StringBuffer(new java.util.Scanner(System.in).next()),
//				r=new StringBuffer();
		String r="",s[]=new java.util.Scanner(System.in).next().split("");
		for(String i:s) {
			switch(O(i)) {
			case 0:
				break;
			case 1:
				break;
			case 2:
				break;
			default:
				r+=i;
			}
		}
	}

}
