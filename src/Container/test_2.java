package Container;

import java.util.HashMap;
import java.util.Map;


public class test_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Stu1, String> map = new HashMap<Stu1, String>();
		
		Stu1 s1 = new Stu1("刘里",20);
		Stu1 s2 = new Stu1("小夏",19);
		Stu1 s3 = new Stu1("娜娜",18);
		map.put(s1,"归属地：澳大利亚");
		map.put(s2,"归属地：伦敦");
		map.put(s3,"归属地：英国");
		System.out.println("KeySet遍历:");
		for(@SuppressWarnings("unused") Stu1 key:map.keySet())
			{
			System.out.println(key+"  "+map.get(key));
			}
		System.out.println();
	
	}		
	
}
   class Stu1
   {
	String name;
	int age;
	
	public Stu1(String name, int age)
	{
		super();
		this.name = name;
		this.age = age;
			
	}
	
		public String getName()
		{
			return name;
		}
	
		public void setName(String name)
		{
		this.name = name;
			}
		public int getAge()
		{
			return age;
		}
		public void setAge(int age)
		{
			this.age=age;
		}
		public String toString() {
			return "Student_1 [name=" + name + ", age=" + age + "]";
		}}

   

