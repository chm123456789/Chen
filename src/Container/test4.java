package Container;

import java.util.Iterator;
import java.util.LinkedList;

public class test4 {
	public static void main(String[] arg)
	{
		MyQue MyQue=new MyQue();//队列
		System.out.print("入队： ");
		MyQue.inQueue("一一");
		MyQue.inQueue("二二");
		MyQue.inQueue("三三");
		System.out.println(MyQue.toString());
		System.out.println("出队： ");
		if(!MyQue.isEmpty()) {
			MyQue.outQueue();
		}
		System.out.println(MyQue.toString());
		System.out.println();
		
		
		//---队列
		Stack sta=new Stack();
		System.out.println("入栈：");
		sta.inStack("惠敏");
		sta.inStack("惠云");
		sta.inStack("惠娟");
		sta.inStack("猪猪");
		System.out.println(sta.toString());
		System.out.println("出栈：");
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
	
	//入队操作
	public void inQueue(Object obj){
		linklist.addLast(obj);
	}
	
	//出队操作
	public void outQueue(){
		linklist.removeFirst();
	}
	
	//判断队列是否为空
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
//栈的实现
class Stack{
	private LinkedList<Object> linklist;
	public Stack() {
		linklist=new LinkedList<Object>();
	}
	//入栈操作
	public void inStack(Object obj) {
		linklist.addFirst(obj);
	}
	//出栈操作
		public void outStack() {
			linklist.removeFirst();
		}
	//判断栈是否为空
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












