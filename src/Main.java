public class Main {

	public static void main(String[] args) {
		System.out.println("hw3_2: ������");
		
		//���� �迭
		int[] array1 = {10, 20, 30, 999, 50, 60, 999, 70, 999, 90};
		int[] array2 = {90, 20, 30, 40, 50, 60, 70, 10};
		int[] array3 = {-20, -30, -40, -50, -60, -70, -80, -90, -10};
		
		// printArr ȣ�� �� �迭�� ���� ����ϱ�
		printArr(array1);
		System.out.println();
		
		//max ȣ�� �� array1�� �ִ밪�� �ε����� ����
		int maxIndex1 = max(array1);
		System.out.print("�ִ밪 �ε��� = " + maxIndex1 + " "); // �ε���
		System.out.print("�ִ밪 = " + array1[maxIndex1]); // �ִ밪
		System.out.println();
		
		
		printArr(array2);
		System.out.println();
		
		int maxIndex2 = max(array2);
		System.out.print("�ִ밪 �ε��� = " + maxIndex2 + " "); // �ε���
		System.out.print("�ִ밪 = " + array2[maxIndex2]); // �ִ밪
		System.out.println();
		
		
		printArr(array3);
		System.out.println();
		
		int maxIndex3 = max(array3);
		System.out.print("�ִ밪 �ε��� = " + maxIndex3 + " "); // �ε���
		System.out.print("�ִ밪 = " + array3[maxIndex3]); // �ִ밪
		System.out.println();
	}

		// ���� �迭�� �Ű� ������ �޾Ƽ� �迭 ���Ҹ� ��� ���
		private static void printArr(int[] array) {
			for (int i = 0; i < array.length; i++) { // �迭 ���� ��ŭ �ݺ��� ��� ���
				System.out.print(array[i] + " ");
			}
		}
		
		// ���� �迭�� �Ű� ������ �޾Ƽ� �ִ밪 ���� �ε����� ����
		
		private static int max(int[] array) {
			int maxIndex = 0;
			int maxValue = array[0]; 
			
			
			for(int i = 1; i < array.length; i++) {		// i = 1
				if (maxValue < array[i]) {
						maxValue = array[i];
						maxIndex = i;
				}
			}
			return maxIndex;	
		}
}
