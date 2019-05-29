package Container;

import java.util.Iterator;
import java.util.LinkedList;

public class test4 {
	public static void main(String[] arg)
	{
		MyQue MyQue=new MyQue();
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