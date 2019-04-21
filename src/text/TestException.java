package text;


class MyTool{
	public static int parseInt(String str)
	{
		int result=0;
		int i;
		for(i=0;i<str.length();i++) {
			
			char ch=str.charAt(i);
			result=result*10+ch-'0';
		}
		return result;
	}
}
public class TestException {
	public static void main(String[] args) {
		System.out.println(MyTool.parseInt("345a"));
		
	}

}