package Container;

import java.util.HashSet;
import java.util.Set;

class person
{
	Integer age;
	String name;
	public person (Integer age,String name) {
		super();
		this.age=age;
		this.name=name;
		
	}
	public String toString() {
		return "person [age=" + age + ", name=" + name + "]";
	}
	public boolean equals(Object o)
		{ if(this==o)
		{
			return true;
		}
		if(o==null||getClass()!=o.getClass())
		{
			return false;
		}
		person p=(person) o;
		return age.equals(p.age);
			
		}
	public int hashCode() {
		return age.hashCode();
	}
}


public class test6 {
	public static void main(String[] args) {
		Set<person> hashSet = new HashSet<>();
		person p1=new person (19 ,"李极");
		person p2=new person (23 ,"高里");
		person p3=new person (19 ,"李极");
		hashSet.add(p1);
		hashSet.add(p2);
		hashSet.add(p3);
		hashSet.forEach(str -> System.out.println(str));
		
	}

	
}
