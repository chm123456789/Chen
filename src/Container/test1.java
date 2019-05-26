package Container;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;


	
	class Stu extends Object implements Comparable<Stu> {
	int s;
	String name;
	int score;
	
	public Stu(int s, String name,int score)
	{
		super();
		this.s=s;
		this.name=name;
		this.score=score;
		
	}
	public int compareTo(Stu st) {
				// TODO Auto-generated method stub
				if (this.s == st.s)
						return 0;
				else if (this.score == st.score) {
						if (this.name.compareTo(st.name) == 0)
							return this.s - st.s;
							return this.name.compareTo(st.name);
		} else
					return this.score - st.score;
			}
	
			@Override
			public String toString() {
					return "Student [stuNo=" + s + ", name=" + name + ", score=" + score + "]";
				}
}

public class test1 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
			// TODO Auto-generated method stub

			Set<Stu> set=new TreeSet<Stu>();
				
				
			Set<Stu> set1 = new TreeSet<Stu>();

			Stu s1 = new Stu(1, "小花", 60);
			set.add(s1);
			Stu s2 = new Stu(2, "小红", 70);
		    set.add(s2);
		    Stu s3 = new Stu(3, "小竹签", 80);
			set.add(s3);

			//用迭代器输出学生对象
			Iterator<Stu> it=set.iterator();
			while(it.hasNext())
			{
				Stu s4=it.next();
			}
			System.out.println(set);
		}

}

