package aer;


public class word{
	@SuppressWarnings("unused")
	private static String str="this is a test of java";

	

	
    public static void main (String[] args) {

    	test1();
    	test2();
    }
    
	
	public static void test1(){
    int count=0;
  
	for(int i = 0;i<str.length();i++) {
    	if('s'==str.charAt(i))
    	{
    		count++;
    	}  
    	}
    	System.out.println("s出现的次数："+count);
  
	
	}
	public static void test2(){
	    int star=str.indexOf("test");
	    String s=str.substring(star,star+5);
	    System.out.println("取出："+s);
	  
		
		}
	
	
	
	
	
	
	
	
	
	
	
	
}