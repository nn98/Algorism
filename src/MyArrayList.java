import java.util.Arrays;

public class MyArrayList {
	public MyArrayList(int capacity) {
		listArray = new int[capacity];
		listLength = 0;
	}
	
	public void add(int item) {
		listArray[listLength] = item;//�ǵڿ� ����
		listLength++;//���� ����
	}
	
	@Override
	public String toString() {
		String myArrayListString = "";//��ȯ�� ��Ʈ�� ��ü
		myArrayListString += "(";
		
		for(int i = 0; i < listLength - 1; i++) {//���������� 2��° ���ұ��� �ݺ��ϸ� ��Ʈ���� ���Ѵ�.
			myArrayListString += listArray[i];
			myArrayListString +=", ";
		}
		
		myArrayListString += listArray[listLength - 1];//������ ���� ��Ʈ���� ���Ѵ�.
		myArrayListString += ")";
		
		return myArrayListString;
	}
	
	//------------------------�߰��ڵ�--------------------------
	
	public void add(int index, int number) {//�迭 index�ڸ��� number�� �����Ѵ�.
		listLength++;//�����ؾ��ϹǷ� �������� �迭�� ũ�⸦ ������Ų��.
		
		for(int i = 1; i + index < listLength; i++) {//������ ������ ��� �־���Ѵ�.
			listArray[listLength - i] = listArray[listLength - i - 1];//�������� �����.
			System.out.println(Arrays.toString(listArray));
			//�������� ����� ������ add(0,888)�� ��� �迭�� ��� 1�� �ǹ�����.
			//listLength��° ���Ҹ� ����Ű����, listArray[listLength - 1]�� �����Ѿ� �Ѵ�.
		}
		
		listArray[index] = number;//�ݺ����� ���� ��� �ڸ���, number�� �����Ѵ�.
	}
	
	public int remove(int index) {//index�ڸ��� ���Ҹ� �����Ͽ�, ������ ���Ҹ� ��ȯ�Ѵ�.
		int removedNumber = listArray[index];//��ȯ�� ������ �����Ѵ�.
		
		for(int i = 0; index + i < listLength - 1; i++) {//�迭�� ��ҽ�Ų��.
			listArray[index + i] = listArray[index + i + 1];
			//���Ҹ� ���������, ���� �ڸ����� �� ���� �ڸ��� �����.
			//�̹����� []���� ���ڸ� ǥ���ϱ� ����, ������ listLength - 1 �̴�.
			//������ �迭��, index�� ���Ұ� ������� ���������� ũ�Ⱑ 1 ���� �迭�� �ȴ�.
		}
		
		listLength--;//�������ε� �迭�� ũ�⸦ ���ҽ�Ų��.
		
		return removedNumber;//�Լ��� �����ϸ�, ������ ��ȯ�Ѵ�.
	}
	private	int[] listArray;
	private	int listLength;

}
