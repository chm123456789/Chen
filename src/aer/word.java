package aer;


public class word{
	@SuppressWarnings("unused")
	private static String str="this is a test of java";

	

	
    public static void main (String[] args) {

    	test1();
    	test2();
    	test4();
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
	public static void test4(){
	    String[] ss=str.split("");
	    StringBuffer sb=new StringBuffer();
	    for(int i=0;i<ss.length;i++) {
	    	String s=ss[i].substring(0,1).toUpperCase()+ss[i].substring(1);
	    	sb.append(s);
	    }
		System.out.println(sb);
		}
	 
	
	
	
	
	
	
	
	
	
	
	
}