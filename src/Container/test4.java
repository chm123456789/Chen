package Container;

import java.util.Iterator;
import java.util.LinkedList;

public class test4 {
	public static void main(String[] arg)
	{
		MyQue MyQue=new MyQue();//����
		System.out.print("��ӣ� ");
		MyQue.inQueue("һһ");
		MyQue.inQueue("����");
		MyQue.inQueue("����");
		System.out.println(MyQue.toString());
		System.out.println("���ӣ� ");
		if(!MyQue.isEmpty()) {
			MyQue.outQueue();
		}
		System.out.println(MyQue.toString());
		System.out.println();
		
		
		//---����
		Stack sta=new Stack();
		System.out.println("��ջ��");
		sta.inStack("����");
		sta.inStack("����");
		sta.inStack("�ݾ�");
		sta.inStack("����");
		System.out.println(sta.toString());
		System.out.println("��ջ��");
		if(!sta.isEmpty()) {
			sta.outStack();
		}
		
		System.out.println(sta.toString());
	}

}
class MyQue{
	
private LinkedList<Object> linklist;
	
	public MyQue(){
		linklist = new LinkedList<Object>();
	}
	
	//��Ӳ���
	public void inQueue(Object obj){
		linklist.addLast(obj);
	}
	
	//���Ӳ���
	public void outQueue(){
		linklist.removeFirst();
	}
	
	//�ж϶����Ƿ�Ϊ��
	public boolean isEmpty(){
		return linklist.isEmpty();
	}
	
	@Override
	public String toString() {
		Iterator<Object> iterator = linklist.iterator();
		while(iterator.hasNext()){
			System.out.print(iterator.next() + "    ");
		}
		return null;
	}}
//ջ��ʵ��
class Stack{
	private LinkedList<Object> linklist;
	public Stack() {
		linklist=new LinkedList<Object>();
	}
	//��ջ����
	public void inStack(Object obj) {
		linklist.addFirst(obj);
	}
	//��ջ����
		public void outStack() {
			linklist.removeFirst();
		}
	//�ж�ջ�Ƿ�Ϊ��
		public boolean isEmpty() {
			return linklist.isEmpty();
			
		}
		public String toString() {
			Iterator<Object> iterator=linklist.iterator();
			while(iterator.hasNext()) {
				System.out.println(iterator.next()+" ");
			}
			return  null;
		}
}












