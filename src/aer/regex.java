package aer;

import java.util.regex.Pattern;

public class regex {
	
	 public static void main (String[] args) {

    	test1();
    	test3();
    	test6();
    	test8();
    	test9();}
    	
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
    		 String  s8="ae256dd¡ªw348e6";
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
    						 System.out.println("Êý×é["+k+"]:"+arr[k]); 
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

    	
    	
    	
    	
    	
    	
    	
    	
    	
	
}
