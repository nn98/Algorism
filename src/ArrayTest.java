
import java.util.Scanner;

public class ArrayTest { //����Ŭ�� ArrayTest
	public static void main(String[] args) {
		System.out.println("hw3_1 : �ѵ���");
		
		int array[] = new int[10]; // 10���� ������ ������ �迭 array ����
		int sum = 0; //�հ� �ʱ�ȭ
		double avg = 0.0; //��� �ʱ�ȭ
		int above[]; //��� �̻� ���� ������ �迭 above ����
		
		Scanner scanner = new Scanner(System.in); //��ĳ�ʷ� �Է¹ޱ�
		System.out.println("10���� ������ �Է�: "); //�Է¾ȳ����� ���
		
		for(int i=0; i<10; i++)
			array[i] = scanner.nextInt(); //�Է¹��� ���� �迭�� ����
		
		
		//��� ���
		for(int i=0; i<array.length; i++) {
			sum += array[i]; // ����� ���ϱ� ���� ���� �� ���ϱ�
			avg = (double)sum/array.length; // ��� ���ϱ�
			System.out.println("��� = " + avg); // ��հ� ���
		}
		//��� �̻� ���
		for(int i=0; i<=array.length; i++) {
			if (array[i] >= avg) {//���� i�� ��պ��� ũ�ٸ�
				
			    /*above[] = i;//�迭 above�� ����*/
			}
			System.out.println("��� �̻� = " + above[i]); // ��� �̻��� �����迭 above ���
		}
		scanner.close(); //��ĳ�� �ݱ�

	}

}