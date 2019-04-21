package text;

class MyException extends Exception{

	public MyException(String message) {
		super(message);
	}
	public String getMessage() {
		return String.format("\"%s\"", Thread.currentThread().getName())+"For input string:"+super.getMessage();
	}
	

	
		
	}
	

class MyTool{
	public static int parseInt(String str) throws MyException
	{
		int result=0;
		int i;
		for(i=0;i<str.length();i++) {
			
			char ch=str.charAt(i);
			if(ch>='0'&&ch<='9')result=result*10+ch-'0';
			else throw new MyException(str);
		}
		return result;
	}
}
public class TestException {
	public static void main(String[] args) {
		try {
			System.out.println(MyTool.parseInt("345a"));
			
		}catch(MyException e) {
			// TODO Auto-generated catch block
			 e.printStackTrace();
		}
	}

}