
import java.util.LinkedList;
public class Main {

	public static void main(String[] args) {
		System.out.println("hw6_1 : Ȳâ��");
		
		//(1)
		LinkedList<Integer> list1 = new LinkedList<Integer>();
		System.out.println("�ʱ� ���� = " + list1);
		
		//(2)
		for(int i = 1; i<=10; i++) {
			list1.add(i*10);
		}
		System.out.println("���� �� = " + list1);
		
		//(3)
		int[] indexArray = {9, 4, 3, 6, 0, 0, 0, 0, 1, 0};
		//������ �ε����� ������� indexArray�� �����Ѵ�.
		System.out.print("�������� = ");
		for(int i : indexArray) {//indexArray�� i�� ���� i��° ���Ҹ� �����Ѵ�.
			System.out.print(list1.remove(i));//remove()�� ��ȯ�� �޾Ƽ� ����Ѵ�.
			System.out.print(" ");	
		}
		System.out.println();
		
		System.out.println("���� �� = " + list1);
		System.out.println();
		
		//(4)
		MyLinkedList list2 = new MyLinkedList();
		System.out.println("�ʱ���� = " + list2);
		
		//(5)
		for(int i = 1; i<=10; i++) {
			list2.add(i*10);
		}
		System.out.println("���� �� = " + list2);
		
		//(6)
		System.out.print("�������� = ");
		for(int i : indexArray) {//indexArray�� i�� ���� i��° ���Ҹ� �����Ѵ�.
			System.out.print(list2.remove(i));//remove()�� ��ȯ�� �޾Ƽ� ����Ѵ�.
			System.out.print(" ");	
		}
		System.out.println();
		
		System.out.println("���� �� = " + list2);
		System.out.println();
		
		
	}

}
