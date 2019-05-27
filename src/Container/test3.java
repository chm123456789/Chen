package Container;

import java.util.HashMap;
import java.util.Scanner;

public class test3 {
	public static void main(String[] args)
	{
		HashMap<Integer, Integer> map=new HashMap();
		people p1=new people("哈哈",1);
		@SuppressWarnings("unused")
		people p2=new people("龚个",2);
		
		people p3=new people("风格",3);
		map.put(1, 0);
		map.put(2, 0);
		map.put(3, 0);
		Scanner sc=new Scanner(System.in);
		System.out.println("输入十个选举人所投候选人号数：");
		String temp =sc.nextLine();
		String[] t=temp.split(" "); 
		int[] count=new int[20];
		for(int i=0;i<t.length;i++)
		{
			count[i]= Integer.parseInt(t[i]);
						
		}
		for(int i=0;i<count.length;i++)
		{
			Integer j=(Integer) map.get(count[i]);
			if(map.containsKey(count[i]))
				map.put(count[i],++j);
		}
		map.forEach((key,value)->System.out.println(key+"票数为："+value+"票"));
	}

}
class people
{
	String name;
	int count;
	public people (String name,int count)
	{
		super();
		this.name=name;
		this.count=count;
	}
	}