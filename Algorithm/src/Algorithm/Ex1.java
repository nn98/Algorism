package Algorithm;

public class Ex1 {
	static void print1(int[][] a) {
		for (int i = 0; i < a.length; ++i) {
			for (int j = 0; j < a[i].length; ++j)
				System.out.printf("%d ", a[i][j]);
			System.out.println();
		}
	}
	static void print2(int[][] a, int i, int j) {
		if(i==a.length) return;
		System.out.print(a[i][j]+" ");
		if(j==a[i].length-1) {
			System.out.println();
			print2(a,i+1,0);
		}
		else if(i<a.length && j<a[i].length) print2(a,i,j+1);
	}
	public static void main(String[] args) {
		int[][] a = {{ 1, 2, 3 }, {4, 5, 6}, {7, 8, 9} };
		print1(a);
		System.out.println();
		print2(a, 0, 0);
	}
}