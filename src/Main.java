

import java.util.ArrayList;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("lab5_1 : ������");
		
		//(1)
		ArrayList<Integer> list1 = new ArrayList<Integer>();//����
		for(int i = 1; i <= 10; i++) {//�ݺ����� 10�����鼭 ����
			list1.add(i);
		}
		System.out.println(list1);//���
		
		//(2)
		list1.add(10, 777);
		list1.add(0, 888);
		list1.add(5, 999);
		
		System.out.println(list1);//���
		
		//(3)
		int removedSum = 0;//remove()�� ��ȯ�� ������ ���� ����
		removedSum += list1.remove(12);
		removedSum += list1.remove(4);
		removedSum += list1.remove(0);
		
		System.out.print(list1);//���
		System.out.print(" ���� ���� �� = ");
		System.out.println(removedSum);
		System.out.println();
		
		//(4)
		MyArrayList list2 = new MyArrayList(100);
		
		for(int i = 1; i <= 10; i++) {//�ݺ����� 10�����鼭 ����
			list2.add(i);
		}
		System.out.println(list2);//���
		
		//------------------------�߰� �ڵ�----------------------
		//(5)
		list2.add(10, 777);
		list2.add(0, 888);
		list2.add(5, 999);
		
		System.out.println(list2);//���
		
		//(6)
		int myRemovedSum = 0;//remove()�� ��ȯ�� ������ ���� ����
		myRemovedSum += list2.remove(12);
		myRemovedSum += list2.remove(4);
		myRemovedSum += list2.remove(0);
		
		System.out.print(list2);//���
		System.out.print(" ���� ���� �� = ");
		System.out.println(myRemovedSum);
		System.out.println();
		
		
	}

}
