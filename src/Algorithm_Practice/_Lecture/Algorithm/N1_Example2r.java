package Algorithm_Practice._Lecture.Algorithm;

public class N1_Example2r {
	static void print(int[] a) {
		for (int i : a) System.out.printf("%d ", i);
	}
	static void remove(int[] a, int index) {
		for (int i=index;i<a.length-1;i++) a[i]=a[i+1];
		a[a.length-1]=0;
	}
	public static void main(String[] args) {
		int[] a = new int[10];
		for (int i = 0; i < a.length; ++i)
			a[i] = i;
		remove(a, 5);
		print(a);
	}
}
