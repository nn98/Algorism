package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;
//!!!
public class P10989 {
	//���� ���ǳ�Ʈ ���� ���� - ����
	static void swap(int[] a,int i,int j) {
		int k=a[i];
		a[i]=a[j];
		a[j]=k;
	}

	static void sol(int[] arr) {
		int N=1,index=0;
		int[] in=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			
		}
	}

	public static void countingSort(int[] a, int nth) {
		int[] count = new int[16]; // 16���� count�� �ʿ���.
		for (int value : a) {
			int digit = value >> (nth * 4) & 0xF; // nth �ڸ��� ���� ����
		++count[digit]; // digit �� count ����
		}
		// nth �ڸ��� ���� �������� ���� ���� ��, �� ���� ���� ��ġ ���
		int[] index = new int[16]; // ���� ��ġ �迭
		index[0] = 0;
		for (int i = 1; i < index.length; ++i)
			index[i] = index[i - 1] + count[i - 1];
		// ������ ����� ���� ��ġ�� ����Ͽ� ������ temp �迭�� ������. �� ������.
		int[] temp = new int[a.length];
		for (int value : a) {
			int digit = value >> (nth * 4) & 0xF;
		temp[index[digit]++] = value;
		}
		// ���ĵ� temp �迭�� ���� �Է� �迭�� ����
		for (int i = 0; i < a.length; ++i)
			a[i] = temp[i];
	}
	public static void radixSort(int[] a) {
		for (int i = 0; i < 8; ++i)
			countingSort(a, i);
	}
	public static void main(String[] args) {
		//int[] a = { 8, 6, 2, 9, 1, 0, 10, 5, 3, 11, 12, 4, 7, 13, 14 };
		//System.out.println(Arrays.toString(a));
		
		//System.out.println(Arrays.toString(a));
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		int[] arr=new int[N];
		for(int i=0;i<N;i++) arr[i]=s.nextInt();
		radixSort(arr);
		for(int i=0;i<N;i++) System.out.println(arr[i]);
	}

}
