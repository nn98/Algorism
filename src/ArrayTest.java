
import java.util.*;

public class ArrayTest { //����Ŭ�� ArrayTest
	public static void main(String[] args) {
		System.out.println("hw3_2 : Ȳâ��");
		 int[] array1 = {10, 20, 30, 999, 50, 60, 999, 70, 999, 90};
     int[] array2 = {90, 20, 30, 40, 50, 60, 70, 10};
     int[] array3 = {-20, -30, -40, -50, -60, -70, -80, -90, -10};
     
     arrayPrint(array1);
     System.out.println();
     System.out.println("�ִ밪 �ε��� = " + arrayPoint(array1)  + "�ִ밪 = " +array1[arrayPoint(array1)]);
     System.out.println();
     arrayPrint(array2);
     System.out.println();
     System.out.println("�ִ밪 �ε��� = " + arrayPoint(array2)  + "�ִ밪 = " +array2[arrayPoint(array2)]);
     System.out.println();
     arrayPrint(array3);
     System.out.println();
     System.out.println("�ִ밪 �ε��� = " + arrayPoint(array3)  + "�ִ밪 = " +array3[arrayPoint(array3)]);

	}

	public static void arrayPrint(int[] array) {
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i] + " ");
		}
	}
	public static int arrayPoint(int[] array) {
		int arrayflag = 0;
		int indexflag = 0;
		for(int i=0;i<array.length;i++) {
			if (arrayflag < array[i]) {
				arrayflag = array[i];
				indexflag = i;
			}
			
		}
		return indexflag;
	}
}

