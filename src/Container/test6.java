package Container;
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
		
		
	}

	
}
