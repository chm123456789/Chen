package Container;

public class test5 {
	public static final Object id=null;
public static void mian(String[] args)
{
	
}
}
class student implements Comparable<Object>{
	String  id ;
	String name;
	int count;
	public String  getId(){
		return id;
	}
	public void setId(String id) {
		this.id=id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count ) {
		this.count=count;
	}
	public String toString() {
		return "student [id=" + id + ", name=" + name + ", count=" + count + "]";
	}
	public student(String  id,String name,int count)
	{
		super();
		this.id=id;
		this.name=name;
		this.count=count;
	}
	@Override
	public int hashCode() {

		int result;

		result = (this.name == null ? 0 : this.name.hashCode());

		result += this.id.hashCode();

		return result;

	}

	@Override

	public boolean equals(Object o) {

		if (!(o instanceof test5)) {
			return false;
		}

		test5 s = (test5) o;

		if (this.id.equals(s.id)) {
			return true;
		} else {
			return false;
		}
	}

	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		
		student s = (student )o;

        int result = 0;

        result = this.count > s.count ? 1 : (this.count == s.count ? 0 : -1);

        return result;
	}}


















