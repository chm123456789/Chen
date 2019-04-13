package aer;

public class words {
	private static String str1="this is a test of java";
	@SuppressWarnings("unused")
	
    public static void main (String[] args) {
    	test1();
    	
    	
    }
	private static void test1() {
		// TODO Auto-generated method stub
		int count=0;
	
		for(int i=0;i<str1.length();i++)
		{
			if('s'==str1.charAt(i)) {
				count++;
			}
		}
		System.out.println("s出现的次数："+count);
	}
}