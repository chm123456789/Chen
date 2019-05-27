package Container;

import java.util.HashMap;

public class test3 {
	public static void main(String[] args)
	{
		HashMap map=new HashMap();
		people p1=new people("¹þ¹þ",0);
		people p2=new people("¹¨¸ö",0);
		
		people p3=new people("·ç¸ñ",0);
		
		
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