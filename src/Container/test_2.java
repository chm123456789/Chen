package Container;

import java.util.HashMap;
import java.util.Map;


public class test_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Stu1, String> map = new HashMap<Stu1, String>();
		
		Stu1 s1 = new Stu1("����",20);
		Stu1 s2 = new Stu1("С��",19);
		Stu1 s3 = new Stu1("����",18);
		map.put(s1,"�����أ��Ĵ�����");
		map.put(s2,"�����أ��׶�");
		map.put(s3,"�����أ�Ӣ��");
		System.out.println("KeySet����:");
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

   

