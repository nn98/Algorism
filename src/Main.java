
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
	System.out.println("hw6_1 : ��±�");
	
	
	//(1) Integer�� LinkedList ��ü(list1)�� �����ϰ� ����Ʈ ���
	LinkedList<Integer> list1 = new LinkedList<Integer>();
	System.out.println("�ʱ� ���� = "+list1);
	
	//(2) list1�� �� �ڿ� ���� 10, 20, 30, ..., 100�� ���ʴ�� �����ϰ� ����Ʈ ���
	int i2=10;
	for(int i=1;i<=10;i++) {
		list1.add(i2);
		i2= i2+10;
	}
	System.out.println("���� �� = "+list1);
			
	//(3) list1�κ��� �ε��� 9, 4, 3, 6, 0, 0, 0, 0, 1, 0 �� ���Ҹ� ���ʴ�� �����Ͽ� ����ϰ� ����Ʈ ���
	System.out.print("���� ���� = ");
	System.out.print(list1.remove(9)+" ");
	System.out.print(list1.remove(4)+" ");
	System.out.print(list1.remove(3)+" ");
	System.out.print(list1.remove(6)+" ");
	System.out.print(list1.remove(0)+" ");
	System.out.print(list1.remove(0)+" ");
	System.out.print(list1.remove(0)+" ");
	System.out.print(list1.remove(0)+" ");
	System.out.print(list1.remove(1)+" ");
	System.out.println(list1.remove(0)+" ");
	System.out.println("���� �� = "+list1);		
	System.out.println();
	
	
	// (4) MyLinkedList ��ü(list2)�� �����ϰ� ����Ʈ ���
	MyLinkedList list2= new MyLinkedList();
	System.out.println("�ʱ� ���� = "+list2);
	
	
	
	//(5) list2�� �� �ڿ� ���� 10, 20, 30, ..., 100�� ���ʴ�� �����ϰ� ����Ʈ ���
	for(int i=10;i<=100;i+=10)
		list2.add(i);
	
	System.out.println("���� �� = "+list2);
	
	
	//(6) list2�κ��� �ε��� 9, 4, 3, 6, 0, 0, 0, 0, 1, 0 �� ���Ҹ� ���ʴ�� �����Ͽ� ����ϰ� ����Ʈ ���
	System.out.print("���� ���� = ");
	System.out.print(list2.remove(9)+" ");
	System.out.print(list2.remove(4)+" ");
	System.out.print(list2.remove(3)+" ");
	System.out.print(list2.remove(6)+" ");
	System.out.print(list2.remove(0)+" ");
	System.out.print(list2.remove(0)+" ");
	System.out.print(list2.remove(0)+" ");
	System.out.print(list2.remove(0)+" ");
	System.out.print(list2.remove(1)+" ");
	System.out.println(list2.remove(0)+" ");

	
	System.out.println("���� �� = "+list2);
}


}

