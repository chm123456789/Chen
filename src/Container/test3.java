package Container;

import java.util.HashMap;

public class test3 {
	public static void main(String[] args)
	{
		HashMap map=new HashMap();
		people p1=new people("����",0);
		people p2=new people("����",0);
		
		people p3=new people("���",0);
		
		
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