package aer;

public class regex {
	
	 public static void main (String[] args) {

    	test1();
    	test3();}
    	
    	public static void test1()
    	{String s="(0000)0000-0000";
		System.out.println(s.matches("\\(\\d{4}\\)\\d{4}\\-\\d{4}"));
	
    }
    	public static void test3()
    	{
    		 String s2="abcabcabc"; 
    			 
    		 		String s22=s2.replaceAll("(abc)(\\1)*","$1"); 
    				System.out.println(s22); 

    
	}
    
		
	
}
