
public class MyLinkedList {

	private Node head;//����Ʈ ù��° ��带 ����ų ����
	private int listLength;//����Ʈ ����(��� ����)
	
	//��� ������ ǥ���ϴ� Ŭ����
	private class Node{
		String data;
		Node link;
	}

	//������ - ���� ����Ʈ ����
    public MyLinkedList() { 
    	this.head=null;
    	this.listLength=0;
    }
    
    //  add - �������� �Ű������� �޾� ����Ʈ �� �ڿ� ����
    public void add(int item) { 
    	Node newNode = new Node();//�� ��� ����
    	newNode.data = Integer.toString(item);// �� ��忡 ������ ����
    	newNode.link = null;// �� ����� ��ũ�� null ����
    	
    	if(head==null) {// ù ��尡 �ΰ��̸�
    		head=newNode;//�� ��带 ����
    		listLength++;// ����Ʈ ���� 1 ����
    	}
    	else {
    		Node temp=head;// temp�� ù ��� ����
    		while(temp.link!=null)//������ ���� �̵�
    			temp=temp.link;
    		temp.link=newNode;//������ ��� �ڿ� �� ��� �߰�
    		listLength++;// ����Ʈ ���� 1 ����    		
    	}	
    }
    
    //remove - �ε����� �Ű������� �޾� �ε��� ��ġ�� ���Ҹ� �����Ͽ� ����
    public int remove(int index) { 
    	String deleted1;//���� ��� ���ڿ� ����
    	int deleted2; //���� ��� ���� ����
    	
    	if(head==null)//���� ����Ʈ�� ���
    		return 1;
    	if(head.link==null)//����Ʈ ���Ұ� �ϳ��� ���
    	{
    		deleted1=head.data;//������ ������ ����
    		head=null;// �ϳ����� ������ ����
    		deleted2=Integer.parseInt(deleted1);//int�� ��ȯ�� ���� ����ȯ
        	listLength--;//����Ʈ ���� 1����
    		return deleted2;
    	}
    	
    	if(index==0)//�� �ճ�� �����ϱ�
    	{
    		deleted1=head.data;//������ ������ ����
    		head=head.link;//�� �ճ�� ����
    		deleted2=Integer.parseInt(deleted1);//int�� ��ȯ�� ���� ����ȯ
        	listLength--;//����Ʈ ���� 1����
    		return deleted2;
    	}
    	
    	else// �߰���� �����ϱ�
    	{
    		Node pre=head;//ù ��� ����
    		Node temp=head.link;// �ι�° ��� ����
    		
    		while(temp.link != null && index-1>0 )//��带 �̵�(�ε����� ����Ű�� ������)
    		{
    			pre= temp;//��� �̵�
    			temp=temp.link;// ��� �̵�
 			
    			index--;//�ε��� 1����
    		}
    		deleted1 = temp.data;//������ ������ ����
    		pre.link=temp.link;//temp ������ ����
    		
    		deleted2=Integer.parseInt(deleted1);//int�� ��ȯ�� ���� ����ȯ
        	listLength--;//����Ʈ ���� 1����
    		return deleted2;
    	}	
    }
    
    //  toString �������̵� - ����Ʈ ���ҵ��� ��ȣ ( ) �ȿ� ������ ���ڿ��� ���� - �ݵ�� [ ]�� �ƴ϶� ( )
    @Override
    public String toString() {
    	StringBuffer result = new StringBuffer("(");
    	Node temp = head;
    	if(listLength > 0) {
    		for(int i=0;i<listLength-1;i++) {
    			result.append(i+", ");
    			temp = temp.link;
    		}
    		result.append(temp.data);
    	}
    	result.append(")");
    	return result.toString();
    }
}
