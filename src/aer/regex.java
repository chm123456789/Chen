package aer;

import java.util.regex.Pattern;

public class regex {
	
	 public static void main (String[] args) {

    	test1();
    	test3();
    	test6();
    	test8();
    	test9();
    	test10();}
    	
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
    	public static void test6()
    	{
    		 String s4="abcab435cabc"; 
    			 
    				System.out.println(s4.matches("(.*)(abc)")); 
    				 String s5="abcab435ca56"; 
        			 
     				System.out.println(s5.matches("(.*)(abc)")); 


    
	}
    	public static <Matcher> void test8()
    	{
    		 String  s8="ae256dd—w348e6";
    		 int[] arr=new int[20];
    		 Pattern p1=Pattern.compile("(\\d{1,4})");
    		 @SuppressWarnings("unchecked")
			Matcher m1= (Matcher) p1.matcher(s8);
    		 int i=0;
    		 while(((java.util.regex.Matcher) m1).find()) { 
    			 			 int j=0; 
    			  			 j=Integer.parseInt(((java.util.regex.Matcher) m1).group()); 
    			  			 arr[i]=j; 
    			  			 i++; 
    			  		 } 
    			  		 for(int k=0;k<i;k++) { 
    						 System.out.println("数组["+k+"]:"+arr[k]); 
    			 		 } 

    		 


    
	}
    	public static void test9()
    	{
    		 String s9="123chmpupelglwpupelsbjiushini"; 
    		Pattern p9=Pattern.compile("(pupel)");
    		java.util.regex.Matcher m9=p9.matcher(s9);
    		StringBuffer s10=new StringBuffer();
    		while(m9.find()) {
    			m9.appendReplacement(s10, "pupil");
    		}
    		System.out.println(s10); 
    
	}
    	public static <Matcher> void test10()
    	{
    		  
    		 		 String s8="%...%CXLL=add1,31,123.12%CXLL=add2,32,124%CXLL=,33,125.12%LL=-121.11"; 
    	 		 Pattern p3=Pattern.compile("(%CXLL=)(.*)(%)"); 
    			 Matcher m3=(Matcher) p3.matcher(s8); 
    				 StringBuffer s9=new StringBuffer(); 
    			 while(((java.util.regex.Matcher) m3).find()) { 
    		 				 s9.append(((java.util.regex.Matcher) m3).group()); 
    				 } 
    	 		 System.out.println("提取的字符串为："+s9); 

	}
    	
    	
    	
    	
    	
    	
    	
    	
    	
	
}
