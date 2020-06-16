package _Algorithm.Segment_Tree;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class P1849_4 {
	static int n,m,i,j,a[],t[],x,e,p;
	static void u() {							// i �ε���, m ��, -j  ũ���� ��?-
		x=j+i-1;								// ũ���� �� + �ε��� - 1 			��: 8+1-1 = 8
		t[x]=m;									// ��� �ε����� ��					��: t[8]=0;
		for(;x>1;x/=2,t[x]=t[x*2]+t[x*2+1]);	// �赦�� 1���� Ŭ ���� 2�� ������		�� �ù� Ʈ������°ų� �׳�
	}
	static int f(int x,int v) {
		if(x>=j)return x-j+1;
		int p=t[x*2];
		if(v<p)return f(x*2,v);
		return f(x*2+1,v-p);
	}
	public static void main(String[]z)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter w=new BufferedWriter(new OutputStreamWriter(System.out));
		n=Integer.parseInt(r.readLine());
		a=new int[n+1];
		for(i=1;i<n*2;i*=2);
		t=new int[i];
		j=i/2;
		m=1;
		for(i=0;i++<n;)u();
		m=0;
		for(;e++<n;) {
			p=Integer.parseInt(r.readLine());				//�� �Է¹ް�
			i=f(1,p);										//�ش� �� Ž��
			System.out.println("\t"+i);						//Ž���ؼ� ã�� �ε�����
			a[i]=e;											//����迭�� ���� ī��Ʈ
			System.out.println("\t"+Arrays.toString(a));
			System.out.println("\t"+Arrays.toString(t));
			u();											//�ش� �ε��� 0 �ʱ�ȭ, Ʈ�� ����
			System.out.println("\t"+Arrays.toString(t));
		}
		for(i=0;i++<n;w.write(a[i]+"\n"));
		w.flush();
	}
}